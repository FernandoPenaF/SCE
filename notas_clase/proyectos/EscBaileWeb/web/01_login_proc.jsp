<%-- 
    Document   : 01_login_proc.jsp
    Created on : 16/05/2008, 07:28:19 PM
    Author     : RGGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="escdebaile.ClsGestorEscBaile"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>JSP Page</title>
    </head>
    
    <body>
      <%
          response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
          response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
          response.setDateHeader("Expires", 0); // Proxies.
          
          ClsGestorEscBaile gestor = null;
                 
          java.io.PrintWriter pr = response.getWriter();
          
          gestor = new ClsGestorEscBaile();
          
          if( gestor.conectaBD(request.getParameter("username"), request.getParameter("pwd") ) )
          {
             session.setAttribute("elGestor", gestor);
             request.getRequestDispatcher("02_menuEscBaile.html").forward(request, response);   
          }
          else
          {
              session.removeAttribute("elGestor");
              pr.println("<br>No se pudo establecer la conexión a la base de datos...<br>");              
          }
                             
        %>
    </body>

</html>

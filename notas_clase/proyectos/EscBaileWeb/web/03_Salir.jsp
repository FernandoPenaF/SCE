<%-- 
    Document   : 03_Salir
    Created on : 1/03/2017, 12:53:13 PM
    Author     : rafael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="escdebaile.ClsGestorEscBaile"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salir</title>
    </head>
    <body>
      <h1>Salir</h1>
      <%
          response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
          response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
          response.setDateHeader("Expires", 0); // Proxies.
          
          if( session.getAttribute("elGestor") != null )
          {
               ((escdebaile.ClsGestorEscBaile)session.getAttribute("elGestor")).desconecta();
                 session.removeAttribute("elGestor");
                 session.invalidate();
          }     
        
          request.getRequestDispatcher("/01_login.html").forward(request, response);  
      %>      

    </body>
</html>

<%-- 
    Document   : procMenu
    Created on : 16/02/2017, 01:12:34 PM
    Author     : rafael
--%>

<%@page import="escdebaile.ClsGestorEscBaile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>procMenu</title>
    </head>
    <body>
    <%
      response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
      response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
      response.setDateHeader("Expires", 0); // Proxies.
      
      ClsGestorEscBaile gestor = ((escdebaile.ClsGestorEscBaile) session.getAttribute("elGestor")); 
      if(gestor != null)
      {
        if( gestor.conectado() )
        {      
          //request.getRequestDispatcher("/opc_20_altaAlumno.html").forward(request, response);
          
          if (request.getParameter("ListaAlumnos") != null)
          {
            request.getRequestDispatcher("/opc_10_listaAlumnos.jsp").forward(request, response);
          } 
          else if (request.getParameter("AltaAlumno") != null) 
          {
            request.getRequestDispatcher("/opc_20_altaAlumno.html").forward(request, response);
          }  
          else if (request.getParameter("ModificaAlumno") != null) 
          {
            request.getRequestDispatcher("/opc_30_modificaAlumno.html").forward(request, response);  
          } 
          else if (request.getParameter("ListaBailes") != null) 
          {
            request.getRequestDispatcher("/opc_40_listaBailes.html").forward(request, response);
          }
          else if (request.getParameter("AltaBaile") != null) 
          {
            request.getRequestDispatcher("/opc_50_altaBaile.html").forward(request, response);
          }
          else if (request.getParameter("ModificaBaile") != null) 
          {
            request.getRequestDispatcher("/opc_60_modificaBaile.html").forward(request, response);
          }
          else if (request.getParameter("ListaGrupos") != null) 
          {
            request.getRequestDispatcher("/opc_70_listaGrupos.html").forward(request, response);
          }
          else if (request.getParameter("AltaGrupo") != null) 
          {
            request.getRequestDispatcher("/opc_80_altaGrupo.html").forward(request, response);
          }
          else if (request.getParameter("ModificaGrupo") != null) 
          {
            request.getRequestDispatcher("/opc_90_modificaGrupo.html").forward(request, response);
          }
          else if (request.getParameter("Salir") != null) 
          {
            request.getRequestDispatcher("/03_Salir.jsp").forward(request, response);
          }
        }
      }
        request.getRequestDispatcher("/01_login.html").forward(request, response);  
    %>      
        <h1>En esta página jsp se procesan las opciones de menú y solamente es un dispatcher</h1>
    </body>
</html>

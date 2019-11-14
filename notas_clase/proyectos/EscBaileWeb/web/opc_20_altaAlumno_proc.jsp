<%-- 
    Document   : opc_10_altaAlumno_proc.jsp
    Created on : 1/03/2017, 10:55:47 AM
    Author     : rafael
--%>

<%@page import="escdebaile.ClsGestorEscBaile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado del requerimiento de alta de alumno</title>
    </head>
    <body>
        <h1>opc_02_altaAlumno_proc</h1>
        <%
           java.io.PrintWriter pr = response.getWriter();
            
           response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
           response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
           response.setDateHeader("Expires", 0); // Proxies.
      
           ClsGestorEscBaile gestor = ((escdebaile.ClsGestorEscBaile) session.getAttribute("elGestor")); 
           if(gestor != null)
           {
              if( gestor.conectado() )
              {          

                   String[] arr_nomCampos = new String[4];
                   String[] arr_valCampos = new String[4];

                   arr_valCampos[0] = request.getParameter("strCveAlumno");
                   arr_valCampos[1] = request.getParameter("strNombre");
                   arr_valCampos[2] = request.getParameter("strPrimerApellido");
                   arr_valCampos[3] = request.getParameter("strSegundoApellido");

                   arr_nomCampos[0] = "clvAlumno";
                   arr_nomCampos[1] = "nombre";
                   arr_nomCampos[2] = "apPaterno";
                   arr_nomCampos[3] = "apMaterno";
                   
                   if( gestor.altaAlumno(arr_nomCampos, arr_valCampos))
                   {
                       
                      pr.println("<br><br><H2>Se hado de alta el alumno:");
                      escdebaile.MiModelo mm = gestor.obtenModeloAlumno(arr_valCampos[0]);
                      for( int col = 0; col < mm.getColumnCount(); col++ )
                      {
                          pr.println("<br>" + mm.getColumnName(col) + ":" + (String) mm.getValueAt(0, col) );
                      }  
                   }
                   else
                   {
                       pr.println("<br><br><H2>NO SE HA REGISTRADO el alumno:");
                      for( int col = 0; col < arr_valCampos.length; col++ )
                      {
                          pr.println("<br>" + arr_nomCampos[col] + ":" + arr_valCampos[col] );
                      }  
                       
                   }
           
              }
           }
        
        %>
      <br><br><br>
      <br><br><a href="http:./02_menuEscBaile.html">Regresar al menú principal</a>       
    </body>
</html>

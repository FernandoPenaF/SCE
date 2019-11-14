<%-- 
    Document   : respLoginDto
    Created on : 16/05/2008, 07:28:19 PM
    Author     : RGGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <%@page import="escdebaile.ClsGestorEscBaile"%>

    <body>
    <%
        
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setDateHeader("Expires", 0); // Proxies.

      java.io.PrintWriter pr = response.getWriter();
      escdebaile.MiModelo elModelo;
      
      ClsGestorEscBaile gestor = ((escdebaile.ClsGestorEscBaile) session.getAttribute("elGestor")); 
      
      if( gestor.conectado() )
      {         
             java.sql.ResultSet r;
             r = gestor.obtenAlumnos();
             escdebaile.MiModelo mm = new escdebaile.MiModelo( r );
             try
             {
                r.close();
             }
             catch( Exception e )
             {
               e.printStackTrace();
             }

             int ren,col,mRen,nCol;
             mRen = mm.getRowCount();
             nCol = mm.getColumnCount();
             pr.println("<h2>Página opc_10_listaAlumnos.jsp</h2>");
             pr.println("<br><h3>Contenido de la tabla de alumnos</h3>");
             pr.println("<br><Form action='opc_10_listaAlumnos_proc.jsp'>");
             pr.println("<table border='1'><tr>");
             pr.println("<th>Click</th>");
             for(col=0; col< nCol; col++ )
                 pr.println("<th>" + mm.getColumnName(col) + "</th>");
             pr.println("</tr>");
             for( ren = 0; ren < mRen; ren++ )
             {
               //pr.println("<br><TR><td>" + mm.getValueAt(ren, 0) + "</TD>");                
               pr.println("<td><input type='radio' name='cve' value='" + mm.getValueAt(ren,0) + "'/></td>");                

               for( col = 0; col < nCol; col++ )
               {
                  pr.println( "<TD>" + mm.getValueAt( ren,col) + "</TD>" );    
               }                    
               pr.println("</TR>");
             }
             pr.println("</table>");
             pr.println("<br><input type='submit' value='ModDatosDeAlumno' name='btnModDatosAlumno'/>");                
            pr.println("</form>");
      }
      else
      {
         request.getRequestDispatcher("/01_login.html").forward(request, response);               
      }                        
    %>
      <br><br><br>
      <br><br><a href="http:./02_menuEscBaile.html">Regresar al menú principal</a>
    </body>

</html>

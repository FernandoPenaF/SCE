<%-- 
    Document   : respModDatosAlumno
    Created on : 18/05/2008, 09:45:25 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="escdebaile.ClsGestorEscBaile"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>opc_10<-listaAlumnos_proc.jsp</title>
    </head>
    <body>
        <%
          response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
          response.setHeader("Pragma","no-cache"); //HTTP 1.0 
          response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
        %>
        
        <!--
        <h2>opc_11_listaAlumnos_proc.jsp:
        <br>Comande desde esta jsp la modificación de los datos del alumno. 
        <br>Los datos del alumno están almacenados en el request.
        <br>Elabore la funcionalidad necesaria en el gestor e invóquela desde aquí
        <br>con los datos apropiados. </h2>
        -->
        
        <%
           java.io.PrintWriter pr = response.getWriter();
          
           String clvAlumno = request.getParameter("cve");
           pr.write("<H2><br><br>Modificar los datos del alumno clave:" + clvAlumno + "</H2>");
          
           ClsGestorEscBaile gestor = ((escdebaile.ClsGestorEscBaile) session.getAttribute("elGestor")); 
           if( gestor != null )
           {          
             if( gestor.conectado() )
             {       
               if( clvAlumno != null )
               {    
                 String strNomDatos[], strDatos[];
                 int col,numCampos;

                 escdebaile.MiModelo mm = gestor.obtenModeloAlumno(clvAlumno);
                 numCampos = mm.getColumnCount();
                 strNomDatos = new String[numCampos];
                 strDatos    = new String[numCampos];

                 pr.println("<br><form name='frmModDatosAlumno' action='opc_11_listaAlumnos_proc.jsp'>");
                 pr.println("<h3>");
                 for( col = 0; col < numCampos; col++ )
                 {
                   strNomDatos[col] = mm.getColumnName(col);
                   strDatos[col]    = (String) mm.getValueAt(0, col);  
                   if( strNomDatos[col].trim().toLowerCase().startsWith("clv") )
                   {
                     pr.println("<input type='hidden' name='clv' value='" + clvAlumno + "'/>");  
                   }
                   else
                   {           
                       pr.println("    <br>" + strNomDatos[col] + ":" + 
                           "<input type='text' name='" + strNomDatos[col] + 
                                             "' value='" + strDatos[col] + "' />");    
                   }
                 }
                 pr.println("<br><input type='submit' value='Modificar' name='btnModDatos'/>");
                 pr.println("</h3>");
                 pr.println("</form>");
                         
               }
               else
               {
                 pr.println("<H2>Se debe seleccionar una fila para poder modificar los datos</H2>");
               }     
             }
           } 
        %>
      <br><br><br>
      <br><br><a href="http:./02_menuEscBaile.html">Regresar al menú principal</a>
</body>


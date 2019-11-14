<%-- 
    Document   : modDatosAlumno
    Created on : 16/05/2008, 08:56:22 PM
    Author     : RGGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modDatosAlumno</title>
    </head>
    <%@page import="escdebaile.ClsGestorEscBaile"%>
    <body>
      
    <%
      ClsGestorEscBaile gestor = ((escdebaile.ClsGestorEscBaile) session.getAttribute("elGestor")); 
      
      if( gestor != null )
      {       
        java.io.PrintWriter pr = response.getWriter();
        String strCve, strValor,strNomDatos[], strDatos[];
        int col,numCampos;
        
        strCve = request.getParameter("clv");
        
        escdebaile.MiModelo mm = gestor.obtenModeloAlumno(strCve);
        numCampos = mm.getColumnCount();
        strNomDatos = new String[numCampos];
        strDatos    = new String[numCampos];
        
        for( col = 0; col < numCampos; col++ )
        {
           strNomDatos[col] = mm.getColumnName(col);
           strDatos[col]    = (String) mm.getValueAt(0, col);           
           if( !strNomDatos[col].trim().toLowerCase().startsWith("clv") )
           {           
             strValor = request.getParameter(strNomDatos[col]);
             mm.setValueAt(strValor, 0, col);
           }
        }
        if( gestor.modificaAlumno(mm))
        {
            pr.println("<H1>Se han modificado los datos del alumno</H1>");
            mm = gestor.obtenModeloAlumno(strCve);
            for( col = 0; col < numCampos; col++ )
            {
               strNomDatos[col] = mm.getColumnName(col);
               strDatos[col]    = (String) mm.getValueAt(0, col);           
               pr.println("<br>" + strNomDatos[col] + ":" + strDatos[col] );
            }  
        }
        else
        {
            pr.println("<br>No se modificaron los datos del alumno clave " + strCve);
        }
      }
    %>
    <br><br><br>
    <br><br><a href="http:./02_menuEscBaile.html">Regresar al menú principal</a>
    </body>
</html>

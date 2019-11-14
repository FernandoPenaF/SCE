/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael
 */
import escdebaile.*;

public class tstGestorEscDeBaile 
{
   public static void main(String args[])
   {
      String cveAlumno = "Alum00002"; 
      ClsGestorEscBaile gestor = new ClsGestorEscBaile();
      gestor.conectaBD("rafa","rafa");
      if( gestor.conectado())
      {
           System.out.println("OK");
           escdebaile.MiModelo mm = gestor.obtenModeloAlumno(cveAlumno);
           gestor.desconecta();
      }
      else
      {
          System.out.println("Error al conectar a la base de datos...");
      }
   }
}

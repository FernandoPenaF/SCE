/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepcionesAplicativas;

/**
 *
 * @author Rafael
 */

/*
       //
       //  tomado de 
       //
       // https://stackoverflow.com/questions/442747/getting-the-name-of-the-currently-executing-method
       //
       
         final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

         // System. out.println(ste[ste.length-depth].getClassName()+"#"+ste[ste.length-depth].getMethodName());
         // return ste[ste.length - depth].getMethodName();  //Wrong, fails for depth = 0
       int depth = 1;  
       System.out.println("Nombre del metodo actual: " + ste[ste.length - 1 - depth].getMethodName()); //Thank you Tom Tresansky
*/

public class ExcepcionAplicativa extends Exception
{
    long               Num_Codigo = 0;
    String             strDonde;
   
    java.sql.Timestamp ts;
    
    /**
     *
     * @param unNum_Codigo
     * @param e
     */
    public ExcepcionAplicativa(long unNum_Codigo, Exception e,String strDesc)
    {
        super(e.getMessage()); //,e.getCause());
        this.Num_Codigo = unNum_Codigo;
        final StackTraceElement[] ste   = e.getStackTrace();
        
        int depth = 1;
        strDonde = ste[ste.length - 1 - depth].getMethodName();
        ts = new java.sql.Timestamp( System.currentTimeMillis());
    }
    
    @Override
    public String toString()
    {
        return new String(new StringBuffer("Exepcion Aplicativa: ").
                          append(ts.toString()).
                          append(" ...").
                          append(super.toString()).
                          append(" ... ").
                          append(this.Num_Codigo).
                          append(" en el metodo ").
                          append(strDonde));
    }
    
}
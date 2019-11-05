package utileriabd;

/*
 * ClsCampoBD.java
 *
 * Created on 20 de noviembre de 2004, 03:45 PM
 */

/**
 *
 * @author  Administrador
 */
public class ClsCampoBD
{
// ---------------------------------------------------------------------------    
    public static String TIPO_VARCHAR  = "VARCHAR",
                         TIPO_MONEDA   = "MONEDA",
                         TIPO_DATE    =  "DATE",
                         TIPO_INTEGER  = "INTEGER";
    
    public String nombre   = null;
    public String valor    = null;
    public String tipo     = null;
    public String valWhere = null;
// ---------------------------------------------------------------------------        
    /** Creates a new instance of ClsCampoBD */
    public ClsCampoBD()
    {
    }
    
// ---------------------------------------------------------------------------    
    public ClsCampoBD( String unNombre, String unValor, 
                       String unTipo, String unValWhere )
    {
      this.asignaDatos( unNombre, unValor, unTipo, unValWhere );
    }
// ---------------------------------------------------------------------------    
    public String toString()
    {
      String strRes = null;
      strRes = this.getClass().getName()      + '\n' +
               "nombreCampo = " + this.nombre + '\n' +
               "valorCampo  = " + this.valor  + '\n' +
               "tipoCampo   = " + this.tipo   + '\n' +
               "valWhere    = " + this.valWhere + '\n';
        return strRes;
    }
// --------------------------------------------------------------------------- 
    public void asignaDatos( String unNombreCampo, String unValor, 
                             String unTipo, String unValWhere )
    {
        this.nombre   = unNombreCampo;
        this.valor    = unValor;
        this.tipo     = unTipo;
        this.valWhere = unValWhere;
    }
// ---------------------------------------------------------------------------    
   public String codificaDato( String strDato )
   {
      String strRes = strDato; 
      if( this.tipo.compareToIgnoreCase( ClsCampoBD.TIPO_DATE    ) == 0 )
        strRes = '\'' + strRes + '\'';
      if( this.tipo.compareToIgnoreCase( ClsCampoBD.TIPO_VARCHAR ) == 0 )
        strRes = '\'' + strRes + '\'';
      return strRes; 
   }
// ---------------------------------------------------------------------------    
// ---------------------------------------------------------------------------    
   public static void main( String args[])
   {
      System.out.println("Hola...");
      ClsCampoBD campo = new ClsCampoBD();
      campo.nombre = "cu";
      campo.valor = "8472";
      campo.tipo = ClsCampoBD.TIPO_VARCHAR;
      campo.valWhere = "";
      
      System.out.println( campo );
      
    
   }
// ---------------------------------------------------------------------------        
}

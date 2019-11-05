package tda;


import utileriabd.MiModelo;

/*
 * ClsGestorTda.java
 */

/**
 *
 * @author  RGGH
 */
public class ClsGestorTda
{
    ClsTienda tda;
// ---------------------------------------------------------------------------    
    public ClsGestorTda ()
    {
       tda = new ClsTienda();
    }
// ---------------------------------------------------------------------------        
    public boolean login(String strUsuario, String strContrasenha )
    {
        return tda.login (strUsuario, strContrasenha );
    }
// ---------------------------------------------------------------------------        
    public boolean conectado() 
    {
        return tda.conectado();
    } 
// --------------------------------------------------------------------------- 
   public void logout()
   {
     tda.logout();  
   }
// --------------------------------------------------------------------------- 
    
// ---------------------------------------------------------------------------
   public MiModelo obtenModeloEntidad( String strEntidad, String strCondicion )
   {
      // Operación solamente de utilería, para asistir al desarrollo eliminarla en producción
      // NOTA: Obsérvese la manera en que se opera la condición en strCondicion (lleva el campo y el valor.
      MiModelo elModelo = tda.obtenModeloEntidad(strEntidad, strCondicion);
      return elModelo;
   }
// ---------------------------------------------------------------------------
   public MiModelo obtenModeloEntidades(String strEntidad)
   {
      // Operación solamente de utilería, para asistir al desarrollo eliminarla en producción
      // NOTA: Está hecho para obtener un modelo con la totalidad de registros de una entidad.
      MiModelo elModelo = tda.obtenModeloEntidades(strEntidad);
      return elModelo;
   }
// ---------------------------------------------------------------------------
public String[] clavesCustomers()
{
    return tda.clavesCustomers();
}
public String[] clavesProducts()
{
    return tda.clavesProducts();
}
// ---------------------------------------------------------------------------    
//                            Alta de entidades de negocio 
// ---------------------------------------------------------------------------
   public boolean altaCUSTOMER(long cveCustomer, String strPais)
   {
       return tda.altaCUSTOMER(cveCustomer, strPais);
   }

   public boolean altaPRODUCT(String cveProduct, String strDescription, double dblPU)
   {
       return tda.altaPRODUCT(cveProduct, strDescription, dblPU);
   }
// ----------------------------------------------------------------------------
//            Búsqueda de entidades de negocio
// ----------------------------------------------------------------------------   
  public Customer buscaCustomer( String strCustomerID)
  {
      return null;
  }
  
  public Prod buscaProd( String strStockCode )
  {
      return null;
  } 
// ---------------------------------------------------------------------------    
//                            FIN de funcionalidad del gestor 
// ---------------------------------------------------------------------------
}
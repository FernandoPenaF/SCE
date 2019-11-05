/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cltesTda;


import tda.ClsGestorTda;
import tda.Customer;
import tda.Prod;

/**
 *
 * @author rafael
 */
public class ClsClteTdaPojo
{ 
   // para no repetir la extracción de catálogos de claves de clientes y de productos (uno por jvm)
   public static String[] arr_cvesCustomers = null;
   public static String[] arr_cvesProducts = null; 
   public static int numCltes  = 0;
   public static int numProds = 0;
   public static boolean todo_cargado = false;
   
   public static boolean IMPRIME_CATALOGOS = false;
   
   public static synchronized void solicitaCatalogos(ClsGestorTda gestor)
   {
       if( ! todo_cargado )
       {
         arr_cvesCustomers = gestor.clavesCustomers();
         numCltes = arr_cvesCustomers.length;
         if( IMPRIME_CATALOGOS ) 
           for(int k = 0; k < numCltes; k++ )
             System.out.println("CveCustomers[" + k + "] = " + arr_cvesCustomers[k]);
                       
         arr_cvesProducts = gestor.clavesProducts();
         numProds = arr_cvesProducts.length;
         if( IMPRIME_CATALOGOS ) 
           for(int k = 0; k < numProds; k++ )
             System.out.println("CveProducts[" + k + "] = " + arr_cvesProducts[k]);
       
         todo_cargado = true;
       }
   }
   // ----------------------------------------------------------------------
   // El cliente pojo se define como instancia para ejecución en el estresador
   // el gestor de la tienda es único por el cliente, por ello es una variable
   // de instancia
   ClsGestorTda elgestorlocal = null; 
   // ----------------------------------------------------------------------
   public ClsClteTdaPojo(ClsGestorTda gestor)
   {
      elgestorlocal = gestor; 
   }
    
  public void elaboraPedidos()  // dummy para facilidad de pruebas
  {
      this.elaboraPedidos(5, 10, 20);
  }
   
  public void elaboraPedidos(int numPedidos, 
                             int numMaxItems, 
                             int numMaxUnidades )
  {
        
    int kPedido    = 0;  // qué pedido es <= numPedidos
    int numItems   = 0;  // cantidad de items de un pedido <= numMaxItems
    int jItem      = 0;  // que item es
    int jProd      = 0;  // lugar de la clave del producto
    int jClte      = 0;  // lugar del cliente en el arreglo de claves
    int unidades   = 0;  // cantidad de unidades de cada item
    
    try
    {
      if( elgestorlocal.conectado() )    
      {
        if( !todo_cargado )
          solicitaCatalogos(elgestorlocal);
      }
      else
      {
          System.out.println("No se pudo abrir la BD");
      }
    }
    catch( Exception e)
    {
        e.printStackTrace();
        System.exit(1);
    }
    
    // se generan numPedidos pedidos:
    
    for( kPedido = 1; kPedido <= numPedidos; kPedido++ )
    {
        // selecciono el cliente
        jClte      = (int) ( Math.random() * numCltes + 0.5);
        System.out.println("pedido num." + kPedido + " clte: " + arr_cvesCustomers[jClte]);
        numItems = (int) ( Math.random() * numMaxItems + 0.5);
        for( jItem = 1; jItem <= numItems; jItem++)
        {
            unidades = (int)(1.0 + Math.random() * numMaxUnidades );
            System.out.println("Item:" + jItem + "   CveProd:" + 
                                arr_cvesProducts[(int) ( Math.random() * numProds + 0.5)] +
                                " con " + unidades + " unidades" );
        }
    }   

  }
  
  
  public boolean altaCustomer()
  {
      Long   lngCveClte;
      String strPais;
      lngCveClte = 50000 + (long)(1000.0 * Math.random()); 
      strPais = "Mexicalpan";
      return elgestorlocal.altaCUSTOMER( lngCveClte , strPais);
  }
  
  public boolean altaProduct()
  {
      String strCveProd, strDescripcion;
      double dblPU;
      
      strCveProd = "" + 1000000 + (int) (1000000.0 * Math.random()); // truco sucio
      strDescripcion = "Descripcion del producto " + strCveProd;
      dblPU = 0.01 * ((int)(100.0*(5.0 + 5 * Math.random())));
      return elgestorlocal.altaPRODUCT(strCveProd, strDescripcion, dblPU );
  }
  
  public static void main(String args[])
  {
    ClsClteTdaPojo clteTda = null;  
    ClsGestorTda   gestor  = null;
    int NUM_CLTES =  5;
    int NUM_PRODS = 10;
    try
    {
      gestor = new ClsGestorTda();
      gestor.login("rafa","rafa");
      if( gestor.conectado() )    
      {
        clteTda = new ClsClteTdaPojo(gestor);
        
        for( int k = 0; k < NUM_CLTES; k++ )
            clteTda.altaCustomer();

        for( int k = 0; k < NUM_PRODS; k++ )
            clteTda.altaProduct();
/*        
        if( !todo_cargado )
          solicitaCatalogos(gestor);
        
        clteTda.elaboraPedidos();
        gestor.logout();
*/        
      }
      else
      {
          System.out.println("No se pudo abrir la BD");
      }
    }
    catch( Exception e)
    {
        e.printStackTrace();
        System.exit(1);
    }

  }
  // ------------------------------------------------------------------------
  //   FIN del CltePojo
  // ------------------------------------------------------------------------
}
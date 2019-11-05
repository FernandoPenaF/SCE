/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;
import excepcionesAplicativas.ExcepcionAplicativa;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utileriabd.ClsCampoBD;
import utileriabd.ClsConexion;
import utileriabd.MiModelo;
/**
 *
 * @author sdist
 */
public class ClsTienda 
{
    /**
     *
     */
    private ClsConexion conexion;
    /**
     *
     */
    // ---------------------------------------------------------------------
    public ClsTienda()
    {
      // por lo pronto no realiza acción alguna  
    }
    // ---------------------------------------------------------------------    
    boolean login( String unUsr, String pwd )
    {
        boolean te_conectaste = false;
        conexion = new ClsConexion("OnLineSales");
        try 
        {
            te_conectaste = conexion.conectate(unUsr, pwd);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ClsTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        if( !te_conectaste )
            conexion = null;
        return te_conectaste;
    }
    // ---------------------------------------------------------------------    
    boolean logout()
    {
        try 
        {
            conexion.cierraCon();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClsTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion = null;
        return true;
    }
    // ---------------------------------------------------------------------
    boolean conectado()
    {
        boolean bln_Conectado = false; // cuidado con las evaluaciones en corto circuito...
        if( conexion != null )
          bln_Conectado = conexion.conectado();
        return bln_Conectado;
    }
    // ---------------------------------------------------------------------
    Customer[] CatalogoDeClientes()
    {
    	int k = -1;
    	Customer[] catCltes = null;
    	ResultSet         r = null;
    	try 
        {
    	    r = conexion.obtenRS("Customers");
            if( r != null )
            { 
	          catCltes=new Customer[conexion.cuentaRegs("Customers")];
	          while(r.next())
	          {
	            catCltes[++k] = new Customer(r.getString("CustomerID"),r.getString("Country"));                   
	          }
            }
            else
              System.out.println("No se pudo recuperar el ResultSet...");  

		} 
    	catch (SQLException e)
        {
			
          e.printStackTrace();
    	}
        return catCltes;
    }
    // ---------------------------------------------------------------------
    Prod[] CatalogoDeProductos()
    {
     	int k = -1;
    	Prod[] catProds = null;
    	ResultSet r=null;
    	try 
        {
    	    r = conexion.obtenRS("Products");
            if( r != null )
            { 
	          catProds=new Prod[conexion.cuentaRegs("Products")];
	          while(r.next())
	          {
	            catProds[++k] = new Prod(r.getString("StockCode"),r.getString("ProdDescription"), r.getString("UnitPr"));                   
	          }
            }
            else
              System.out.println("No se pudo recuperar el ResultSet...");  

	} 
    	catch (SQLException e)
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	}
        return catProds;
    }
    // ---------------------------------------------------------------------    
    public String impArrCltes(Customer[] cltes)
    {
    	int n = cltes.length;
        StringBuffer sb = new StringBuffer("Catalogo de Clientes\n");
    	for( int k = 0; k < n; k++)
    		sb.append(k).append(" ... ").append(cltes[k]).append('\n');
        return new String( sb );
    }
    // ---------------------------------------------------------------------
    public String impArrProds(Prod[] prods)
    {
    	int n = prods.length;
        StringBuffer sb = new StringBuffer("Catalogo de productos\n");
    	for( int k = 0; k < n; k++)
    		sb.append(k).append(" ... ").append(prods[k]).append('\n');
        return new String( sb );
    }
    // ---------------------------------------------------------------------------
    public String[] clavesCustomers()
    { 
      String arr_cvesCltes[];
      Customer[] catCltes = this.CatalogoDeClientes();
      int n = catCltes.length;
      arr_cvesCltes = new String[n];
      for( int i = 0; i < n; i++)
        arr_cvesCltes[i] = catCltes[i].getCustomerID();
      return arr_cvesCltes;
    }
// ---------------------------------------------------------------------------
    public String[] clavesProducts()
    {
      String arr_cvesProds[];
      Prod[] catProds = this.CatalogoDeProductos();
      int n = catProds.length;
      arr_cvesProds = new String[n];
      for( int i = 0; i < n; i++)
        arr_cvesProds[i] = catProds[i].getCodigo();
      return arr_cvesProds;
    }
 // ---------------------------------------------------------------------------    
    public MiModelo obtenModeloEntidad( String strEntidad, String strCondicion )
    {
      // Operación solamente de utilería, para asistir al desarrollo eliminarla en producción
      // NOTA: Obsérvese la manera en que se opera la condición en strCondicion (lleva el campo y el valor.
      java.sql.ResultSet rs;
      MiModelo elModelo = null;
      try 
      {
          rs = conexion.obtenRegSelect("Select * from " + strEntidad + " where " + strCondicion);
          elModelo = new MiModelo(rs);
      } 
      catch (SQLException ex) 
      {
          Logger.getLogger(ClsTienda.class.getName()).log(Level.SEVERE, null, ex);
      }
      return elModelo;
    }
   // ---------------------------------------------------------------------------
   public MiModelo obtenModeloEntidades(String strEntidad)
   {
      // Operación solamente de utilería, para asistir al desarrollo eliminarla en producción
      // NOTA: Está hecho para obtener un modelo con la totalidad de registros de una entidad.
      MiModelo elModelo = null;
      java.sql.ResultSet rs; 
      try 
      {
        rs = conexion.obtenRegSelect("Select * from " + strEntidad);
        elModelo = new MiModelo(rs);
      }
      catch (SQLException ex) 
      {
            Logger.getLogger(ClsTienda.class.getName()).log(Level.SEVERE, null, ex);
      }
      return elModelo;
   }
   // -------------------------------------------------------------------------
   //          Búsqueda de entidades de negocio
   // -------------------------------------------------------------------------
   public Customer buscaCustomer( String strCustomerID)
   {
      Customer  customer    = null;
      java.sql.ResultSet rs = null;
      rs = buscaEntidad( "Customers","CustomerID",strCustomerID);
      try
      {
        if(rs.next())  
          customer = new Customer(rs.getNString("CustomerID"), rs.getNString("Country"));   
      }
      catch( java.sql.SQLException sql_e)
      {
          // tratamiento del error correspondiente
           sql_e.printStackTrace();  // chafísima, solo para que no truene
      }
      return customer; 
   }
   // -------------------------------------------------------------------------
   public Prod buscaProd( String strStockCode )
   {
      Prod prod             = null;
      java.sql.ResultSet rs = null;
      rs = buscaEntidad( "Products","StockCode",strStockCode);
      try
      {
        if( rs.next())  
          prod = new Prod(rs.getNString("StockCode"), rs.getNString("ProdDescription"), rs.getNString("UnitPr"));   
      }
      catch( java.sql.SQLException sql_e)
      {
          // tratamiento del error correspondiente
           sql_e.printStackTrace();  // chafísima, solo para que no truene
      }
      return prod; 
   } 
   // -------------------------------------------------------------------------
   //                Búsqueda genérica de entidades de negocio
   // -------------------------------------------------------------------------
   public java.sql.ResultSet buscaEntidad( String strEntidad,
                               String strCampoLlave,
                               String strValorLlave )
   {
       java.sql.ResultSet rs = null;
       
       java.util.TreeMap<String,ClsCampoBD> colCampos = new java.util.TreeMap<>();
       ClsCampoBD campo;
       campo          = new ClsCampoBD();
       campo.nombre   = strCampoLlave;
       campo.tipo     = ClsCampoBD.TIPO_VARCHAR;
       campo.valWhere = strValorLlave;
       colCampos.put(strCampoLlave,campo);
       campo          = new ClsCampoBD("*","*","","");
       colCampos.put("*",campo);
       
        try 
        {
            rs = conexion.obtenRS(strEntidad, colCampos);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ClsTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       return rs;
   }
   // ------------------------------------------------------------------------
   // Alta de Entidades de negocio
   // ------------------------------------------------------------------------
   public boolean altaCUSTOMER(long lngCveCustomer, String strPais)
   {
       boolean blnRes = false;
       //Customer customer = buscaCustomer( String.valueOf(lngCveCustomer));
       //if( customer != null )
       //    System.out.println("El customer " + lngCveCustomer + " ya existe");
       
       //
       //  tomado de 
       //
       // https://stackoverflow.com/questions/442747/getting-the-name-of-the-currently-executing-method
       //
       
        // final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        // System. out.println(ste[ste.length-depth].getClassName()+"#"+ste[ste.length-depth].getMethodName());
        // return ste[ste.length - depth].getMethodName();  //Wrong, fails for depth = 0
        // int depth = 1;  
        // System.out.println("Nombre del metodo actual: " + ste[ste.length - 1 - depth].getMethodName()); //Thank you Tom Tresansky
 
        //if(customer == null)
      
         // da de alta al cliente sin averiguar mas
         String arr_nomCampos[] = {"CustomerID","Country"};
         String arr_datos[] = new String[arr_nomCampos.length];
         arr_datos[0] = String.valueOf(lngCveCustomer);
         arr_datos[1] = strPais.trim();
        try 
        {
            blnRes = altaEntidad("CUSTOMERS", arr_nomCampos, arr_datos);
        }
        catch (Exception ex) 
        {
            ExcepcionAplicativa ea = new ExcepcionAplicativa(20001,ex,"Al dar de alta al Customer " + lngCveCustomer);
            //Logger.getLogger(this.getClass().getName()).log(Level.INFO,"Al dar de alta al Customer " + lngCveCustomer,ea);
            //ea.printStackTrace();
            System.out.println("-------------------------------------------------------------------");
            System.out.println(ea);
            System.out.println("-------------------------------------------------------------------");

        }
    
       return blnRes;
   }
   // ---------------------------------------------------------------------
   public boolean altaPRODUCT(String cveProduct, String strDescription, double dblPU)
   {
       boolean blnRes = false;
       // da de alta al cliente sin averiguar mas
       String arr_nomCampos[] = {"StockCode","ProdDescription","UnitPr"};
       String arr_datos[] = new String[arr_nomCampos.length];
       arr_datos[0] = String.valueOf(cveProduct);
       arr_datos[1] = strDescription.trim();
       arr_datos[2] = String.valueOf(dblPU);
       
        try 
        {
            blnRes =  altaEntidad("PRODUCTS", arr_nomCampos, arr_datos);
        }
        catch (Exception ex) 
        {
            Logger.getLogger(ClsTienda.class.getName()).log(Level.INFO, "Al dar de alta al Prod " + cveProduct, ex);
        }
        return blnRes;
   }
   // ------------------------------------------------------------------------
   //  Alta genérica y privada (NO SE EJERCE DESDE FUERA DE LA CLASE)
   // ------------------------------------------------------------------------
   private boolean altaEntidad(String strEntidad, String arr_nomCampos[], String arr_datos[]) throws SQLException 
    {
      int i,n;
              
      // se obtiene la colección de campos de la tabla de las entidades nominadas
      java.util.TreeMap<String,ClsCampoBD> colCampos = conexion.obtenMapaCampos(conexion.obtenRS(strEntidad));
      
      n = arr_nomCampos.length;
      
      // se rellena el valor para cada campo
      for( i = 0; i < n; i++ )
       ((ClsCampoBD) colCampos.get(arr_nomCampos[i])).valor = arr_datos[i];
      
      // se solicita al objeto conexión que inserte el registro y se espera el resultado
      return conexion.insertaReg(strEntidad, colCampos);
    }
// ---------------------------------------------------------------------------    
    private boolean modificaEntidad( String strEntidad, MiModelo mm, String strCampoClave) throws SQLException
    {
        int col,colCve = -1;
        String strCve = null;
        
        
        int numCampos = mm.getColumnCount();
        String[] strNomDatos = new String[numCampos];
        String[] strDatos    = new String[numCampos];
        
        for( col = 0; col < numCampos; col++ )
        {
           strNomDatos[col] = mm.getColumnName(col);
           strDatos[col]    = (String) mm.getValueAt(0, col);
           System.out.println(col + " -> " + strNomDatos[col] + ":" + strDatos[col]);
           if( strNomDatos[col].toLowerCase().startsWith("clv"))
           {
               colCve = col;
               strCve = strDatos[col];
           }
        }
        java.util.TreeMap<String,ClsCampoBD> colCampos = 
                conexion.obtenMapaCampos(conexion.obtenRegSelect("Select * from " + strEntidad + " where " + strCampoClave + " ='" + strCve + "';"));
        
        for( col = 0; col < numCampos; col++ )
        {
            colCampos.get(strNomDatos[col]).valor = strDatos[col];
        }
        colCampos.get(strNomDatos[colCve]).valWhere = strCve;
       
        return conexion.modificaReg( strEntidad, colCampos);
        
    }  
// ---------------------------------------------------------------------------    
// ---------------------------------------------------------------------------
    private java.sql.ResultSet obtenRS_Products() throws SQLException
    {
        return conexion.obtenRS ("PRODS");
    }
// ---------------------------------------------------------------------------    
    private java.sql.ResultSet obtenRS_Customers() throws SQLException
    {
        return conexion.obtenRS ("CUSTOMERS");
    }
// ---------------------------------------------------------------------------    

// ---------------------------------------------------------------------------
//                           Obtener un solo campo
// ---------------------------------------------------------------------------
   private java.sql.ResultSet obtenCampoParaLista(String strTV, String strCampo ) throws SQLException
   {
     String strSelect = "Select " + strCampo + " From " + strTV; 
     return conexion.obtenRegSelect(strSelect);  
   }

// ---------------------------------------------------------------------------
//   Main de prueba local, eliminarlo al elaborar el atado a producción.
// ---------------------------------------------------------------------------
    public static void main(String args[])
    {
        
        Customer arr_Clientes[]  = null;
        Prod     arr_Productos[] = null;
        
        ClsTienda tienda = new ClsTienda();
        tienda.login("rafa", "rafa");
        if( tienda.conectado())
        {
          System.out.println("Conectado");
          
          // aquí va la funcionalidad de prueba
          // solicitar el catálogo de clientes
          arr_Clientes = tienda.CatalogoDeClientes();
          //System.out.println(tienda.impArrCltes(arr_Clientes));
          // solicitar el catalogo de productos
          arr_Productos = tienda.CatalogoDeProductos();
          //System.out.println(tienda.impArrProds(arr_Productos));
          
          Customer customer;
          customer = tienda.buscaCustomer("50564");
          System.out.println(customer);
          if(tienda.altaCUSTOMER(50564, "Soliloquio"))
                System.out.println("Se dió de alta el cliente clave 50564");
          else
                System.out.println("No se pudo dar de alta el cliente");
          tienda.logout();
          System.out.println("Desconectado...");
        }
        else
            System.out.println("NO se pudo conectar, llamar a los bomberos...");
    }
}
// ---------------------------------------------------------------------------
//   Fin del main de prueba local.
// ---------------------------------------------------------------------------
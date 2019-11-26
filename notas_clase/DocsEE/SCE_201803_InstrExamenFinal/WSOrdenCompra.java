/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsordencompra;

import ejb.Customer;
import ejb.CustomerFacade;
import ejb.Product;
import ejb.ProductFacade;
import ejb.PurchaseOrder;
import ejb.PurchaseOrderFacade;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rgamb
 */
@WebService(serviceName = "WSOrdenCompra")
@Stateless()
public class WSOrdenCompra {

    @EJB
    private PurchaseOrderFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    @EJB
    private CustomerFacade      ejbCust;
    @EJB
    private ProductFacade       ejbProd;
    
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") PurchaseOrder entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") PurchaseOrder entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") PurchaseOrder entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public PurchaseOrder find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<PurchaseOrder> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<PurchaseOrder> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    /**
     * Web service operation
     * @param Customer_Id
     * @param Product_Id
     * @param Quantity
     * @param ShippingCost
     * @param intSalesDate
     * @param intShippingDate
     * @param FreigthCompany
     * @return 
     */
    
    //
    //  ======== Método para dar de alta una orden de compra. ===============
    // Nótese que las fechas de los argumentos no se utilizan.
    //
    
    @WebMethod(operationName = "altaOC")
    public int altaOC(@WebParam(name = "Customer_Id") int Customer_Id, 
                      @WebParam(name = "Product_Id") int Product_Id, 
                      @WebParam(name = "Quantity") int Quantity, 
                      @WebParam(name = "ShippingCost") double ShippingCost, 
                      @WebParam(name = "intSalesDate") int intSalesDate, 
                      @WebParam(name = "intShippingDate") int intShippingDate, 
                      @WebParam(name = "FreigthCompany") String FreigthCompany) 
    {
        java.util.Date d;
        int numOrden = 0;
        long deltaT;     // en milisegundos
        PurchaseOrder oc = new PurchaseOrder();
        Customer    cust = ejbCust.find(Customer_Id);
        Product     prod = ejbProd.find(Product_Id);
        if( cust != null && prod != null  )
        {
            numOrden = 2018000 + ejbRef.count() + 1;
            oc.setOrderNum(numOrden);
            oc.setCustomerId(cust);
            oc.setProductId(prod);
            oc.setQuantity((short)Quantity);
            oc.setShippingCost(new BigDecimal(0));
            oc.setFreightCompany(FreigthCompany);
            // asignar las fechas...
            deltaT = (long)(Math.random()*864000000.0); // 10 días
            d = new java.util.Date();
            java.sql.Date  salesd   = new java.sql.Date(d.getTime());
            java.sql.Date shippingd = new java.sql.Date(d.getTime() + deltaT);
            oc.setSalesDate(salesd);
            oc.setShippingDate(shippingd);
            ejbRef.create(oc);
        }
        
        return numOrden;
    }
  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbalmacen;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LPENAF
 */
@WebService(serviceName = "WSAlmacen")
@Stateless()
public class WSAlmacen {

    @EJB
    private ProductFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Product entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Product entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Product entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Product find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Product> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Product> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
    // =========== Obtiene el monto de la venta y descuenta las cantidades del almacen
    /**
     * Web service operation
     * @param Product_Id
     * @param Cantidad
     * @return 
     */
    @WebMethod(operationName = "MontoVtayDescuentaExistencia")
    public double MontoVtayDescuentaExistencia(@WebParam(name = "Product_Id") int Product_Id, @WebParam(name = "Cantidad") int Cantidad) {
        double dblMonto = 0.0;
        
        if(Cantidad > 0){
            Product prod = ejbRef.find(Product_Id);
            if(prod != null){
                if(prod.getQuantityOnHand() >= Cantidad ){
                    dblMonto = prod.getPurchaseCost().doubleValue()*Cantidad;
                    prod.setQuantityOnHand(prod.getQuantityOnHand()- Cantidad);
                    ejbRef.edit(prod);     
                }
          }
        }
        return dblMonto;
    }
    
    // =========== Reversea el descuento de las cantidades del almacen ===========
    /**
     * Web service operation
     * @param Product_Id
     * @param Cantidad
     * @return 
     */
    @WebMethod(operationName = "ReverseaDescuentaExistencia")
    public boolean ReverseaDescuentaExistencia(@WebParam(name = "Product_Id") int Product_Id, @WebParam(name = "Cantidad") int Cantidad) {
        boolean blnRes = false;
        
        if(Cantidad > 0){
           Product prod = ejbRef.find(Product_Id);
            if( prod != null ){
                prod.setQuantityOnHand(prod.getQuantityOnHand() + Cantidad);
                ejbRef.edit(prod);
                blnRes = true;
            }
        }
        return blnRes;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsenvios;

import ejb.Registro;
import ejb.RegistroFacade;
import java.util.List;
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
@WebService(serviceName = "WSEnvios")
@Stateless()
public class WSEnvios {

    @EJB
    private RegistroFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Registro entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Registro entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Registro entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Registro find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Registro> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Registro> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
         return ejbRef.count();
    }
    //
    //   =========== Metodo adicional para alta de solicitud de envíos ========
    //
    /**
     * Web service operation
     * @param Customer_ID
     * @param Orden_Compra
     * @param Status
     * @return 
     */
    @WebMethod(operationName = "altaSolicitudDeEnvio")
    public int altaSolicitudDeEnvio( @WebParam(name = "Customer_ID") int Customer_ID, @WebParam(name = "Orden_Compra") int Orden_Compra, @WebParam(name = "Status") char Status) {
        Registro objReg = new Registro();
        int intEntrega_id = ejbRef.count()+1;
        objReg.setEntregaId(intEntrega_id);
        objReg.setCustomerId(Customer_ID);
        objReg.setOrdenCompra(Orden_Compra);
        objReg.setStatus('P');
        ejbRef.create(objReg);
        return intEntrega_id;
    }
    
    
    
}

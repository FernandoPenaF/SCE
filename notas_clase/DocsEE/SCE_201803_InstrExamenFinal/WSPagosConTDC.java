/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wspagoscontdc;

import ejb.Tdc;
import ejb.TdcFacade;
import java.math.BigDecimal;
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
@WebService(serviceName = "WSPagosConTDC")
@Stateless()
public class WSPagosConTDC {

    @EJB
    private TdcFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Tdc entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Tdc entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Tdc entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Tdc find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Tdc> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Tdc> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
    //
    // ======================== Para cobrarle a la TDC ========================
    //  regresa:
    //              true (OK)
    //              false (No se pudo cobrar porque no hay tal TDC o no tiene fondos...)
    //
    
   @WebMethod(operationName = "PagoConTDC")
    public boolean PagoConTDC(@WebParam(name = "intTDC") int intTDC, @WebParam(name = "dblMonto") double dblMonto)
    {
       boolean blnRes = false;    
       BigDecimal disponible,monto;
       monto = BigDecimal.valueOf(dblMonto);
       Tdc tdc = ejbRef.find(intTDC);
       if( tdc != null)
         if(tdc.getTdcId()== intTDC)
         {   
            blnRes = true; // sí se pudo... 
            disponible = tdc.getLdc();
            if( disponible.compareTo(monto)>=0);
            {
                disponible = disponible.subtract(monto);
                tdc.setLdc(disponible);
                ejbRef.edit(tdc);
            }    
         }
       
       return blnRes;
    }
    
    //
    //  Solo para probar...
    //
    
    /**
     * Web service operation
     * @param intTDC
     * @param dblMonto
     * @return 
     */
    @WebMethod(operationName = "disponiblePosteriorAlPAgo")
    public double disponiblePosteriorAlPAgo(@WebParam(name = "intTDC") int intTDC, @WebParam(name = "dblMonto") double dblMonto) 
    {    
       double dispPosterior = 0.0; 
       boolean blnRes = false;    
       BigDecimal disponible,monto;
       monto = BigDecimal.valueOf(dblMonto);
       Tdc tdc = ejbRef.find(intTDC);
       if( tdc != null)
         if(tdc.getTdcId()== intTDC)
         {   
            blnRes = true; // sí se pudo... 
            disponible = tdc.getLdc();
            if( disponible.compareTo(monto)>=0);
            {
                disponible = disponible.subtract(monto);
                tdc.setLdc(disponible);
                ejbRef.edit(tdc);
                tdc = ejbRef.find(intTDC);
                dispPosterior = tdc.getLdc().doubleValue();
                
            }    
         }

        return dispPosterior;
    }

   

}

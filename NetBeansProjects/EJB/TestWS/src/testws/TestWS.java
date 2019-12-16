/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testws;

/**
 *
 * @author sdist
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejbpagos.WSPagos_Service serviceP = new ejbpagos.WSPagos_Service();
        ejbpagos.WSPagos portP = serviceP.getWSPagosPort();
        
        ejbenvios.WSEnvios_Service serviceE = new ejbenvios.WSEnvios_Service();
        ejbenvios.WSEnvios portE = serviceE.getWSEnviosPort();
        
        ejbalmacen.WSAlmacen_Service serviceA = new ejbalmacen.WSAlmacen_Service();
        ejbalmacen.WSAlmacen portA = serviceA.getWSAlmacenPort();
        
        ejbalmacen.WSOrdenCompra_Service serviceOC = new ejbalmacen.WSOrdenCompra_Service();
        ejbalmacen.WSOrdenCompra portOC = serviceOC.getWSOrdenCompraPort();
        
        System.out.println(portP.count());
        System.out.println(portE.count());
        System.out.println(portA.count());
        System.out.println(portOC.count());
    }

}

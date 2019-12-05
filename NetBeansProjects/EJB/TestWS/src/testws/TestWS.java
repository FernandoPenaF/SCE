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
        
        System.out.println(portP.count());
        System.out.println(portE.count());
    }

}

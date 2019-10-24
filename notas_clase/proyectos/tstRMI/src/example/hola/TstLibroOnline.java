/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hola;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author LPENAF
 */
public class TstLibroOnline {
    
    public static void main(String[] args) {
        long lngQuienSoy;
        long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
        long n,t0,t1,dt;
        long lngCuantosMilisFaltan;
        boolean hasStock;
        String ISBN;
        int units = 0;
        String host = (args.length < 1) ? null : args[0];
        
        com.adictosaltrabajo.webservice.almacen.AlmacenService service = new com.adictosaltrabajo.webservice.almacen.AlmacenService();
        com.adictosaltrabajo.webservice.almacen.Almacen port = service.getAlmacenPort();
        n = (args.length < 2) ? 2000 : Integer.valueOf(args[1]);
        
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            IServDisparo servDisparo = (IServDisparo) registry.lookup("ServidorDeDisparo");
            lngQuienSoy = servDisparo.quienSoy();
            lngCuantosMilisFaltan = servDisparo.deltaTEnMilis();
            System.out.println("Cliente " + lngQuienSoy + " faltan " + lngCuantosMilisFaltan  + " milisegundos");
            sumDeltaT  = 0;
            sumDeltaT2 = 0;
            Thread.currentThread().sleep(lngCuantosMilisFaltan);
             
            for (int i = 0; i < n; i++) {
                units = (int) (10.0 * (-1.0 + 2.0 * Math.random()));
                ISBN = "" + (long)( 1000000.0 * Math.random());
                
                t0 = System.currentTimeMillis();  
                hasStock = port.comprobarStock(ISBN, units);
                t1 = System.currentTimeMillis();
                dt = t1 - t0;
                sumDeltaT  += dt;
                sumDeltaT2 += dt * dt;

                if( i == 0 ){
                    
                    dtMin = dt;
                    dtMax = dt;
                }
                else {
                    if( dt < dtMin ) dtMin = dt;
                    if( dt > dtMax ) dtMax = dt;
                }
                System.out.println("Clte " + lngQuienSoy + ": Stock dispoonible -> " + hasStock);
            }
            servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
            }
            catch (Exception e) {
                System.err.println("Client exception: " + e.toString());
                e.printStackTrace();
            }
        System.out.println("Comprobacion Stock finalizado");
    }
    
    private static Boolean comprobarStock(java.lang.String isbn, int unidades) {
        com.adictosaltrabajo.webservice.almacen.AlmacenService service = new com.adictosaltrabajo.webservice.almacen.AlmacenService();
        com.adictosaltrabajo.webservice.almacen.Almacen port = service.getAlmacenPort();
        return port.comprobarStock(isbn, unidades);
    }
    
}

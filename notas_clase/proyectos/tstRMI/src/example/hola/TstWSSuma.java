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
 * @author sdist
 */
public class TstWSSuma {
    public static void main(String[] args) {
        long lngQuienSoy;
        long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
        long n,t0,t1,dt;
        long lngCuantosMilisFaltan;
        int a, b, c;
        String host = (args.length < 1) ? null : args[0];
        
        example.hello.WSSuma_Service service = new example.hello.WSSuma_Service();
        example.hello.WSSuma port = service.getWSSumaPort();
        a = 0; b = 0; c = 0;
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
                a = (int) (1000.0 * (-1.0 + 2.0 * Math.random()));
                b = (int) (1000.0 * (-1.0 + 2.0 * Math.random()));

                t0 = System.currentTimeMillis();  
                c = port.suma(a, b);
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
                System.out.println("Clte " + lngQuienSoy + ": "  + a + " + " + b + " = " + c);
            }
            servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
            }
            catch (Exception e) {
                System.err.println("Client exception: " + e.toString());
                e.printStackTrace();
            }
        System.out.println("WSSuma de Fernando finalizado");
    }

    private static int suma(int a, int b) {
        example.hello.WSSuma_Service service = new example.hello.WSSuma_Service();
        example.hello.WSSuma port = service.getWSSumaPort();
        return port.suma(a, b);
    }
}
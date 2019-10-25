/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hola;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;
import org.netbeans.xml.schema.mycalculatorschema.InputComplexType;
import org.netbeans.xml.schema.mycalculatorschema.OutputComplexType;

/**
 *
 * @author sdist
 */
public class TstMyCalculator {
    
    public static void main(String[] args) {
        long lngQuienSoy;
        long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
        long n,t0,t1,dt;
        long lngCuantosMilisFaltan;
        int a, b, c, opr = 0;
        Random r = new Random();
        String host = (args.length < 1) ? null : args[0];
        
        mycalculatorca.MyCalculatorCAService1 service = new mycalculatorca.MyCalculatorCAService1();
        mycalculatorca.MyCalculatorPortType port = service.getCasaPort1();
        a = 0; b = 0; c = 0;
        n = (args.length < 2) ? 2000 : Integer.valueOf(args[1]);
        InputComplexType part1 = new InputComplexType();
        
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
                part1.setParam01(a);
                part1.setParam02(b);
                opr = r.nextInt((5 - 1) + 1) + 1;
                
                switch(opr){
                    case 1:
                        t0 = System.currentTimeMillis();  
                        c = (int) port.additionOperation(part1).getResponse01();
                        t1 = System.currentTimeMillis();
                        System.out.println("Clte " + lngQuienSoy + ": "  + a + " + " + b + " = " + c);
                    break;
                    case 2:
                        t0 = System.currentTimeMillis();  
                        c = (int) port.subtractionOperation(part1).getResponse01();
                        t1 = System.currentTimeMillis();
                        System.out.println("Clte " + lngQuienSoy + ": "  + a + " - " + b + " = " + c);
                    break;
                    case 3:
                        t0 = System.currentTimeMillis();  
                        c = (int) port.multiplicationOperation(part1).getResponse01();
                        t1 = System.currentTimeMillis();
                        System.out.println("Clte " + lngQuienSoy + ": "  + a + " * " + b + " = " + c);
                    break;
                    case 4:
                        t0 = System.currentTimeMillis();  
                        c = (int) port.divisionOperation(part1).getResponse01();
                        t1 = System.currentTimeMillis();
                        System.out.println("Clte " + lngQuienSoy + ": "  + a + " / " + b + " = " + c);
                    break;
                    case 5:
                        t0 = System.currentTimeMillis();  
                        c = (int) port.divisionOperation(part1).getResponse01();
                        t1 = System.currentTimeMillis();
                        System.out.println("Clte " + lngQuienSoy + ": "  + a + " % " + b + " = " + c);
                    break;
                    default:
                        t0 = System.currentTimeMillis();  
                        c = (int) port.additionOperation(part1).getResponse01();
                        t1 = System.currentTimeMillis();
                        System.out.println("Clte " + lngQuienSoy + ": "  + a + " + " + b + " = " + c);
                    break;
                }
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
                
            }
            servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
            }
            catch (Exception e) {
                System.err.println("Client exception: " + e.toString());
                e.printStackTrace();
            }
        System.out.println("Calculadora prueba finalizada");
    }

    private static OutputComplexType additionOperation(org.netbeans.xml.schema.mycalculatorschema.InputComplexType part1) {
        mycalculatorca.MyCalculatorCAService1 service = new mycalculatorca.MyCalculatorCAService1();
        mycalculatorca.MyCalculatorPortType port = service.getCasaPort1();
        return port.additionOperation(part1);
    }
    
}

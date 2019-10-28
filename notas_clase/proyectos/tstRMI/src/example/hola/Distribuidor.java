/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hola;

import java.lang.reflect.Method;

/**
 *
 * @author RGGH
 */
public class Distribuidor {
    public static void main(String args[]) {

        System.out.println("Distribuidor, inciando con:");
        if( args.length == 0){
            System.out.println("Sin argumentos");
        } else {
            for(int i = 0; i < args.length; i++){
                System.out.println("args[" + i + "]:" + args[i]);
            }
        }
        System.out.println("------------------------------------------");

        String[] argsPar = new String[0];
        
        if(args.length > 1) {
            argsPar = new String[args.length - 1];
            for(int i = 1; i < args.length; i++){
                argsPar[i - 1] = args[i];
            }
        }
        if(args.length == 0) {
            System.out.println("uso:\n" + 
                               "Distribuidor Master  ip_host_localhost reset deltaTEnSegs\n" +
                               "Distribuidor Master  ip_host_localhost [reporta]\n"            +
                               "Distribuidor Cliente ip_host_localhost");
        } else {
            try {
                Class[] cArg = new Class[1];
                cArg[0] = String[].class;
                System.out.println("Distribuidor redirigiendo a args[0]:" + args[0]);
                
                Class cl = Class.forName("example.hola." + args[0]);
                Method m = cl.getMethod("main", cArg);
                m.invoke(cl, (Object) argsPar);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
//            if(args[0].compareToIgnoreCase("Master")  == 0) Master.main( argsPar );
//            if(args[0].compareToIgnoreCase("Cliente") == 0) Client.main( argsPar );
//            if(args[0].compareToIgnoreCase("Server") == 0) Server.main( argsPar );
//            if(args[0].compareToIgnoreCase("ServidorDeDisparo") == 0) ServidorDeDisparo.main( argsPar );
//            if(args[0].compareToIgnoreCase("TstWSSuma") == 0) TstWSSuma.main( argsPar );
//            if(args[0].compareToIgnoreCase("TstLibroOnline") == 0) TstLibroOnline.main( argsPar );
//            if(args[0].compareToIgnoreCase("TstMyCalculator") == 0) TstMyCalculator.main( argsPar );
        }
    }
}

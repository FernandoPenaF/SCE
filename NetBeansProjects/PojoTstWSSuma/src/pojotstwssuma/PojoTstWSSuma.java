/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojotstwssuma;

/**
 *
 * @author sdist
 */
public class PojoTstWSSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pojotstwssuma.WSSuma_Service service = new pojotstwssuma.WSSuma_Service();
        pojotstwssuma.WSSuma port = service.getWSSumaPort();
        
        int a, b, c;
        for (int i = 0; i < 100; i++) {
            a = 5;
            b = 8;
            c = port.suma(a,b);
            System.out.println(a + " + " + b + " = " + c);
        }
    }
    
}

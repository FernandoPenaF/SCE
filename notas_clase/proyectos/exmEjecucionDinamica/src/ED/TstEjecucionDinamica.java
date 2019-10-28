/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

/**
 *
 * @author LPENAF
 */
public class TstEjecucionDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------Prueba de ejecución de código dinámica de la clase HelloWorld.-------\n");
        String clase[] = {ED.HelloWorld.class.getName()};
        //String clase[] = {"ED.HelloWorld"};
        Distribuidor.main(clase);
        
        System.out.println("\n-------Prueba finalizada.-------\n");
    }
}

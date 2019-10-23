/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojojson_00;

/**
 *
 * @author sdist
 */
public class PojoJson_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClsPersona per, perN;
        biblioJSON.JSONObject objJson, objJsonN;
        
        per = new ClsPersona();
        per.setApellidoPaterno("Peña");
        per.setApellidoMaterno("Flores");
        per.setNombre("Luis Fernando");
        per.setEdad(22);
        
        System.out.println(per);
        objJson = new biblioJSON.JSONObject(per);
        System.out.println(objJson);
        
        perN = new ClsPersona();
        System.out.println(perN);
        perN.setApellidoMaterno(objJson.getString("apellidoMaterno"));
        perN.setApellidoPaterno(objJson.getString("apellidoPaterno"));
        perN.setNombre(objJson.getString("nombre"));
        perN.setEdad(objJson.getInt("edad"));
        System.out.println(perN);
        
        objJsonN = new biblioJSON.JSONObject("{\"apellidoPaterno\":\"Peña\",\"edad\":22,\"nombre\":\"Luis Fernando\",\"apellidoMaterno\":\"Flores\"}");
        System.out.println(objJsonN);
    }
    
}

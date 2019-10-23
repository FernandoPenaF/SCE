/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstrest;

/**
 *
 * @author sdist
 */
public class TstRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strN, cadCustomerXml;
        Object objCustomerXml;
        ClienteRestCustomer clte = new ClienteRestCustomer();
        strN = clte.countREST();
        System.out.println("Son " + strN + " Customers.");
        
        cadCustomerXml = "<customer>\n" +
                        "\n" +
                        "<addressline1>111 E. Las Olivas Blvd</addressline1>\n" +
                        "\n" +
                        "<addressline2>Suite 51</addressline2>\n" +
                        "\n" +
                        "<city>Fort Lauderdale</city>\n" +
                        "\n" +
                        "<creditLimit>100005</creditLimit>\n" +
                        "\n" +
                        "<customerId>1</customerId>\n" +
                        "\n" +
                        "<email>jumboeagle@example.com</email>\n" +
                        "\n" +
                        "<fax>305-555-0189</fax>\n" +
                        "\n" +
                        "<name>Jumbo Eagle Corp</name>\n" +
                        "\n" +
                        "<phone>305-555-0188</phone>\n" +
                        "\n" +
                        "<state>FL</state>\n" +
                        "\n" +
                        "</customer>";
        
        objCustomerXml = (Object) cadCustomerXml;
        
        clte.edit_XML(objCustomerXml, "1");
        
    }
    
}

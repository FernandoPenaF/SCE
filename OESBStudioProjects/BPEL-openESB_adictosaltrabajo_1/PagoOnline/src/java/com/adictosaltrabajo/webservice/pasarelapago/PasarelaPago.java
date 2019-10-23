package com.adictosaltrabajo.webservice.pasarelapago;

import java.util.Random;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Codigo perteneciente a: Tutorial de BPEL con OpenESB
 * @author www.adictosaltrabajo.com - Ivan Garcia Puebla
 * @version 1.0
 */
@WebService()
public class PasarelaPago {

   /**
     * Operacion de un servicio web implementado con JAX-WS
     * que factura a un determinado cliente cierta cuantia.
     *
     * @param idCliente Identificador de un cliente
     * @param cuantia Cuantia a cobrar al cliente
     * @return Identificador de factura
     */
    @WebMethod(operationName = "facturar")
    public String facturar(@WebParam(name = "idCliente")
    String idCliente, @WebParam(name = "cuantia")
    int cuantia) {

         //TODO
        /*
         * Implementar la logica de negocio con el idCliente y cuantia
         */

        // Generamos un id de factura:
        Random rnd = new Random();
        return "IDFACT"+rnd.nextInt(10000);
    }

}

package com.adictosaltrabajo.webservice.mensajeria;

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
public class EnvioPaquetes {

    /**
     * Operacion de un servicio web implementado con JAX-WS
     * que emite la orden de envio de un producto.
     *
     * @param empresa Identificador de empresa
     * @param idPedido Identificador de pedido
     * @return Tiempo de reparto en dias
     */
    @WebMethod(operationName = "enviarProducto")
    public Integer enviarProducto(@WebParam(name = "empresa")
    String empresa, @WebParam(name = "idPedido")
    String idPedido) {

        //TODO
        /*
         * Implementar la logica de negocio con los datos de la empresa y el pedido
         */

        Random rnd = new Random();
        return rnd.nextInt(15)+1; //Reparto entre 1 y 15 dias
    }

}

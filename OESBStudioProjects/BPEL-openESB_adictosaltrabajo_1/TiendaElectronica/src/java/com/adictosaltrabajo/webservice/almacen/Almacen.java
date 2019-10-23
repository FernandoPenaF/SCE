package com.adictosaltrabajo.webservice.almacen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Codigo perteneciente a: Tutorial de BPEL con OpenESB
 * @author www.adictosaltrabajo.com - Ivan Garcia Puebla
 * @version 1.0
 */
@WebService()
public class Almacen {

    /**
     * Operacion de un servicio web implementado con JAX-WS
     * que comprueba el stock de un libro.
     *
     * @param ISBN Identificador de un libro
     * @param unidades Unidades del producto solicitadas
     * @return True si hay unidades disponibles.
     */
    @WebMethod(operationName = "comprobarStock")
    public Boolean comprobarStock(@WebParam(name = "ISBN")
    String ISBN, @WebParam(name = "unidades")
    int unidades) {

        //TODO
        /*
         * Implementar la logica de negocio con el ISBN y unidades
         */

        // El alamcen no distribuye mas de 5 unidades por pedido
        return (unidades>5?false:true);
    }


}

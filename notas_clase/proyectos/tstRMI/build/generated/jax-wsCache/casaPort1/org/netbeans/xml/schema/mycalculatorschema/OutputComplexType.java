
package org.netbeans.xml.schema.mycalculatorschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OutputComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OutputComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response01" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputComplexType", propOrder = {
    "response01"
})
public class OutputComplexType {

    protected double response01;

    /**
     * Obtiene el valor de la propiedad response01.
     * 
     */
    public double getResponse01() {
        return response01;
    }

    /**
     * Define el valor de la propiedad response01.
     * 
     */
    public void setResponse01(double value) {
        this.response01 = value;
    }

}

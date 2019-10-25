
package org.netbeans.xml.schema.mycalculatorschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InputComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InputComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param01" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="param02" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputComplexType", propOrder = {
    "param01",
    "param02"
})
public class InputComplexType {

    protected int param01;
    protected int param02;

    /**
     * Obtiene el valor de la propiedad param01.
     * 
     */
    public int getParam01() {
        return param01;
    }

    /**
     * Define el valor de la propiedad param01.
     * 
     */
    public void setParam01(int value) {
        this.param01 = value;
    }

    /**
     * Obtiene el valor de la propiedad param02.
     * 
     */
    public int getParam02() {
        return param02;
    }

    /**
     * Define el valor de la propiedad param02.
     * 
     */
    public void setParam02(int value) {
        this.param02 = value;
    }

}

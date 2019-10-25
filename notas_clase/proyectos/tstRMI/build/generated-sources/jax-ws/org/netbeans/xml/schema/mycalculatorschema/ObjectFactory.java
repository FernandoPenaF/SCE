
package org.netbeans.xml.schema.mycalculatorschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.mycalculatorschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyFault_QNAME = new QName("http://xml.netbeans.org/schema/MyCalculatorSchema", "myFault");
    private final static QName _MyInput_QNAME = new QName("http://xml.netbeans.org/schema/MyCalculatorSchema", "myInput");
    private final static QName _MyOutput_QNAME = new QName("http://xml.netbeans.org/schema/MyCalculatorSchema", "myOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.mycalculatorschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputComplexType }
     * 
     */
    public InputComplexType createInputComplexType() {
        return new InputComplexType();
    }

    /**
     * Create an instance of {@link OutputComplexType }
     * 
     */
    public OutputComplexType createOutputComplexType() {
        return new OutputComplexType();
    }

    /**
     * Create an instance of {@link OutputFaultComplextype }
     * 
     */
    public OutputFaultComplextype createOutputFaultComplextype() {
        return new OutputFaultComplextype();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputFaultComplextype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/MyCalculatorSchema", name = "myFault")
    public JAXBElement<OutputFaultComplextype> createMyFault(OutputFaultComplextype value) {
        return new JAXBElement<OutputFaultComplextype>(_MyFault_QNAME, OutputFaultComplextype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/MyCalculatorSchema", name = "myInput")
    public JAXBElement<InputComplexType> createMyInput(InputComplexType value) {
        return new JAXBElement<InputComplexType>(_MyInput_QNAME, InputComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/MyCalculatorSchema", name = "myOutput")
    public JAXBElement<OutputComplexType> createMyOutput(OutputComplexType value) {
        return new JAXBElement<OutputComplexType>(_MyOutput_QNAME, OutputComplexType.class, null, value);
    }

}

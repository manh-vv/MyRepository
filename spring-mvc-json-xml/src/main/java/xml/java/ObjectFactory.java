//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.10 at 09:55:46 AM ICT 
//


package xml.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.java package. 
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

    private final static QName _Data_QNAME = new QName("http://www.example.org/ReturnData", "data");
    private final static QName _Code_QNAME = new QName("http://www.example.org/ReturnData", "code");
    private final static QName _Message_QNAME = new QName("http://www.example.org/ReturnData", "message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Object }
     * 
     */
    public Object createObject() {
        return new Object();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/ReturnData", name = "data")
    public JAXBElement<Object> createData(Object value) {
        return new JAXBElement<Object>(_Data_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/ReturnData", name = "code", defaultValue = "0")
    public JAXBElement<Integer> createCode(Integer value) {
        return new JAXBElement<Integer>(_Code_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/ReturnData", name = "message", defaultValue = "")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

}
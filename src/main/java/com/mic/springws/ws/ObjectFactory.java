
package com.mic.springws.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thomas_bayer.blz package. 
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

    private final static QName _GetBank_QNAME = new QName("http://thomas-bayer.com/blz/", "getBank");
    private final static QName _GetBankResponse_QNAME = new QName("http://thomas-bayer.com/blz/", "getBankResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thomas_bayer.blz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankResponseType }
     * 
     */
    public com.mic.springws.ws.GetBankResponseType createGetBankResponseType() {
        return new com.mic.springws.ws.GetBankResponseType();
    }

    /**
     * Create an instance of {@link GetBankType }
     * 
     */
    public com.mic.springws.ws.GetBankType createGetBankType() {
        return new com.mic.springws.ws.GetBankType();
    }

    /**
     * Create an instance of {@link DetailsType }
     * 
     */
    public com.mic.springws.ws.DetailsType createDetailsType() {
        return new com.mic.springws.ws.DetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thomas-bayer.com/blz/", name = "getBank")
    public JAXBElement<com.mic.springws.ws.GetBankType> createGetBank(com.mic.springws.ws.GetBankType value) {
        return new JAXBElement<com.mic.springws.ws.GetBankType>(_GetBank_QNAME, com.mic.springws.ws.GetBankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thomas-bayer.com/blz/", name = "getBankResponse")
    public JAXBElement<com.mic.springws.ws.GetBankResponseType> createGetBankResponse(GetBankResponseType value) {
        return new JAXBElement<GetBankResponseType>(_GetBankResponse_QNAME, GetBankResponseType.class, null, value);
    }

}

package com.mic.springws.service;

import com.mic.springws.ws.GetBankResponseType;
import com.mic.springws.ws.GetBankType;
import com.mic.springws.ws.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBIntrospector;

/**
 * @author toyewole
 */

@Service
public class BankInfoService {


    @Autowired
    Jaxb2Marshaller bankMarshaller;

    @Autowired
    ObjectFactory bankInfoObjectFactory;

    WebServiceTemplate webServiceTemplate;

    public GetBankResponseType getBankInformation(GetBankType bankType) {
        bankType.setBlz("50070010");
        webServiceTemplate = new WebServiceTemplate(bankMarshaller);


        return (GetBankResponseType) JAXBIntrospector.getValue(webServiceTemplate.marshalSendAndReceive("http://www.thomas-bayer.com/axis2/services/BLZService?wsdl",
                        bankInfoObjectFactory.createGetBank(bankType)));

    }

}

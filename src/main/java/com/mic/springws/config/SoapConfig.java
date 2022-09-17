package com.mic.springws.config;

import com.mic.springws.ws.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author toyewole
 */
@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller bankMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.mic.springws.ws");
        return marshaller;
    }


    @Bean
    public ObjectFactory bankInfoObjectFactory() {
        return new ObjectFactory();
    }


}

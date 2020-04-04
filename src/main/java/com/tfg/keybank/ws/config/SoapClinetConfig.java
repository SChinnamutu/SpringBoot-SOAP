package com.tfg.keybank.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import com.tfg.keybank.ws.client.UserListClient;

@Configuration
public class SoapClinetConfig {

	@Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.keybank.tfa.v1_11.service.operations");
        return jaxb2Marshaller;
    }
	
	@Bean
    public UserListClient articleClient(Jaxb2Marshaller jaxb2Marshaller) {
		UserListClient calculatorClient = new UserListClient();
		calculatorClient.setDefaultUri("http://localhost:9083/tfa/services/TFAPort");
		calculatorClient.setMarshaller(jaxb2Marshaller);
		calculatorClient.setUnmarshaller(jaxb2Marshaller);
		ClientInterceptor[] interceptors = new ClientInterceptor[]{wss4jSecurityInterceptor()};
		calculatorClient.setInterceptors(interceptors);
        return calculatorClient;
    }

	@Bean
    public Wss4jSecurityInterceptor wss4jSecurityInterceptor() {
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("Timestamp UsernameToken");
        wss4jSecurityInterceptor.setSecurementUsername("messi");
        wss4jSecurityInterceptor.setSecurementPassword("messi@10");
        return wss4jSecurityInterceptor;
    }
	 
}

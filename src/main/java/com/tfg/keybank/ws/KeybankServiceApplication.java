package com.tfg.keybank.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tfg.keybank.ws.client.UserListClient;
import com.tfg.keybank.ws.config.SoapClinetConfig;

@SpringBootApplication
public class KeybankServiceApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(KeybankServiceApplication.class, args);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClinetConfig.class);
		UserListClient clinet = annotationConfigApplicationContext.getBean(UserListClient.class);
		try {
			System.out.println("============Api Invocation Begins===========================");
			System.out.println("Result :: " + clinet.processfetchUsers().toString());
			System.out.println("============Api Invocation Ends===========================");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}

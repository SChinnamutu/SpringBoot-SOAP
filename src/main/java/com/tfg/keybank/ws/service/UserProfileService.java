package com.tfg.keybank.ws.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.keybank.tfa.v1_11.service.operations.ListUserResult;
import com.tfg.keybank.ws.client.UserListClient;
import com.tfg.keybank.ws.config.SoapClinetConfig;

@Service
public class UserProfileService {

	@SuppressWarnings("resource")
	public ListUserResult processFetchUserName(String userId) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClinetConfig.class);
		UserListClient clinet = annotationConfigApplicationContext.getBean(UserListClient.class);
		try {
			System.out.println("============Api Invocation Begins===========================");
			System.out.println("Result :: " + clinet.processfetchUsers(userId).toString());
			System.out.println("============Api Invocation Ends===========================");
			return clinet.processfetchUsers(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;  	
	}
	
}

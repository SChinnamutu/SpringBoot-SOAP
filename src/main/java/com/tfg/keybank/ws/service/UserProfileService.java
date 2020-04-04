package com.tfg.keybank.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keybank.tfa.v1_11.service.operations.ListUserResult;
import com.tfg.keybank.ws.client.UserListClient;
import com.tfg.keybank.ws.config.SoapClinetConfig;

@Service
public class UserProfileService {
	
	@Autowired
	SoapClinetConfig config;

	@Autowired
	UserListClient client;
	
	public ListUserResult processFetchUserName(String userId) {
		try {
			System.out.println("============Api Invocation Begins===========================");
			System.out.println("Result :: " + client.processfetchUsers(userId).toString());
			System.out.println("============Api Invocation Ends===========================");
			return client.processfetchUsers(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;  	
	}
	
}

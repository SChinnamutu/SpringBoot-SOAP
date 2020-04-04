package com.tfg.keybank.ws.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.keybank.tfa.v1_11.service.operations.ListUserResult;



public class UserListClient  extends WebServiceGatewaySupport{

	public ListUserResult processfetchUsers() {
		ListUserResult request = new ListUserResult();
		request.setAccountValid(true);
		request.setCIXNumber("Messi@10");
		return (ListUserResult) getWebServiceTemplate().marshalSendAndReceive(request);
	}
	
}

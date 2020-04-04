package com.tfg.keybank.ws.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.keybank.tfa.v1_11.service.operations.ListUserResult;



public class UserListClient  extends WebServiceGatewaySupport{

	public ListUserResult processfetchUsers(String userId) {
		ListUserResult request = new ListUserResult();
		request.setUserPartyId(userId);
		//return (ListUserResult) getWebServiceTemplate().marshalSendAndReceive(request);
		return request;
	}
	
}

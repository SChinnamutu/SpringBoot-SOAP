package com.tfg.keybank.ws.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.keybank.tfa.v1_11.service.operations.ListUserResult;
import com.tfg.keybank.ws.model.Users;
import com.tfg.keybank.ws.service.UserProfileService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Writer implements ItemWriter<Users>{

	
	@Autowired
	UserProfileService service;
	
	@Override
	@Transactional
	public void write(List<? extends Users> users) throws Exception {
		log.info("Writer process started");
		ListUserResult response = service.processFetchUserName(users.get(0).getOrderId());
		log.info("Data ::" + response.toString());
		log.info("Writer process ends");
	}
	
}

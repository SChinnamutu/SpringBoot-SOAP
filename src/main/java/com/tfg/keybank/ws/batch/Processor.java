package com.tfg.keybank.ws.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.tfg.keybank.ws.model.Users;

@Component
public class Processor implements ItemProcessor<Users, Users> {

	@Override
	public Users process(Users user) throws Exception {
		return user;
	}

}

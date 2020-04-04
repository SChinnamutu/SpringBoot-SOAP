package com.tfg.keybank.ws;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableBatchProcessing
@Slf4j
public class KeybankServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(KeybankServiceApplication.class, args);
		log.info("KeybankServiceApplication service started.");
	}

}

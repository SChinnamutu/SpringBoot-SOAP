package com.tfg.keybank.ws.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder	
public class BatchResponse {

	private String status;
	private StatusMessage statusMessage;	
		
	@Data	
	@Builder
	public static class StatusMessage{
		private String code;
		private String decs;
	}	
	
}

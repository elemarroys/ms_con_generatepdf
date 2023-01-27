package com.esgari.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneratePdfException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorMessage;
	

	public GeneratePdfException(String errorCode,String errorMessage) {
		
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;

	}
}

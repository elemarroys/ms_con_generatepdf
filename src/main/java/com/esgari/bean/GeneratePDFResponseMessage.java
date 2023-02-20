package com.esgari.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneratePDFResponseMessage implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7657751283717110519L;
	private String binary64Pdf;
	
	
	

}

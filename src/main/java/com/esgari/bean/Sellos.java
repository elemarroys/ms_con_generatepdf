package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter	
@Setter
public class Sellos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5949236677970339525L;
	
	@JsonProperty("cadenaOriginal")
	private String cadenaOriginal;
	
	@JsonProperty("selloSat")
	private String selloSat;
	
	@JsonProperty("selloDigitalCDFI")
	private String selloDigitalCDFI;
	
	@JsonProperty("observacion")
	private String observacion;
	
	@JsonProperty("cantidadConLetra")
	private String cantidadConLetra;
	
	@JsonProperty("QRbase64")
	private String QRbase64;
	

}

package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1055446217819394298L;
	
	@JsonProperty("nombre")
	private String nombre;
	
	@JsonProperty("rfc")
	private String rfc;
	
	@JsonProperty("domicilio")
	private String domicilio;
	
	@JsonProperty("residenciaFiscal")
	private String residenciaFiscal;
	
	@JsonProperty("noRegId")
	private String noRegId;
	
	@JsonProperty("observaciones")
	private String observaciones;
	
	

}

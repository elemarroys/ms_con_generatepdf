package com.esgari.bean;

import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@Setter
public class Doctos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1968896653567020545L;

	@JsonProperty("uuid")
	private String uuid;
	
	@JsonProperty("serie")
	private String serie;
	
	@JsonProperty("folio")
	private String folio;
	
	@JsonProperty("metodoPago")
	private String metodoPago;
	
	@JsonProperty("total")
	private String total;
	
	@JsonProperty("monedaDr")
	private String monedaDr;
	
	@JsonProperty("tipoCambioDr")
	private String tipoCambioDr;
	
	@JsonProperty("parcialidad")
	private String parcialidad;
	
	@JsonProperty("saldoAnterior")
	private String saldoAnterior;
	
	@JsonProperty("montoPagado")
	private String montoPagado;
	
	@JsonProperty("saldoAbsoluto")
	private String saldoAbsoluto;
	
	
}

package com.esgari.bean;

import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@Setter
public class Mercancia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1968896653567020545L;

	@JsonProperty("cantidad")
	private String cantidad;
	
	@JsonProperty("claveProdServ")
	private String claveProdServ;
	
	@JsonProperty("claveUnidad")
	private String claveUnidad;
	
	@JsonProperty("unidad")
	private String unidad;
	
	@JsonProperty("peso")
	private String peso;
	
	@JsonProperty("valor")
	private String valor;
	
	@JsonProperty("monedaValor")
	private String monedaValor;
	
	@JsonProperty("embalajeMatPel")
	private String embalajeMatPel;
	
	@JsonProperty("cveMatPeligroso")
	private String cveMatPeligroso;
	
	@JsonProperty("fraccArancel")
	private String fraccArancel;
	
	@JsonProperty("descripcion")
	private String descripcion;
	
}

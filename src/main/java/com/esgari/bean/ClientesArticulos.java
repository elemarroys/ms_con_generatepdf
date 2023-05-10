package com.esgari.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientesArticulos {
	
	private static final long serialVersionUID = 4723390252172647020L;
	
	@JsonProperty("cant")
	private String cant;
	
	@JsonProperty("cantidad")
	private String cantidad;
	
	@JsonProperty("claveProdServ")
	private String claveProdServ;
	
	@JsonProperty("unidad")
	private String unidad;
	
	@JsonProperty("descripcion")
	private String descripcion;
	
	@JsonProperty("pUnitario")
	private String pUnitario;
	
	@JsonProperty("precioUnitario")
	private String precioUnitario;
	
	@JsonProperty("desc")
	private String desc;
	
	@JsonProperty("descuento")
	private String descuento;
	
	@JsonProperty("imptoTrasladado")
	private String imptoTrasladado;
	
	@JsonProperty("importeTrasladado")
	private String importeTrasladado;
	
	@JsonProperty("imptoRetenido")
	private String imptoRetenido;
	
	@JsonProperty("importeRetenido")
	private String importeRetenido;
	
	@JsonProperty("impuestos")
	private String impuestos;
	
	@JsonProperty("importe")
	private String importe;
}

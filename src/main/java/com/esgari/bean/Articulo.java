package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Articulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1327901825372783683L;
	
	@JsonProperty("claveProdServ")
	private String claveProdServ;
	
	@JsonProperty("cantidad")
	private String cantidad;
	
	@JsonProperty("descripcion")
	private String descripcion;
	
	@JsonProperty("claveUnidad")
	private String claveUnidad;
	
	@JsonProperty("precioUnitario")
	private String precioUnitario;
	
	@JsonProperty("importe")
	private String importe;
	
	@JsonProperty("unidad")
	private String unidad;
	
	@JsonProperty("unitario")
	private String unitario;
	
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
	
	
	

}

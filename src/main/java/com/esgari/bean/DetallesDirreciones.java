package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DetallesDirreciones implements Serializable{

	private static final long serialVersionUID = -6397556163407664822L;
	
	@JsonProperty("origen")
	private String origen;
	
	@JsonProperty("destino")
	private String destino;
	
	@JsonProperty("remitenteOExpedidor")
	private String remitenteOExpedidor;
	
	@JsonProperty("destinatario")
	private String destinatario;
	
	@JsonProperty("domicilio1")
	private String domicilio1;
	
	@JsonProperty("domicilio2")
	private String domicilio2;
	
	@JsonProperty("seRecogeraEn")
	private String seRecogeraEn;
	
	@JsonProperty("RFC")
	private String RFC;
	
	@JsonProperty("fechaCarga")
	private String fechaCarga;
	
	@JsonProperty("fechaOPlazoPrevisto")
	private String fechaOPlazoPrevisto;
	
	@JsonProperty("designacionMercanciaATransportar")
	private String designacionMercanciaATransportar;
	 
	@JsonProperty("residuoPeligrosoSi")
	private String residuoPeligrosoSi;
	
	@JsonProperty("residuoPeligrosoNo")
	private String residuoPeligrosoNo;
	
	@JsonProperty("peso")
	private String peso;

	@JsonProperty("metrosCubicos")
	private String metrosCubicos;
	
	@JsonProperty("litros")
	private String litros;
	
	@JsonProperty("valorDeclarado")
	private String valorDeclarado;	
}

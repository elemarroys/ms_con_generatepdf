package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Header implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6397556163407664822L;
	
	@JsonProperty("serie")
	private String serie;
	
	@JsonProperty("folio")
	private String folio;
	
	@JsonProperty("fechaEmision")
	private String fechaEmision;
	
	@JsonProperty("lugarExpedicion")
	private String lugarExpedicion;
	
	@JsonProperty("tipoMoneda")
	private String tipoMoneda;
	
	@JsonProperty("version")
	private String version;
	
	@JsonProperty("usoCFDI")
	private String usoCFDI;
	
	@JsonProperty("regimenFiscal")
	private String regimenFiscal;
	
	@JsonProperty("tipoDeCambio")
	private String tipoDeCambio;
	
	@JsonProperty("pedimento")
	private String pedimento;
	
	@JsonProperty("metodoDePago")
	private String metodoDePago;
	 
	@JsonProperty("formaDePago")
	private String formaDePago;
	
	@JsonProperty("tipoDeDocumento")
	private String tipoDeDocumento;

}

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
	
	@JsonProperty("orderReleaseID")
	private String orderReleaseID;

	@JsonProperty("unidad")
	private String unidad;
	
	@JsonProperty("noTracto")
	private String noTracto;
	
	@JsonProperty("placas")
	private String placas;
	
	@JsonProperty("noCajas")
	private String noCajas;
	
	@JsonProperty("placas2")
	private String placas2;
	
	@JsonProperty("nombreOperador")
	private String nombreOperador;
	
	@JsonProperty("nombreCargador")
	private String nombreCargador;
	
	@JsonProperty("kmSalida")
	private String kmSalida;
	
	@JsonProperty("combustibleSalida")
	private String combustibleSalida;
	
	@JsonProperty("proyecto")
	private String proyecto;
	
	@JsonProperty("contenedor")
	private String contenedor;
	
	@JsonProperty("recorrido")
	private String recorrido;
	
	@JsonProperty("folioFiscal")
	private String folioFiscal;
	
	@JsonProperty("numeroDeCertificado")
	private String numeroDeCertificado;
	
	@JsonProperty("fechaYHoraDeCertificacion")
	private String fechaYHoraDeCertificacion;
	
	@JsonProperty("numeroDeCertificadoDelSat")
	private String numeroDeCertificadoDelSat;
}

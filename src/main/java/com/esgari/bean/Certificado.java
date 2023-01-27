package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Certificado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8663057979159163269L;

	@JsonProperty("serieCertificadoEmisor")
	private String serieCertificadoEmisor;

	@JsonProperty("noSerieCertificadoSat")
	private String noSerieCertificadoSat;

	@JsonProperty("folioFiscalUUID")
	private String folioFiscalUUID;

	@JsonProperty("fechaHoraCertificacion")
	private String fechaHoraCertificacion;

}

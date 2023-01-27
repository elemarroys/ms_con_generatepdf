package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComplementoPago implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2238556806308920526L;
	
	
	@JsonProperty("fechaHoraPago")
	private String fechaHoraPago;
	
	@JsonProperty("rFCEmisorCtaOrdenate")
	private String rFCEmisorCtaOrdenate;
	
	@JsonProperty("rFCEmisorCtaBeneficiario")
	private String rFCEmisorCtaBeneficiario;
	
	@JsonProperty("formaPago")
	private String formaPago;
	
	@JsonProperty("nombreBancoCtaOrdenante")
	private String nombreBancoCtaOrdenante;
	
	@JsonProperty("nombreBancoCtaBeneficiario")
	private String nombreBancoCtaBeneficiario;
	
	@JsonProperty("moneda")
	private String moneda;
	
	@JsonProperty("ctaOrdenate")
	private String ctaOrdenate;
	
	@JsonProperty("ctaBeneficiario")
	private String ctaBeneficiario;
	
	@JsonProperty("tipoCambio")
	private String tipoCambio;
	
	@JsonProperty("noOperacion")
	private String noOperacion;
	
	@JsonProperty("monto")
	private String monto;
	
	@JsonProperty("tipoCadenaPago")
	private String tipoCadenaPago;
	
	@JsonProperty("importeLetra")
	private String importeLetra;
	
	@JsonProperty("certificadoPago")
	private String certificadoPago;
	
	@JsonProperty("cadenaOriginalComprobantePago")
	private String cadenaOriginalComprobantePago;
	
	@JsonProperty("selloPago")
	private String selloPago;
	
	


}

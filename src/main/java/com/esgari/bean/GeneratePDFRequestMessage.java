package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneratePDFRequestMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3016527102903054907L;

	@JsonProperty("header")
	private Header header;

	@JsonProperty("cliente")
	private Cliente cliente;

	@JsonProperty("detalleFactura")
	private DetalleFactura detalleFactura;

	@JsonProperty("certificado")
	private Certificado certificado;

	@JsonProperty("complementoPago")
	private ComplementoPago complementoPago;

	@JsonProperty("doctosRelacionados")
	private DoctosRelacionados doctosRelacionados;

	@JsonProperty("sellos")
	private Sellos sellos;
	
	@JsonProperty("clienteFactura")
	private ClienteFactura clienteFactura;
	
	@JsonProperty("cfdiRelacionados")
	private CfdiRelacionados cfdiRelacionados;

}

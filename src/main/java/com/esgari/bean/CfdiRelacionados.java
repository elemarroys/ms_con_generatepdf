package com.esgari.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CfdiRelacionados {
	
	private static final long serialVersionUID = 4723390252172647020L;
	
	@JsonProperty("tipoRelacion")
	private String tipoRelacion;
	
	@JsonProperty("cfdiRelacionado")
	private String cfdiRelacionado;
	
	@JsonProperty("metodoDPago")
	private String metodoDPago;
	
	@JsonProperty("formaDPago")
	private String formaDPago;
}

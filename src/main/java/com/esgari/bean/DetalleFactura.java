package com.esgari.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DetalleFactura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4723390252172647020L;
	
	@JsonProperty("articulos")
	private List<Articulo> articulos;
	
	@JsonProperty("descripcion")
	private String descripcion;
	
	@JsonProperty("importeConLetra")
	private String importeConLetra;
	
	@JsonProperty("iva")
	private String iva;
	
	@JsonProperty("ivaRet")
	private String ivaRet;
	
	@JsonProperty("descuento")
	private String descuento;
	
	@JsonProperty("subtotal")
	private String subtotal;
	
	@JsonProperty("total")
	private String total;
	

}

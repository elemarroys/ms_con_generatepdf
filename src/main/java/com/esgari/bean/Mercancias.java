package com.esgari.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Mercancias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7848164993896696162L;
	
	
	@JsonProperty("datosMercancias")
	private List<Mercancia> mercancias;

}

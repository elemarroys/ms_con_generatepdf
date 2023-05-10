package com.esgari.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssuingCompanyInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6397556163407664822L;
	
	@JsonProperty("issuingCompanyName")
	private String issuingCompanyName;
	
	@JsonProperty("issuingCompanyAdressLine")
	private String issuingCompanyAdressLine;
	
	@JsonProperty("issuingCompanyCity")
	private String issuingCompanyCity;
	
	@JsonProperty("issuingCompanyProvince")
	private String issuingCompanyProvince;
	
	@JsonProperty("issuingCompanyCountry")
	private String issuingCompanyCountry;
	
	@JsonProperty("issuingCompanyPhonenumber")
	private String issuingCompanyPhonenumber;
	
	@JsonProperty("issuingCompanyRfc")
	private String issuingCompanyRfc;

}

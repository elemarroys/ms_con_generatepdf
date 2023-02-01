package com.esgari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgari.bean.GeneratePDFRequestMessage;
import com.esgari.bean.GeneratePdfException;
import com.esgari.service.IGeneratePdfService;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping(value = "/api")
public class GeneratePdfController<T> {
	@Autowired
	IGeneratePdfService service;
	
	@PostMapping(path = "/generatepdf/{reportType}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<T> generatePdf(@PathVariable("reportType") String reportType,@RequestBody GeneratePDFRequestMessage request) {	
		try {
			return new ResponseEntity<T>((T) service.getPDF(request,reportType),HttpStatus.OK);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<T>((T) new GeneratePdfException("400",e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	

}

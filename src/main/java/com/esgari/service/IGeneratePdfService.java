package com.esgari.service;

import com.esgari.bean.GeneratePDFRequestMessage;
import com.esgari.bean.GeneratePDFResponseMessage;

import net.sf.jasperreports.engine.JRException;

public interface IGeneratePdfService {
	
	public GeneratePDFResponseMessage getPDF(GeneratePDFRequestMessage request,String reportType) throws JRException;

}

package com.esgari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esgari.bean.GeneratePDFRequestMessage;
import com.esgari.bean.GeneratePDFResponseMessage;
import com.esgari.jasper.IComprobanteCfdiForwarding;
import com.esgari.jasper.bean.ComprobanteCfdiForwardingBean;
import com.esgari.mapper.IComprobanteCfdiForwardingRequestMapping;
import com.esgari.mapper.IComprobanteCfdiForwardingResponseMapping;
import com.esgari.service.IGeneratePdfService;

import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
@Slf4j
@Service
public class GeneratePdfService implements IGeneratePdfService {
	
	@Autowired
	IComprobanteCfdiForwardingRequestMapping comprobanteCfdiForwardingRequestMapping;
	
	@Autowired
	IComprobanteCfdiForwardingResponseMapping comprobanteCfdiForwardingResponseMapping;
	
	@Autowired
	IComprobanteCfdiForwarding comprobanteCfdiForwarding;

	@SuppressWarnings("unchecked")
	@Override
	public GeneratePDFResponseMessage getPDF(GeneratePDFRequestMessage request,String reportType) throws JRException {
		// TODO Auto-generated method stub
			
		ComprobanteCfdiForwardingBean comprobanteCfdiForwardingBean = comprobanteCfdiForwardingRequestMapping.toRequest(request);
		String binary64PDF = comprobanteCfdiForwarding.getBase64PDF(comprobanteCfdiForwardingBean,reportType);
		GeneratePDFResponseMessage generatePDFResponseMessage = comprobanteCfdiForwardingResponseMapping.toResponse(binary64PDF);
		return generatePDFResponseMessage;

	}
	
	
	

}

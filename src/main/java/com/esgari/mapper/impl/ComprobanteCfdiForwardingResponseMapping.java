package com.esgari.mapper.impl;

import org.springframework.stereotype.Component;

import com.esgari.bean.GeneratePDFResponseMessage;
import com.esgari.mapper.IComprobanteCfdiForwardingResponseMapping;

@Component
public class ComprobanteCfdiForwardingResponseMapping implements IComprobanteCfdiForwardingResponseMapping {

	@Override
	public GeneratePDFResponseMessage toResponse(String binary64pdf) {
		// TODO Auto-generated method stub
		GeneratePDFResponseMessage generatePDFResponseMessage = new GeneratePDFResponseMessage();
		generatePDFResponseMessage.setBinary64Pdf(binary64pdf);
		return generatePDFResponseMessage;
	}

}

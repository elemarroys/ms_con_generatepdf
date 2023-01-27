package com.esgari.mapper;

import com.esgari.bean.GeneratePDFResponseMessage;

public interface IComprobanteCfdiForwardingResponseMapping {
	
	public GeneratePDFResponseMessage toResponse(String binary64PDF);

}

package com.esgari.mapper;

import com.esgari.bean.GeneratePDFRequestMessage;
import com.esgari.jasper.bean.ComprobanteCfdiForwardingBean;

public interface IComprobanteCfdiForwardingRequestMapping {
	
	public ComprobanteCfdiForwardingBean toRequest(GeneratePDFRequestMessage request); 

}

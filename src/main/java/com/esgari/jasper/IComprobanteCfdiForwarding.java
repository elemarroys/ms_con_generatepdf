package com.esgari.jasper;

import com.esgari.jasper.bean.ComprobanteCfdiForwardingBean;

import net.sf.jasperreports.engine.JRException;

public interface IComprobanteCfdiForwarding {
	
	public String getBase64PDF(ComprobanteCfdiForwardingBean request,String reportType) throws JRException;

}

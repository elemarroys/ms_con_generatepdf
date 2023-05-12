package com.esgari.jasper.bean;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Getter
@Setter
public class ComprobanteCfdiForwardingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9015829028266181409L;
	
	@SuppressWarnings("rawtypes")
	private Map parameters;
	private JRBeanCollectionDataSource datasoruce;

}

package com.esgari.jasper.impl;

import java.io.File;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.esgari.jasper.IComprobanteCfdiForwarding;
import com.esgari.jasper.bean.ComprobanteCfdiForwardingBean;
import com.esgari.utilities.GeneralParameters;

import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
@Slf4j

@Component
public class ComprobanteCfdiForwading implements IComprobanteCfdiForwarding {

	@Value("${esgari.pdf.cloudComplemento}")
	private String pdfCloudComplemento;
	@Value("${esgari.pdf.cloudFactura}")
	private String pdfCloudFactura;
	@Value("${esgari.pdf.cloudNotaCredito}")
	private String pdfCloudNotaCredito;

	@Override
	public String getBase64PDF(ComprobanteCfdiForwardingBean request,String reportType) throws JRException {
		// TODO Auto-generated method stub
		String result = "";			
		File file = null;
		try {
			switch (reportType) {
			case "cloudComplemento":
				file = ResourceUtils.getFile(pdfCloudComplemento);
				break;
			case "cloudFactura":
				file = ResourceUtils.getFile(pdfCloudFactura);
				break;
			case "cloudNotaCredito":
				file = ResourceUtils.getFile(pdfCloudNotaCredito);
				break;

			default:
				break;
			}
			 log.info("ruta de archivo: "+file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			throw new JRException("No se puede obtener el archivo jrxml");
		}
		try {
		  @SuppressWarnings("rawtypes")
	        JasperReport report = JasperCompileManager.compileReport(
	            file.getAbsolutePath());
		  
	        JasperPrint print = JasperFillManager.fillReport(report, request.getParameters(), new JREmptyDataSource());	
	          // Exporta el informe a PDF
	          //JasperExportManager.exportReportToPdfFile(print,"D:\\ERP_sol\\ESGARI\\PDF3.pdf");
	          //Para visualizar el pdf directamente desde java
	         //JasperViewer.viewReport(print, false);
	        byte[] reportArrayByte =  JasperExportManager.exportReportToPdf(print);
	        result = Base64.getEncoder().encodeToString(reportArrayByte);
		return result;
		}
		catch (Exception e) {
			throw new JRException("Error al obtener los datos de la fatura");
		}
	}

}

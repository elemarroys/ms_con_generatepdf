package com.esgari.utilities;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRException;
@Slf4j

public class GeneralParameters {
		public static Map<String,String> REPORTES;
		
		public GeneralParameters() {
			toSetReports();
		}
		
		private void toSetReports () {
		try {
			REPORTES=new HashMap<>();
			REPORTES.put("reporte1", "classpath:reports/ESGARI_reporte1.jrxml");
			REPORTES.put("reporte2", "classpath:reports/ESGARI_reporte2.jrxml");
			REPORTES.put("reporte3", "classpath:reports/ESGARI_reporte3.jrxml");
		}catch(Exception e){
			log.info("final");
		}
		}
}

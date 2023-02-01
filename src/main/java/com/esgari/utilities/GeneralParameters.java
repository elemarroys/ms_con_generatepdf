package com.esgari.utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class GeneralParameters {
	public static Map<String, File> REPORTES;

	public GeneralParameters() {
		toSetReports();
	}

	private void toSetReports() {
		try {

			REPORTES = new HashMap<>();
			REPORTES.put("cloudComplemento", new File(this.getClass().getResource("/reports/ESGARI_reporte1.jrxml").toURI()));
			REPORTES.put("cloudFactura", new File(this.getClass().getResource("/reports/ESGARI_reporte2.jrxml").toURI()));
			REPORTES.put("cloudNotaCredito",new File(this.getClass().getResource("/reports/ESGARI_reporte3.jrxml").toURI()));
		} catch (Exception e) {

			e.getStackTrace();
		}
	}
}

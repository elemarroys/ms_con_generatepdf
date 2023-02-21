package com.esgari.mapper.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.esgari.bean.GeneratePDFRequestMessage;
import com.esgari.jasper.bean.ComprobanteCfdiForwardingBean;
import com.esgari.mapper.IComprobanteCfdiForwardingRequestMapping;
import com.esgari.utilities.Numero_Letras;

import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Slf4j

@Component
public class ComprobanteCfdiForwardingRequestMapping implements IComprobanteCfdiForwardingRequestMapping {

	@Override
	public ComprobanteCfdiForwardingBean toRequest(GeneratePDFRequestMessage request) {
		ComprobanteCfdiForwardingBean comprobanteCfdiForwardingBean = new ComprobanteCfdiForwardingBean();
		comprobanteCfdiForwardingBean.setParameters(toSetParameters(request));
		comprobanteCfdiForwardingBean.setDatasoruce(toSetDataSource(request));
		return comprobanteCfdiForwardingBean;
	}

	private JRBeanCollectionDataSource toSetDataSource(GeneratePDFRequestMessage request) {
		JRBeanCollectionDataSource jRBeanCollectionDataSource = null;
		jRBeanCollectionDataSource = new JRBeanCollectionDataSource(request.getDetalleFactura().getArticulos());
		return jRBeanCollectionDataSource;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Map toSetParameters(GeneratePDFRequestMessage request) {
		try {

			Map parameters = new HashMap();
			// imagenes

			parameters.put("logoEmpresa", new FileInputStream(
					ResourceUtils.getFile("/usr/local/img/ESGARI_LOGO_1.png")));
			
			
			

			// header
			if (request.getHeader().getSerie() != null)
				parameters.put("serie", request.getHeader().getSerie());

			if (request.getHeader().getFolio() != null)
				parameters.put("folio", request.getHeader().getFolio());

			if (request.getHeader().getVersion() != null)
				parameters.put("version", request.getHeader().getVersion());

			if (request.getHeader().getRegimenFiscal() != null)
				parameters.put("regimenFiscal", request.getHeader().getRegimenFiscal());

			if (request.getHeader().getLugarExpedicion() != null)
				parameters.put("lugarExpedicion", request.getHeader().getLugarExpedicion());

			if (request.getHeader().getUsoCFDI() != null)
				parameters.put("usoCFDI", request.getHeader().getUsoCFDI());

			if (request.getHeader().getTipoMoneda() != null)
				parameters.put("tipoMoneda", request.getHeader().getTipoMoneda());

			if (request.getHeader().getFechaEmision() != null)
				parameters.put("fechaEmision", request.getHeader().getFechaEmision());

			if (request.getHeader().getTipoDeDocumento() != null)
				parameters.put("tipoDeDocumento", request.getHeader().getTipoDeDocumento());

			if (request.getHeader().getFormaDePago() != null)
				parameters.put("formaDePago", request.getHeader().getFormaDePago());

			if (request.getHeader().getTipoDeCambio() != null)
				parameters.put("tipoDeCambio", request.getHeader().getTipoDeCambio());

			if (request.getHeader().getPedimento() != null)
				parameters.put("pedimento", request.getHeader().getPedimento());

			if (request.getHeader().getMetodoDePago() != null)
				parameters.put("metodoDePago", request.getHeader().getMetodoDePago());
			// cliente

			if (request.getCliente().getNombre() != null)
				parameters.put("nombre", request.getCliente().getNombre());

			if (request.getCliente().getRfc() != null)
				parameters.put("rfc", request.getCliente().getRfc());

			if (request.getCliente().getDomicilio() != null)
				parameters.put("domicilio", request.getCliente().getDomicilio());

			if (request.getCliente().getResidenciaFiscal() != null)
				parameters.put("residenciaFiscal", request.getCliente().getResidenciaFiscal());

			if (request.getCliente().getNoRegId() != null)
				parameters.put("noRegId", request.getCliente().getNoRegId());

			if (request.getCliente().getObservaciones() != null)
				parameters.put("observaciones", request.getCliente().getObservaciones());
			// articulos

			if (request.getDetalleFactura().getArticulos() != null)
				parameters.put("cd", new JRBeanCollectionDataSource(request.getDetalleFactura().getArticulos()));
			// factura

			if (request.getDetalleFactura().getDescripcion() != null)
				parameters.put("descripcion", request.getDetalleFactura().getDescripcion());

			if (request.getDetalleFactura().getImporteConLetra() != null)
				parameters.put("importeConLetra", toSetImporteConLetra(request.getDetalleFactura().getTotal()));

			if (request.getDetalleFactura().getIva() != null)
				parameters.put("iva", request.getDetalleFactura().getIva());

			if (request.getDetalleFactura().getIvaRet() != null)
				parameters.put("ivaRet", request.getDetalleFactura().getIvaRet());

			if (request.getDetalleFactura().getDescuento() != null)
				parameters.put("descuento", request.getDetalleFactura().getDescuento());

			if (request.getDetalleFactura().getSubtotal() != null)
				parameters.put("subtotal", request.getDetalleFactura().getSubtotal());

			if (request.getDetalleFactura().getTotal() != null)
				parameters.put("total", request.getDetalleFactura().getTotal());
			// CFDI RELACIONADOS
			if (request.getCfdiRelacionados() != null) {
				if (request.getCfdiRelacionados().getTipoRelacion() != null)
					parameters.put("tipoRelacion", request.getCfdiRelacionados().getTipoRelacion());

				if (request.getCfdiRelacionados().getCfdiRelacionado() != null)
					parameters.put("cfdiRelacionado", request.getCfdiRelacionados().getCfdiRelacionado());

				if (request.getCfdiRelacionados().getMetodoDPago() != null)
					parameters.put("metodoDPago", request.getCfdiRelacionados().getMetodoDPago());

				if (request.getCfdiRelacionados().getFormaDPago() != null)
					parameters.put("formaDPago", request.getCfdiRelacionados().getFormaDPago());
			}
			// certificados

		if(request.getCertificado()!=null) {
				if (request.getCertificado().getSerieCertificadoEmisor() != null)
					parameters.put("serieCertificadoEmisor", request.getCertificado().getSerieCertificadoEmisor());

				if (request.getCertificado().getFolioFiscalUUID() != null)
					parameters.put("folioFiscalUUID", request.getCertificado().getFolioFiscalUUID());

				if (request.getCertificado().getNoSerieCertificadoSat() != null)
					parameters.put("serieCertificadoSat", request.getCertificado().getNoSerieCertificadoSat());

				if (request.getCertificado().getFechaHoraCertificacion() != null)
					parameters.put("fechayHoraCertificacion", request.getCertificado().getFechaHoraCertificacion());
			}
			// ComplementoPago
			if (request.getComplementoPago() != null) {
				if (request.getComplementoPago().getFechaHoraPago() != null)
					parameters.put("fechaHoraPago", request.getComplementoPago().getFechaHoraPago());

				if (request.getComplementoPago().getRFCEmisorCtaOrdenate() != null)
					parameters.put("rFCEmisorCtaOrdenate", request.getComplementoPago().getRFCEmisorCtaOrdenate());

				if (request.getComplementoPago().getRFCEmisorCtaBeneficiario() != null)
					parameters.put("rFCEmisorCtaBeneficiario",
							request.getComplementoPago().getRFCEmisorCtaBeneficiario());

				if (request.getComplementoPago().getFormaPago() != null)
					parameters.put("formaPago", request.getComplementoPago().getFormaPago());

				if (request.getComplementoPago().getNombreBancoCtaOrdenante() != null)
					parameters.put("nombreBancoCtaOrdenante",
							request.getComplementoPago().getNombreBancoCtaOrdenante());

				if (request.getComplementoPago().getNombreBancoCtaBeneficiario() != null)
					parameters.put("nombreBancoCtaBeneficiario",
							request.getComplementoPago().getNombreBancoCtaBeneficiario());

				if (request.getComplementoPago().getMoneda() != null)
					parameters.put("moneda", request.getComplementoPago().getMoneda());

				if (request.getComplementoPago().getCtaOrdenate() != null)
					parameters.put("ctaOrdenate", request.getComplementoPago().getCtaOrdenate());

				if (request.getComplementoPago().getCtaBeneficiario() != null)
					parameters.put("ctaBeneficiario", request.getComplementoPago().getCtaBeneficiario());

				if (request.getComplementoPago().getTipoCambio() != null)
					parameters.put("tipoCambio", request.getComplementoPago().getTipoCambio());

				if (request.getComplementoPago().getNoOperacion() != null)
					parameters.put("noOperacion", request.getComplementoPago().getNoOperacion());

				if (request.getComplementoPago().getMonto() != null)
					parameters.put("monto", request.getComplementoPago().getMonto());

				if (request.getComplementoPago().getTipoCadenaPago() != null)
					parameters.put("tipoCadenaPago", request.getComplementoPago().getTipoCadenaPago());

				if (request.getComplementoPago().getImporteLetra() != null)
					parameters.put("importeLetra", request.getComplementoPago().getImporteLetra());

				if (request.getComplementoPago().getCertificadoPago() != null)
					parameters.put("certificadoPago", request.getComplementoPago().getCertificadoPago());

				if (request.getComplementoPago().getCadenaOriginalComprobantePago() != null)
					parameters.put("cadenaOriginalComprobantePago",
							request.getComplementoPago().getCadenaOriginalComprobantePago());

				if (request.getComplementoPago().getSelloPago() != null)
					parameters.put("selloPago", request.getComplementoPago().getSelloPago());

			}

			// ComplementoPago
			if (request.getDoctosRelacionados() != null)
				parameters.put("ds",
						new JRBeanCollectionDataSource(request.getDoctosRelacionados().getDocumentosRelacionados()));

			// Sellos
			if (request.getSellos().getCadenaOriginal() != null)
				parameters.put("cadenaOriginal", request.getSellos().getCadenaOriginal());

			if (request.getSellos().getSelloSat() != null)
				parameters.put("selloSat", request.getSellos().getSelloSat());

			if (request.getSellos().getSelloDigitalCDFI() != null)
				parameters.put("selloDigitalCDFI", request.getSellos().getSelloDigitalCDFI());

			// LogoQR
			if (!request.getSellos().getQRbase64().equals("") || request.getSellos().getQRbase64() == null) {
				parameters.put("LogoQR", toSetQr(request.getSellos().getQRbase64()));
			}
			return parameters;
		}catch(

	Exception e)
	{
		e.printStackTrace();
		log.error("Error al obtener los parametros del reporte ", e.getMessage());
		return null;
	}
	}



	private ByteArrayInputStream toSetQr(String qRbase64) {
		// TODO Auto-generated method stub
		return new ByteArrayInputStream(Base64.getDecoder().decode(qRbase64));
	}


	private String toSetImporteConLetra(String total) {
		return new Numero_Letras().Convertir(total,true);
	}
	

}

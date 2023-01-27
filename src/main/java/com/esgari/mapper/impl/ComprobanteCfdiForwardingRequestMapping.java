package com.esgari.mapper.impl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.jfree.util.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.esgari.bean.GeneratePDFRequestMessage;
import com.esgari.jasper.bean.ComprobanteCfdiForwardingBean;
import com.esgari.mapper.IComprobanteCfdiForwardingRequestMapping;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
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
		//imagenes
		parameters.put("logoEmpresa",new FileInputStream(ResourceUtils.getFile("classpath:img/ESGARI_LOGO_1.png")));
		//header
		parameters.put("serie", request.getHeader().getSerie());
		parameters.put("folio", request.getHeader().getFolio());
		parameters.put("version", request.getHeader().getVersion());
		parameters.put("regimenFiscal", request.getHeader().getRegimenFiscal());
		parameters.put("lugarExpedicion", request.getHeader().getLugarExpedicion());
		parameters.put("usoCFDI", request.getHeader().getUsoCFDI());
		parameters.put("tipoMoneda", request.getHeader().getTipoMoneda());
		parameters.put("fechaEmision",request.getHeader().getFechaEmision());
		parameters.put("tipoDeDocumento",request.getHeader().getTipoDeDocumento());
		parameters.put("formaDePago",request.getHeader().getFormaDePago());
		parameters.put("tipoDeCambio",request.getHeader().getTipoDeCambio());
		parameters.put("pedimento",request.getHeader().getPedimento());
		parameters.put("metodoDePago",request.getHeader().getMetodoDePago());
		//cliente
		parameters.put("nombre", request.getCliente().getNombre());
		parameters.put("rfc", request.getCliente().getRfc());
		parameters.put("domicilio", request.getCliente().getDomicilio());
		parameters.put("residenciaFiscal", request.getCliente().getResidenciaFiscal());
		parameters.put("noRegId", request.getCliente().getNoRegId());
		parameters.put("observaciones",request.getCliente().getObservaciones());
		//articulos
		parameters.put("cd", new JRBeanCollectionDataSource(request.getDetalleFactura().getArticulos()));
		//factura
		parameters.put("descripcion",request.getDetalleFactura().getDescripcion());
		parameters.put("importeConLetra",request.getDetalleFactura().getImporteConLetra());
		parameters.put("iva",request.getDetalleFactura().getIva());
		parameters.put("ivaRet",request.getDetalleFactura().getIvaRet());
		parameters.put("descuento",request.getDetalleFactura().getDescuento());
		parameters.put("subtotal",request.getDetalleFactura().getSubtotal());
		parameters.put("total",request.getDetalleFactura().getTotal());
		//CFDI RELACIONADOS
		parameters.put("tipoRelacion",request.getCfdiRelacionados().getTipoRelacion());
		parameters.put("cfdiRelacionado",request.getCfdiRelacionados().getCfdiRelacionado());
		parameters.put("metodoDPago",request.getCfdiRelacionados().getMetodoDPago());
		parameters.put("formaDPago",request.getCfdiRelacionados().getFormaDPago());
		//certificados
		parameters.put("serieCertificadoEmisor", request.getCertificado().getSerieCertificadoEmisor());
		parameters.put("folioFiscalUUID",request.getCertificado().getFolioFiscalUUID());
		parameters.put("serieCertificadoSat",request.getCertificado().getNoSerieCertificadoSat());
		parameters.put("fechayHoraCertificacion",request.getCertificado().getFechaHoraCertificacion());
		//ComplementoPago
		parameters.put("fechaHoraPago", request.getComplementoPago().getFechaHoraPago());
		parameters.put("rFCEmisorCtaOrdenate", request.getComplementoPago().getRFCEmisorCtaOrdenate());
		parameters.put("rFCEmisorCtaBeneficiario", request.getComplementoPago().getRFCEmisorCtaBeneficiario());
		parameters.put("formaPago", request.getComplementoPago().getFormaPago());
		parameters.put("nombreBancoCtaOrdenante", request.getComplementoPago().getNombreBancoCtaOrdenante());
		parameters.put("nombreBancoCtaBeneficiario", request.getComplementoPago().getNombreBancoCtaBeneficiario());
		parameters.put("moneda", request.getComplementoPago().getMoneda());
		parameters.put("ctaOrdenate", request.getComplementoPago().getCtaOrdenate());
		parameters.put("ctaBeneficiario", request.getComplementoPago().getCtaBeneficiario());
		parameters.put("tipoCambio", request.getComplementoPago().getTipoCambio());
		parameters.put("noOperacion", request.getComplementoPago().getNoOperacion());
		parameters.put("monto", request.getComplementoPago().getMonto());
		parameters.put("tipoCadenaPago", request.getComplementoPago().getTipoCadenaPago());
		parameters.put("importeLetra", request.getComplementoPago().getImporteLetra());
		parameters.put("certificadoPago", request.getComplementoPago().getCertificadoPago());
		parameters.put("cadenaOriginalComprobantePago", request.getComplementoPago().getCadenaOriginalComprobantePago());
		parameters.put("selloPago", request.getComplementoPago().getSelloPago());
		//ComplementoPago
		parameters.put("ds", new JRBeanCollectionDataSource(request.getDoctosRelacionados().getDocumentosRelacionados()));
		//Sellos
		parameters.put("cadenaOriginal", request.getSellos().getCadenaOriginal());
		parameters.put("selloSat", request.getSellos().getSelloSat());
		parameters.put("selloDigitalCDFI", request.getSellos().getSelloDigitalCDFI());
		//LogoQR
		if(!request.getSellos().getQRbase64().equals("") || request.getSellos().getQRbase64()==null) {
			parameters.put("LogoQR", toSetQr(request.getSellos().getQRbase64()));
		}
		return parameters;
		}catch(Exception e){
			log.error("Error al obtener los parametros del reporte ", e);
			return null;
		}
	}

	private ByteArrayInputStream toSetQr(String qRbase64) {
		// TODO Auto-generated method stub
		return new ByteArrayInputStream(Base64.getDecoder().decode(qRbase64));
	}

}

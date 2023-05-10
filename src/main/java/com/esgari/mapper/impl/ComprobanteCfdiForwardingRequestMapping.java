package com.esgari.mapper.impl;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;


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
			
			
			// issuingCompanyInformation
			if (request.getIssuingCompanyInformation().getIssuingCompanyName() != null)
				parameters.put("issuingCompanyName", request.getIssuingCompanyInformation().getIssuingCompanyName());

			if (request.getIssuingCompanyInformation().getIssuingCompanyAdressLine() != null)
				parameters.put("issuingCompanyAdressLine", request.getIssuingCompanyInformation().getIssuingCompanyAdressLine());
			
			if (request.getIssuingCompanyInformation().getIssuingCompanyCity() != null)
				parameters.put("issuingCompanyCity", request.getIssuingCompanyInformation().getIssuingCompanyCity());
			
			if (request.getIssuingCompanyInformation().getIssuingCompanyCountry() != null)
				parameters.put("issuingCompanyCountry", request.getIssuingCompanyInformation().getIssuingCompanyCountry());
			
			if (request.getIssuingCompanyInformation().getIssuingCompanyProvince() != null)
				parameters.put("issuingCompanyProvince", request.getIssuingCompanyInformation().getIssuingCompanyProvince());
			
			if (request.getIssuingCompanyInformation().getIssuingCompanyPhonenumber() != null)
				parameters.put("issuingCompanyPhonenumber", request.getIssuingCompanyInformation().getIssuingCompanyPhonenumber());
			
			if (request.getIssuingCompanyInformation().getIssuingCompanyRfc() != null)
				parameters.put("issuingCompanyRfc", request.getIssuingCompanyInformation().getIssuingCompanyRfc());


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


				if (request.getHeader().getOrderReleaseID() != null)
				parameters.put("orderReleaseID", request.getHeader().getOrderReleaseID());
			
			if (request.getHeader().getUnidad() != null)
				parameters.put("unidad", request.getHeader().getUnidad());
			
			if (request.getHeader().getNoTracto() != null)
				parameters.put("noTracto", request.getHeader().getNoTracto());
			
			if (request.getHeader().getNoCajas() != null)
				parameters.put("noCajas", request.getHeader().getNoCajas());
			
			if (request.getHeader().getPlacas() != null)
				parameters.put("placas", request.getHeader().getPlacas());
			
			if (request.getHeader().getPlacas2() != null)
				parameters.put("placas2", request.getHeader().getPlacas2());
			
			if (request.getHeader().getNombreOperador() != null)
				parameters.put("nombreOperador", request.getHeader().getNombreOperador());
			
			if (request.getHeader().getNombreCargador() != null)
				parameters.put("nombreCargador", request.getHeader().getNombreCargador());
			
			if (request.getHeader().getKmSalida() != null)
				parameters.put("kmSalida", request.getHeader().getKmSalida());
			
			if (request.getHeader().getCombustibleSalida() != null)
				parameters.put("combustibleSalida", request.getHeader().getCombustibleSalida());
			
			if (request.getHeader().getProyecto() != null)
				parameters.put("proyecto", request.getHeader().getProyecto());
			
			if (request.getHeader().getContenedor() != null)
				parameters.put("contenedor", request.getHeader().getContenedor());
			
			if (request.getHeader().getRecorrido() != null)
				parameters.put("recorrido", request.getHeader().getRecorrido());
			
			if (request.getHeader().getFolioFiscal() != null)
				parameters.put("folioFiscal", request.getHeader().getFolioFiscal());
			
			if (request.getHeader().getNumeroDeCertificado() != null)
				parameters.put("numeroDeCertificado", request.getHeader().getNumeroDeCertificado());
			
			if (request.getHeader().getFechaYHoraDeCertificacion() != null)
				parameters.put("fechaYHoraDeCertificacion", request.getHeader().getFechaYHoraDeCertificacion());
			
			if (request.getHeader().getNumeroDeCertificadoDelSat() != null)
				parameters.put("numeroDeCertificadoDelSat", request.getHeader().getNumeroDeCertificadoDelSat());

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

// DetallesDireccesiones
			
if (request.getDetallesDirreciones().getOrigen() != null)
parameters.put("origen", request.getDetallesDirreciones().getOrigen());

if (request.getDetallesDirreciones().getDestino() != null)
parameters.put("destino", request.getDetallesDirreciones().getDestino());

if (request.getDetallesDirreciones().getRemitenteOExpedidor() != null)
parameters.put("remitenteOExpedidor", request.getDetallesDirreciones().getRemitenteOExpedidor());

if (request.getDetallesDirreciones().getDestinatario() != null)
parameters.put("destinatario", request.getDetallesDirreciones().getDestinatario());

if (request.getDetallesDirreciones().getDomicilio1() != null)
parameters.put("domicilio1", request.getDetallesDirreciones().getDomicilio1());

if (request.getDetallesDirreciones().getDomicilio2() != null)
parameters.put("domicilio2", request.getDetallesDirreciones().getDomicilio2());

if (request.getDetallesDirreciones().getDomicilio2() != null)
parameters.put("seRecogeraEn", request.getDetallesDirreciones().getDomicilio2());

if (request.getDetallesDirreciones().getRFC() != null)
parameters.put("RFC", request.getDetallesDirreciones().getRFC());

if (request.getDetallesDirreciones().getFechaCarga() != null)
parameters.put("fechaCarga", request.getDetallesDirreciones().getFechaCarga());

if (request.getDetallesDirreciones().getFechaOPlazoPrevisto() != null)
parameters.put("fechaOPlazoPrevisto", request.getDetallesDirreciones().getFechaOPlazoPrevisto());

if (request.getDetallesDirreciones().getDesignacionMercanciaATransportar() != null)
parameters.put("designacionMercanciaATransportar", request.getDetallesDirreciones().getDesignacionMercanciaATransportar());

if (request.getDetallesDirreciones().getResiduoPeligrosoSi() != null)
parameters.put("getResiduoPeligrosoSi", request.getDetallesDirreciones().getResiduoPeligrosoSi());

if (request.getDetallesDirreciones().getResiduoPeligrosoNo() != null)
parameters.put("getResiduoPeligrosoNo", request.getDetallesDirreciones().getResiduoPeligrosoNo());

if (request.getDetallesDirreciones().getPeso() != null)
parameters.put("peso", request.getDetallesDirreciones().getPeso());

if (request.getDetallesDirreciones().getMetrosCubicos() != null)
parameters.put("metrosCubicos", request.getDetallesDirreciones().getMetrosCubicos());

if (request.getDetallesDirreciones().getLitros() != null)
parameters.put("litros", request.getDetallesDirreciones().getLitros());

if (request.getDetallesDirreciones().getValorDeclarado() != null)
parameters.put("valorDeclarado", request.getDetallesDirreciones().getValorDeclarado());

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

			if (request.getDetalleFactura().getIndemnizacion() != null)
				parameters.put("indemnizacion", request.getDetalleFactura().getIndemnizacion());
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
			
			if (request.getSellos().getObservacion() != null)
				parameters.put("observacion", request.getSellos().getObservacion());
			
			if (request.getSellos().getCantidadConLetra() != null)
				parameters.put("cantidadConLetra", request.getSellos().getCantidadConLetra());

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

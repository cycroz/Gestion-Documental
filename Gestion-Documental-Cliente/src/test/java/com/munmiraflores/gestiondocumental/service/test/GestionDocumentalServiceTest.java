package com.munmiraflores.gestiondocumental.service.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.munmiraflores.gestiondocumental.domain.Documentos;
import com.munmiraflores.gestiondocumental.service.GestiondocumentalService;

public class GestionDocumentalServiceTest {

	
	private GestiondocumentalService gestiondocumentalService = null;
	
	public GestionDocumentalServiceTest()
	{
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.gestiondocumentalService = (GestiondocumentalService) context.getBean("gestiondocumentalServiceClient");
	}
	
	
	@Test
	public void testGetDatosGenerales() {
		
		List<Documentos> lista = gestiondocumentalService.getDatosGenerales(2012, 100, "EXPE");
		//System.out.println(lista.size());
		for(Documentos d:lista) {
			System.out.println("TIPO_NUMERO_ANNO:"+d.getTpodoccod()+"-"+d.getDoccor()+"-"+d.getDocanonum()+" FEC_INGRESO:"+d.getDocfchcre()+
					" ESTADO:"+d.getEstados().getStsdsc()+" SOLICITANTE:"+d.getDocsolncmp()+" DNI:"+d.getPersonas().getDni()+" RUCM:"+d.getPersonas().getRuc()+
					" ASUNTO:"+d.getDocasu()+" FOLIO:"+d.getDocnumfol()+" DOCUOACTCO:"+d.getDocuoactco()+" UO_ACTUAL:"+d.getUnidadOrganica().getUniorgnom()+
					" DOCCARACTC:"+d.getDoccaractc()+" CARGO_ACTUAL:"+d.getCargo().getCardsc()+" DIRE_FISCAL:"+d.getDocdirfisc()+" DIR_CORRESPONDENCIA:"+d.getDocdircorc()+
					" DIR_INMUEBLE:"+d.getDvigucdir()+" OBSERVACIONES:"+d.getDocobs()+" HOJA_DE_CARGO:"+d.getDocflghc()+" ANEXADO:"+d.getDocflganx()+
					" ARCHIVADO:"+d.getDocflgarc()+" DOCUSRCRE:"+d.getDocusrcre()+" USUARIO_CREACIO:"+d.getUsuariosa().getUsrlog()+" FEC_CREACION:"+d.getDocfchcre()+
					" DOCUSRMOD:"+d.getDocusrmod()+" USUARIO_MODIFICA:"+d.getUsuariosb().getUsrlog()+" FEC_MOD:"+d.getDocfchmod());
		}
		
		
    }
	
}

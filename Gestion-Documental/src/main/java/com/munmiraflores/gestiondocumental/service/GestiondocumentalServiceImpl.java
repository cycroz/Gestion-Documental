package com.munmiraflores.gestiondocumental.service;

import java.util.List;

import javax.jws.WebService;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.munmiraflores.gestiondocumental.domain.Documentos;

@SuppressWarnings("restriction")
@WebService(endpointInterface="com.munmiraflores.gestiondocumental.service.GestiondocumentalService")
@Service("gestiondocumentalService")
@Transactional
public class GestiondocumentalServiceImpl implements GestiondocumentalService {

	protected static Logger logger = Logger.getLogger("service");
	
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	public List<Documentos> getDatosGenerales(Integer docanonum, Integer doccor, String tpodoccod) {
		try {
			logger.debug("Recuperando todos los Datos Generales");
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("SELECT tpodoccod, doccor, docanonum, docfchcre, estados.stsdsc, docsolncmp, personas.dni, personas.ruc, docasu, docnumfol, docuoactco, unidadOrganica.uniorgnom, doccaractc, cargo.cardsc, docdirfisc, docdircorc, dvigucdir, docobs, docflghc, docflganx, docflgarc, docusrcre, usuariosa.usrlog, docfchcre, docusrmod, usuariosb.usrlog, docfchmod FROM Documentos WHERE docstscod=estados.stscod AND docsolcon=personas.con AND docuoactco=unidadOrganica.uniorgcod AND doccaractc=cargo.carcod AND docusrcre= usuariosa.usrcod AND docusrmod = usuariosb.usrcod AND docanonum="+docanonum+" AND doccor="+doccor+" AND tpodoccod='"+tpodoccod+"'");
			//Query query = session.createQuery("FROM Documentos");
			return  query.list();
		} catch (Exception e) {
			System.out.print(e.getMessage());
			// TODO: handle exception
			return null;
		}
	}

}


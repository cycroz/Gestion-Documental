package com.munmiraflores.gestiondocumental.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.munmiraflores.gestiondocumental.domain.Documentos;

@SuppressWarnings("restriction")
@WebService
public interface GestiondocumentalService {
	
	public List<Documentos> getDatosGenerales(
			@WebParam(name = "docanonum") Integer docanonum,
			@WebParam(name = "doccor") Integer doccor,
			@WebParam(name = "tpodoccod") String tpodoccod
			);

}

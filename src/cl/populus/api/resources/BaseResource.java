package cl.populus.api.resources;

import cl.populus.api.dao.BoletinDao;
import cl.populus.api.dao.RepresentanteDao;

/*
 * cgajardo: Factory para los dao 
 * + elementos transversales a todos los recursos
 */
public class BaseResource {
	
	
	/* REPRESENTANTE DAO */
	private RepresentanteDao representanteDao;
	protected RepresentanteDao getRepresentanteDao() {
		
		if(representanteDao!=null) return representanteDao;
		
		representanteDao = new RepresentanteDao();
		return representanteDao;
	}
	
	/* BOLETIN DAO */
	private BoletinDao boletinDao;
	protected BoletinDao getBoletinDao(){
		
		if(boletinDao != null) return boletinDao;
		
		boletinDao = new BoletinDao();
		return boletinDao;
	}
	
}

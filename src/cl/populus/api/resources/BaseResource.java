package cl.populus.api.resources;

import cl.populus.api.dao.BoletinDao;
import cl.populus.api.dao.EstadisticaDao;
import cl.populus.api.dao.RepresentanteDao;
import cl.populus.api.dao.VotacionDao;

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
	
	/* VOTACION DAO */
	private VotacionDao votacionDao;
	protected VotacionDao getVotacionDao(){
		
		if(votacionDao != null) return votacionDao;
		
		votacionDao = new VotacionDao();
		return votacionDao;
	}
	
	/* ESTADISTICA DAO */
	private EstadisticaDao estadisticaDao;
	protected EstadisticaDao getEstadisticaDao(){
		
		if(estadisticaDao != null) return estadisticaDao;
		
		estadisticaDao = new EstadisticaDao();
		return estadisticaDao;
	}
	
}

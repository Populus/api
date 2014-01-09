package cl.populus.api.entities;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaVotaciones {
	
	private List<Votacion> votaciones;
	
	public List<Votacion> getVotaciones() {
		return votaciones;
	}
	public void setVotaciones(List<Votacion> votaciones) {
		this.votaciones = votaciones;
	}
	

}

package cl.populus.api.entities;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaTramitaciones {
	
	private List<Tramitacion> tramitaciones;
	
	public List<Tramitacion> getTramitaciones() {
		return tramitaciones;
	}
	public void setTramitaciones(List<Tramitacion> tramitaciones) {
		this.tramitaciones = tramitaciones;
	}
	

}

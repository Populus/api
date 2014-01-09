package cl.populus.api.entities;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaEstadisticas {
	
	private List<Estadistica> estadisticas;

	/**
	 * @return the estadisticas
	 */
	public List<Estadistica> getEstadisticas() {
		return estadisticas;
	}
	/**
	 * @param estadisticas the estadisticas to set
	 */
	public void setEstadisticas(List<Estadistica> estadisticas) {
		this.estadisticas = estadisticas;
	}
	

}

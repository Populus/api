package cl.populus.api.entities;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaBoletines {
	
	private List<Boletin> boletines;
	
	public List<Boletin> getBoletines() {
		return boletines;
	}
	public void setBoletines(List<Boletin> boletines) {
		this.boletines = boletines;
	}
	

}

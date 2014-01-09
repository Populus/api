package cl.populus.api.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Votacion {
	
	private long id;
	private Tramitacion tramitacion;
	private List<Voto> votos;
	private String tema;
	
	
	public Tramitacion getTramitacion() {
		return tramitacion;
	}
	public void setTramitacion(Tramitacion tramitacion) {
		this.tramitacion = tramitacion;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}

package cl.populus.api.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comision {
	
	private long id;
	private String nombre;
	private List<Representante> integrantes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Representante> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(List<Representante> integrantes) {
		this.integrantes = integrantes;
	}
	
	

}

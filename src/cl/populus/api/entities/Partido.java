package cl.populus.api.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Partido {
	
	//cgajardo: usaremos la sigla como llave de la entidad
	private String sigla;
	private String nombre;
	private String website;
	//cgajardo: TODO: definir los campos de un partido politico
	
	//cgajardo: constructor vacío default
	public Partido(){
		
	}
	//cgajardo: constructor para facilitarnos el llenado de datos;
	public Partido(String sigla, String nombre){
		this.sigla = sigla;
		this.nombre = nombre;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
}

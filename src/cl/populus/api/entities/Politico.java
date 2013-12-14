package cl.populus.api.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Politico {
	
	private String nombres;
	private String apellido;
	private Partido partido;
	private DatosContacto contacto;
	
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public DatosContacto getContacto() {
		return contacto;
	}
	public void setContacto(DatosContacto contacto) {
		this.contacto = contacto;
	}
	 

}

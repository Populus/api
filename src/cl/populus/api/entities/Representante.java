package cl.populus.api.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Representante {
	
	private long id;
	private String nombres;
	private String apellido;
	private Partido partido;
	//cgajardo: indica si corresponde a un diputado/senador
	private String cargo;
	private String area;
	//cgajardo: definir objeto de asistencia?
	private String asistencia;
	private String twitter;
	private String facebook;
	private String docLegislador;
	
	
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(String asistencia) {
		this.asistencia = asistencia;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getDocLegislador() {
		return docLegislador;
	}
	public void setDocLegislador(String docLegislador) {
		this.docLegislador = docLegislador;
	}
	
	 

}

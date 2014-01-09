package cl.populus.api.entities;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tramitacion {
	
	private long id;
	private String nroBoletin;
	private String sesion;
	private Date fecha;
	private String etapa;
	private List<Votacion> votaciones;
	private String docComparado;
	private String docInforme;
	private String docDiscusion;
	
	
	//cgajardo: constructor default
	public Tramitacion(){
	}
	//cgajardo: constructor minimo
	public Tramitacion(long id, String sesion, String boletin){
		this.id = id;
		this.sesion =sesion;
		this.nroBoletin = boletin;
	}
	//cgajardo: constructor completo
	public Tramitacion(long id, String sesion, Date fecha, String boletin, String etapa){
		this.id = id;
		this.sesion = sesion;
		this.fecha = fecha;
		this.nroBoletin = boletin;
		this.etapa = etapa;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSesion() {
		return sesion;
	}
	public void setSesion(String sesion) {
		this.sesion = sesion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getBoletin() {
		return nroBoletin;
	}
	public void setBoletin(String boletin) {
		this.nroBoletin = boletin;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getNroBoletin() {
		return nroBoletin;
	}
	public void setNroBoletin(String nroBoletin) {
		this.nroBoletin = nroBoletin;
	}
	public String getDocComparado() {
		return docComparado;
	}
	public void setDocComparado(String docComparado) {
		this.docComparado = docComparado;
	}
	public String getDocInforme() {
		return docInforme;
	}
	public void setDocInforme(String docInforme) {
		this.docInforme = docInforme;
	}
	public String getDocDiscusion() {
		return docDiscusion;
	}
	public void setDocDiscusion(String docDiscusion) {
		this.docDiscusion = docDiscusion;
	}
	public List<Votacion> getVotaciones() {
		return votaciones;
	}
	public void setVotaciones(List<Votacion> votaciones) {
		this.votaciones = votaciones;
	}

}

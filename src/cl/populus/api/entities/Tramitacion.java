package cl.populus.api.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tramitacion {
	
	private long id;
	private String sesion;
	private Date fecha;
	private String boletin;
	private String etapa;
	private String subetapa;
	
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
		return boletin;
	}
	public void setBoletin(String boletin) {
		this.boletin = boletin;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getSubetapa() {
		return subetapa;
	}
	public void setSubetapa(String subetapa) {
		this.subetapa = subetapa;
	}
	

}

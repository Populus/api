package cl.populus.api.entities;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Boletin {
	
	private long id;
	private String numero;
	private String titulo;
	private Date fechaIngreso;
	private String origen;
	private List<Representante> autores;
	private String urgencia;
	private String etapa;
	private String leyNro;
	//cgajardo: TODO definir tipo de refundidos
	private List<Long> refundidos;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public List<Representante> getAutores() {
		return autores;
	}
	public void setAutores(List<Representante> autores) {
		this.autores = autores;
	}
	public String getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getLeyNro() {
		return leyNro;
	}
	public void setLeyNro(String leyNro) {
		this.leyNro = leyNro;
	}
	public List<Long> getRefundidos() {
		return refundidos;
	}
	public void setRefundidos(List<Long> refundidos) {
		this.refundidos = refundidos;
	}
	

}

package cl.populus.api.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Voto {
	
	private Representante politico;
	private String valor;
	
	public Representante getPolitico() {
		return politico;
	}
	public void setPolitico(Representante politico) {
		this.politico = politico;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

}

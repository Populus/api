package cl.populus.api.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Voto {
	
	private Politico politico;
	private String valor;
	
	public Politico getPolitico() {
		return politico;
	}
	public void setPolitico(Politico politico) {
		this.politico = politico;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

}

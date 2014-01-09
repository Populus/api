package cl.populus.api.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.populus.api.entities.Boletin;
import cl.populus.api.entities.ListaTramitaciones;
import cl.populus.api.entities.ListaVotaciones;
import cl.populus.api.entities.Tramitacion;
import cl.populus.api.entities.Votacion;

public class BoletinDao extends BaseDao {
	
	public Boletin getByNumero(String numero){
		Boletin response = null;
		try {
			Statement stmt = getConnection().createStatement();
			PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM proyecto_de_ley WHERE nro_boletin = ?");
			ps.setString(1, numero);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				response = new Boletin();
				response.setNumero(numero);
				response.setFechaIngreso(rs.getDate("fecha_ingreso"));
				response.setTitulo(rs.getString("titulo_proyecto"));
				response.setEtapa(rs.getString("etapa"));
				response.setUrgencia(rs.getString("urgencia_actual"));
				response.setLeyNro(rs.getString("nro_ley"));
				response.setOrigen(rs.getString("camara_origen"));
				response.setTramitaciones(getTramitacionByNumero(numero).getTramitaciones());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}

	public ListaTramitaciones getTramitacionByNumero(String numero) {
		List<Tramitacion> response = new ArrayList<Tramitacion>();
		try {
			Statement stmt = getConnection().createStatement();
			PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM tramitacion WHERE nro_boletin = ?");
			ps.setString(1, numero);
			ResultSet rs = ps.executeQuery();
			while(rs.next() != false){
				Tramitacion t = new Tramitacion();
				t.setNroBoletin(numero);
				t.setSesion(rs.getString("sesion"));
				t.setEtapa(rs.getString("etapa"));
				t.setVotaciones(getVotacionByIdTramitacion(rs.getString("id")).getVotaciones());
				response.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ListaTramitaciones lt = new ListaTramitaciones();
		lt.setTramitaciones(response);
		return lt;
	}
	
	public ListaVotaciones getVotacionByIdTramitacion(String idTramitacion) {
		List<Votacion> response = new ArrayList<Votacion>();
		try {
			Statement stmt = getConnection().createStatement();
			PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM votacion_sala WHERE id_tramitacion = ?");
			ps.setString(1, idTramitacion);
			ResultSet rs = ps.executeQuery();
			while(rs.next() != false){
				Votacion v = new Votacion();
				v.setTema(rs.getString("tema"));
				v.setId(rs.getShort("id"));
				response.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ListaVotaciones lv = new ListaVotaciones();
		lv.setVotaciones(response);
		return lv;
	}

}

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
import cl.populus.api.entities.ListaVotos;
import cl.populus.api.entities.Tramitacion;
import cl.populus.api.entities.Votacion;
import cl.populus.api.entities.Voto;

public class VotacionDao extends BaseDao {
	
	public Votacion getById(String idVotacion){
		Votacion response = null;
		try {
			Statement stmt = getConnection().createStatement();
			PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM votacion_sala WHERE id = ?");
			ps.setString(1, idVotacion);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
					response = new Votacion();
					response.setTema(rs.getString("tema"));
					response.setId(rs.getShort("id"));
					response.setVotos(getVotosByIdVotacion(idVotacion).getVotos());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}

	public ListaVotos getVotosByIdVotacion(String idVotacion) {
		List<Voto> response = new ArrayList<Voto>();
		try {
			Statement stmt = getConnection().createStatement();
			PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM voto_sala WHERE id_votacion = ?");
			ps.setString(1, idVotacion);
			ResultSet rs = ps.executeQuery();
			RepresentanteDao rd = new RepresentanteDao();
			while(rs.next() != false){
				Voto v = new Voto();
				v.setValor(rs.getString("valor"));
				v.setPolitico(rd.getRepresentanteById(rs.getLong("id_politico")));
				response.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ListaVotos lv = new ListaVotos();
		lv.setVotos(response);
		return lv;
	}
	

}

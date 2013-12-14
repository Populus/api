package cl.populus.api.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cl.populus.api.entities.Boletin;

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
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}

}

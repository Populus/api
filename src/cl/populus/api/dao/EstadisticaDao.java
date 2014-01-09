package cl.populus.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.populus.api.entities.Estadistica;
import cl.populus.api.entities.ListaEstadisticas;
import cl.populus.api.entities.ListaTramitaciones;
import cl.populus.api.entities.Representante;

public class EstadisticaDao extends BaseDao {
	
	public ListaEstadisticas getMateriasByYear(String fecha){
		List<Estadistica> response = new ArrayList<Estadistica>();
		try {
			Statement stmt = getConnection().createStatement();
			String query = "SELECT materia, count(*) as cant FROM `materia` as m, proyecto_de_ley as p WHERE p.nro_boletin = m.nro_boletin and p.fecha_ingreso > '"+fecha+"' group by materia";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				Estadistica e = new Estadistica();
				e.setMateria(rs.getString("materia"));
				e.setNumero(rs.getLong("cant"));
				response.add(e);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ListaEstadisticas le = new ListaEstadisticas();
		le.setEstadisticas(response);
		return le;
		
	}

}

package cl.populus.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.populus.api.entities.Representante;

public class RepresentanteDao extends BaseDao {
	
	public Representante getRepresentanteById(long id){
		Representante response = null;
		try {
			Statement stmt = getConnection().createStatement();
			String query = "SELECT p.*, IF(d.id IS NOT NULL, \"diputado\",\"senador\") AS cargo, "+
							"IF(d.id IS NOT NULL, d.inicio, s.inicio) AS inicio, "+
							"IF(d.id IS NOT NULL, d.fin,s.fin) AS fin, "+
							"IF(d.id IS NOT NULL, d.distrito,s.circunscripcion) AS area "+ 
							"FROM populus2.politico p "+
							"LEFT JOIN diputado d ON p.id = d.id "+
							"LEFT JOIN senador s ON p.id = s.id "+
							"WHERE p.id = "+id+" "+
							"GROUP BY inicio "+
							"ORDER BY inicio DESC";
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()){
				response = new Representante();
				response.setId(id);
				response.setNombres(rs.getString("primernombre")+" "+rs.getString("segundonombre"));
				response.setApellido(rs.getString("apellidopaterno")+" "+rs.getString("apellidomaterno"));
				response.setPartido(rs.getString("partido"));
				response.setCargo(rs.getString("cargo"));
				response.setArea(rs.getString("area"));
				response.setTwitter(rs.getString("twitter"));
				//cgajardo: estas líneas siempre deben ir al final de este if
				List<String> periodos = new ArrayList<>();
				periodos.add(rs.getString("inicio")+"-"+rs.getString("fin"));
				while(rs.next())
					periodos.add(rs.getString("inicio")+"-"+rs.getString("fin"));
				response.setPeriodos(periodos);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}

}

package cl.populus.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.populus.api.entities.ListaEstadisticas;
import cl.populus.api.entities.Tramitacion;
import cl.populus.api.entities.Votacion;

@Path("/estadisticas")
@Produces(MediaType.APPLICATION_JSON)
public class Estadisticas extends BaseResource{
	
	
	@GET
	@Path("/materia/{fecha}")
	public Response getByYear(@PathParam("fecha") String fecha) {
		ListaEstadisticas response = getEstadisticaDao().getMateriasByYear(fecha);
		return Response.status(200).entity(response).build();
	}

}

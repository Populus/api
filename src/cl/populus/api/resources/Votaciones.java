package cl.populus.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.populus.api.entities.Tramitacion;
import cl.populus.api.entities.Votacion;

@Path("/votaciones")
@Produces(MediaType.APPLICATION_JSON)
public class Votaciones extends BaseResource{
	
	
	@GET
	@Path("{idVotacion}")
	public Response getByBoletin(@PathParam("idVotacion") String idVotacion) {
		Votacion response = getVotacionDao().getById(idVotacion);
		return Response.status(200).entity(response).build();
	}

}

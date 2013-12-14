package cl.populus.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.populus.api.entities.Representante;

@Path("/representantes")
@Produces(MediaType.APPLICATION_JSON)
public class Representantes extends BaseResource{
	
	@GET
	@Path("/{id}")
	public Response getById(@PathParam("id") long id){
		
		Representante response = getRepresentanteDao().getRepresentanteById(id);
		
		return Response.status(200).entity(response).build();
	}

}

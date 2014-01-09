package cl.populus.api.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.populus.api.entities.Boletin;
import cl.populus.api.entities.ListaTramitaciones;

@Path("/boletines")
@Produces(MediaType.APPLICATION_JSON)
public class Boletines extends BaseResource {
	
	@GET
	@Path("/{numero}")
	public Response getByNumero(@PathParam("numero") String numero){
		Boletin response = getBoletinDao().getByNumero(numero);
		
		return Response.status(200).entity(response).build();
	}
	
	@GET
	@Path("/{numero}/tramitacion")
	public Response getTramitacionByNumero(@PathParam("numero") String numero){
		ListaTramitaciones response = getBoletinDao().getTramitacionByNumero(numero);
		
		return Response.status(200).entity(response).build();
	}

}

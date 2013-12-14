package cl.populus.api.resources;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.populus.api.entities.Tramitacion;

@Path("/tramitaciones")
@Produces(MediaType.APPLICATION_JSON)
public class Tramitaciones {
	
	@GET
	@Path("/{id}")
	public Response getById(@PathParam("id") long id) {
		 
		Tramitacion t = new Tramitacion();
		t.setId(123);
		t.setEtapa("Etapa 1");
		return Response.status(200).entity(t).build();
	}
	
	
	@GET
	@Path("/sesion/{id}")
	public Response getByIdSesion(@PathParam("id") long sesionId){
		return Response.status(501).build();
	}
	
	@GET
	@Path("/fecha")
	public Response getByFecha(@QueryParam("from") Date desde, @QueryParam("to") Date to){
		// cgajardo: id(to==null) to = today;
		return Response.status(501).build();
	}
	
	
	@GET
	@Path("/boletin/{numero}")
	public Response getByBoletin(@PathParam("numero") String nroBoletin){
		return Response.status(501).build();
	}
	

}

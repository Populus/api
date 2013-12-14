package cl.populus.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/cv")
@Produces(MediaType.APPLICATION_JSON)
public class Curriculum {

	@GET
	@Path("/create")
	public Response createTemplate(@QueryParam("key") String key) {
		String template = "{"+
				"\"main\":["+
						"{\"tag\":\"div\", \"class\":\"wrapper\", \"children\":["+
						    "{\"tag\":\"div\", \"class\":\"personalInfo\", \"children\":["+
						       "{\"tag\":\"input\",\"type\":\"text\",\"value\":\"${firstname} ${secondname}\"},"+
							   "{\"tag\":\"input\",\"type\":\"text\",\"value\":\"${lastname} ${secondlastname}\"}"+
						       "]"+
						    "}"+			                                                       
						"]},"+
					    "{\"tag\":\"div\", \"class\":\"jobExperience\", \"children\":["+
        			       "{\"tag\":\"ul\",\"class\":\"list\",\"children\":"+
        			    	   "function(){return json2html.transform(data.experiencias,"+
								"[{\"tag\":\"div\", \"class\":\"experienceItem\", \"children\":["+
                                   "{\"tag\":\"li\", \"html\":\"${company} (${jobtitle})\"}]}])}}"+
        			     "]"+
        			    "}"+ 
					"]"+
			"}";
		return Response.status(Status.OK).entity(template).build();	
	}
	
	@GET
	@Path("/edit")
	public Response editTemplate(@QueryParam("key") String key) {
		return null;	
	}
	
	@GET
	@Path("/view")
	public Response viewTemplate(@QueryParam("key") String key) {
		return null;	
	}
	
	@GET
	@Path("/search")
	public Response searchTemplate(@QueryParam("key") String key) {
		return null;	
	}
}

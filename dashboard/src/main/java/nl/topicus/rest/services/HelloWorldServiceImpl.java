package nl.topicus.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
@Path("/helloworld")
public class HelloWorldServiceImpl {

	@GET
	@Path("/")
	public String getMessage(){
		 
		return "HelloWorld";
	}
	
}

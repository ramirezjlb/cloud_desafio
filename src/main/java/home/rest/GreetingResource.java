package home.rest;

// import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import home.rest.client.WeatherService;
import home.service.ClassA;

@Path("/")
public class GreetingResource {
    
    @Inject ClassA classA;
    @Inject @RestClient WeatherService service;
    
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws Exception {
        return classA.hello();
    }

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWeather() {
        Response resp = service.getWeather("4df4d14a", "Brasilia");
        Object obj = resp.getEntity();
        return Response.status(200).entity(obj).build();
    }
}

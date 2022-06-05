package home.rest.client;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(configKey = "weather-api")
public interface WeatherService {

    @GET
    @Path("/weather")
    Response getWeather(@QueryParam("key") String key, @QueryParam("city_name") String cityName);
}

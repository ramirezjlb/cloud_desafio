package home;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import home.rest.client.WeatherService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@QuarkusTest
public class GreetingResourceTest {

    @InjectMock @RestClient WeatherService service;

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from ClassB!"));
    }

    @Test
    void testWeatherEndpoint() {
        Response resp = Response.status(Status.OK).entity("TESTE").build();
        when(service.getWeather(anyString(), anyString())).thenReturn(resp);
        given().when().get("/weather").then().statusCode(200).body(is("TESTE"));
    }
}
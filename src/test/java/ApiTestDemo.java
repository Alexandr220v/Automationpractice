import com.jayway.restassured.RestAssured;
import model.Api;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTestDemo {

    @Test
    public  void testMEthod() {
        Api expectedApi = new Api.ApiBuilder().
                setFilms("https://swapi.co/api/films/").
                setPeople("https://swapi.co/api/people/").
                setPlanets("https://swapi.co/api/planets/").
                setSpecies("https://swapi.co/api/species/").
                setVehicles("https://swapi.co/api/vehicles/").
                setStarships("https://swapi.co/api/starships/").
                createApi();
        Api actualApi = doGet("https://swapi.co/api/");
        Assert.assertEquals(expectedApi,actualApi);

    }

    private Api doGet(String endpoint) {
        return RestAssured.get(endpoint).as(Api.class);
    }
}

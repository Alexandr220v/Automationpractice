import com.jayway.restassured.RestAssured;
import model.MainApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestApiExample {


    @Test
    public void verifyMainApi() {

        String ID = "2172797";
        MainApi excpectedMainApi = new MainApi.MainApiBuilder().
                films("https://swapi.co/api/films/").
                people("https://swapi.co/api/people/").
                planets("https://swapi.co/api/planets/").
                species("https://swapi.co/api/species/").
                starships("https://swapi.co/api/starships/").
                vehicles("https://swapi.co/api/vehicles/").
                create();
        MainApi[] actualMainApi = RestAssured.given().param(ID).get("https://swapi.co/api/").
                as(MainApi[].class);
        Assert.assertEquals(excpectedMainApi.getFilms(),actualMainApi);
    }

}

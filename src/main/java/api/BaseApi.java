package api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.apache.http.HttpConnection;
import org.apache.http.client.HttpClient;

public class BaseApi {

    public static void main(String[] args) {
         RestAssured.get("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5").
                thenReturn().
                body().
                prettyPrint();


    }
}

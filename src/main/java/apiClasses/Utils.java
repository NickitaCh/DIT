package apiClasses;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Utils {
    private static final String BASE_URL = "http://localhost";

    public static RequestSpecification getBaseSpec() {
        return given().baseUri(BASE_URL).header("Content-type", "application/json");
    }
}
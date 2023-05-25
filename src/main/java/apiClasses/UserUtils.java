package apiClasses;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class UserUtils extends Utils{
    private static final String REGISTER = "/register";
    private static final String DELETE = "/customers/";

    @Step("Post user")
    public static ValidatableResponse createUser(User user) {
        return given()
                .spec(getBaseSpec())
                .body(user)
                .post(REGISTER)
                .then();
    }

    @Step("Delete user")
    public static ValidatableResponse deleteUser(String id) {
        return given()
                .spec(getBaseSpec())
                .delete(DELETE + id)
                .then();
    }
}
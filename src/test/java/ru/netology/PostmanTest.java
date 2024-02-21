package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class PostmanTest {
    @Test
    void returnData() {
        String text = "Hello word";
        given()
                .baseUri("https://postman-echo.com")
                .body(text) // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text))
        ;
    }
}

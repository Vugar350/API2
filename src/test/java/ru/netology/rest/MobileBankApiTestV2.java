package ru.netology.rest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class MobileBankApiTestV2  {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
                .body("12.05.2022") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("12.05.2022"))

        ;
    }
}


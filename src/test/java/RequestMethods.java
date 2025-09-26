import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static javax.management.Query.and;

public class RequestMethods {
    @Test
    void givenPersons_whenGetPersons_thenStatus200() {
        createTestPerson("foo1");
        createTestPerson("foo2");
        when().get(/"persons")
        .then().log().body()

                .statusCode(HttpStatus.OK.value))
        .and().body("get(0).name", equalTo "foo1"))
        .and().body("get(1).name", equalTo "foo2");
    }
}
RequestSpecification requestSpec = given()
        .baseUri("https://postman-echo.com")
        .header("foo1", "bar1");
RequestSpecification yetAnotherRequestSpec = given()
        .header("foo2","bar2");
given()
        .spec(requestSpec)
        .spec(yetAnotherRequestSpec)
.when()
.get()
.then()
.statusCode(200);


@Test
public <Person> void whenCreatePerson_thenStatus200() {
    Person person = new Person ("foo1");
    given().log().body()
            .contentType("application/json").body(person)
            .when().post("/persons")
            .then().log().body()
            .statusCode(HttpStatus.SC_CREATED.value());
}










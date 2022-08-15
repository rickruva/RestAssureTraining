import static io.restassured.RestAssured.given;

public class CucumberAction {
    public void callGet (){
        String respuesta = given().log().all()
               .when()
               .get("https://reqres.in/api/users")
               .then()
               .log().all()
               .statusCode(200)
               .extract().body().toString();

        System.out.println(respuesta);

    }

}

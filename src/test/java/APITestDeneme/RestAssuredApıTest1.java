package APITestDeneme;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredApıTest1 {

    @Test
    public void singleUserTest(){
        when()
                .get("https://reqres.in/api/users/2")
                //Test assert kisimimiz.
                .then()
                .statusCode(200)
                .body("data.avatar",equalTo("https://reqres.in/img/faces/2-image.jpg"))
                .time(lessThan(1000l));



    }

}
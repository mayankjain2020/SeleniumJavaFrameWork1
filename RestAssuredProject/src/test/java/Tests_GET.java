import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;

public class Tests_GET {
	
           @Test
           void test_1() {
		
		    given()
		       .get("https://reqres.in/api/users?page=2")
		   .then()
		   .statusCode(200)
		   .body("data.id[1]",equalTo(8))
		   .body("data.first_name", hasItems("Michael","Lindsay","Tobias"))
		   .log().all();

}

}

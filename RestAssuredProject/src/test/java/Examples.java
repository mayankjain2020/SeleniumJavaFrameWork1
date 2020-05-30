import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Examples {


	//@Test
	public void test_get() {

		baseURI = "http://localhost:3000/";

		given().
		param("name", "Automation").
		get("/subjects").
		then().
		statusCode(200).
		log().all();

	}
	//@Test
	public void test_post() {

		JSONObject request = new JSONObject();

		request.put("firstName", "Valary");
		request.put("lastName", "Don");
		request.put("subjectId", 1);

		baseURI = "http://localhost:3000/";

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type", "application/json").
		body(request.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).
		log().all();


	}

	//@Test
	public void test_patch() {

		JSONObject request = new JSONObject();

		request.put("lastName", "Bose");

		baseURI = "http://localhost:3000/";

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type", "application/json").
		body(request.toJSONString()).
		when().
		patch("/users/38").
		then().
		statusCode(200).
		log().all();


	}
	//@Test
	public void test_put() {

		JSONObject request = new JSONObject();

		request.put("firstName", "Jean");
		request.put("lastName", "David");
		request.put("subjectId", 1);

		baseURI = "http://localhost:3000/";

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type", "application/json").
		body(request.toJSONString()).
		when().
		put("/users/38").
		then().
		statusCode(200).
		log().all();


	}

	@Test
	public void test_delete() {
		
		baseURI = "http://localhost:3000/";
		given().
		delete("/users/38").
		then().
		statusCode(200).
		log().all();

	}


}

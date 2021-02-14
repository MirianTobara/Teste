package core;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.ValidatableResponse;

public class Base implements Constants  {
	
	@BeforeClass
	public static void setUp()  {
		RestAssured.baseURI = APP_BASE_URL;
		RestAssured.port = APP_PORT;
		RestAssured.basePath = APP_BASE_PATH;
		
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setContentType(APP_CONTENT_TYPE);
		RestAssured.requestSpecification = reqBuilder.build();
		
		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		resBuilder.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
		RestAssured.responseSpecification = resBuilder.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
 
	public void realizarPost(Object request, String endpoint) {
		given()
			.body(request)
		.when().log().all()
			.post(endpoint)
		.then()
			.statusCode(200).log().all();
	}
	
	public ValidatableResponse realizarGet(String endpoint) {
		return given()
		.when().log().all()
			.get(endpoint)
		.then()
			.statusCode(200).log().all();
	}
	
}

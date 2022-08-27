package RestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


//Deleting Not Existed PetID
public class RestAssuredDelete {

	@Test(priority = 1)
	  public void Delete_testcase1() {
		
		when().
	delete("https://petstore.swagger.io/v2/pet/5").
	    then().
	    statusCode(404);
}
}
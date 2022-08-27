package RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class Rest_Assured_Get {

	
	@Test(priority = 1)
	  public void Get_testcase1() {
	  given().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").then()
	  .assertThat().statusCode(200).log().all();  
	  }
}

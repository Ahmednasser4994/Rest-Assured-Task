package RestAssured;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;


public class Rest_Assured_Post {

	@Test(priority = 1)
	
	
	  public void Post_testcase1() throws ParseException  {
		
	
	    String body = " {\r\n"
	    		+ "    \"id\": 7688,\r\n"
	    		+ "    \"category\": {\r\n"
	    		+ "      \"id\":767676,\r\n"
	    		+ "      \"name\": \"VOIS\"\r\n"
	    		+ "    },\r\n"
	    		+ "    \"photoUrls\": [\r\n"
	    		+ "      \"string\"\r\n"
	    		+ "    ],\r\n"
	    		+ "    \"tags\": [\r\n"
	    		+ "      {\r\n"
	    		+ "        \"id\": 767676,\r\n"
	    		+ "        \"name\": \"VOIS\"\r\n"
	    		+ "      }\r\n"
	    		+ "    ],\r\n"
	    		+ "    \"status\": \"sold\"\r\n"
	    		+ "  }";
	    JSONParser parser = new JSONParser();
	    
	    JSONObject request = (JSONObject) parser.parse(body);
	    
	   // request.put("name","Sh7ebr");
	   // request.put("photoUrls", "Google.com");
	  
	    System.out.println(request);
	    
	    given().header("Content-Type","application/json")
	    .accept(ContentType.JSON)
	    .contentType(ContentType.JSON).
	    body(request).
	    when().
	    post("https://petstore.swagger.io/v2/pet").
	    then().
	    statusCode(200);
	    
	}
	}
	


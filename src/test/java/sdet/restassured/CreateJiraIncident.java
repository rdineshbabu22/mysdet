package sdet.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class CreateJiraIncident {

	@Test
	public void create() {
		
		//set end point URL
		RestAssured.baseURI = "https://testjirafeb2023.atlassian.net/rest/api/2";
		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		
		
		// Initiate request
		
       Response response =RestAssured.given()
    	.contentType("application/json")
    	.when()
    	.body("{\r\n" + 
    			"    \"fields\": {\r\n" + 
    			"    \"project\":\r\n" + 
    			"                {\r\n" + 
    			"                    \"key\": \"TES\"\r\n" + 
    			"                },\r\n" + 
    			"    \"summary\": \"create issue in Sign in project\",\r\n" + 
    			"    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
    			"    \"issuetype\": {\r\n" + 
    			"                    \"name\": \"Bug\"\r\n" + 
    			"                }\r\n" + 
    			"    }\r\n" + 
    			"}")
    	.post("/issue/");
       
       response.prettyPrint();
      response.then().assertThat().statusCode(201);
     System.out.println(response.getBody().jsonPath().getString("id"));
		
		
	}
}

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Negavite_log {
	 @Test
	    void login() {
	    
	        
	          System.out.println("**********GET**********");
	           RestAssured.given()
	           .when().log().all()
	           .get("https://reqres.in/api/users/23")
	           .then().log().status();
	 }
}

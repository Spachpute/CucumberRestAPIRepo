package com.basic.getRequestSD;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGetRequestStepDefination {
	Response resp;
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test(){
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Starting of the GET request");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request(){
	    // Write code here that turns the phrase above into concrete actions
		//Response resp
//		resp = RestAssured.given().relaxedHTTPSValidation().
//				when().get("https://ergast.com/api/f1/2017/circuits.json"); 
//		
//		//print response in String
//		String respString = resp.asString();
		System.out.println("respString");
		
	    }

	@Then("^user check (\\d+) the status code$")
	public void user_check_the_status_code(int expStatusCode){
	    // Write code here that turns the phrase above into concrete actions
		int statuscode = resp.getStatusCode();
		Assert.assertTrue(expStatusCode==statuscode);
	    
	}

	@Then("^user check the count or size$")
	public void user_check_the_count_or_size(){
	    // Write code here that turns the phrase above into concrete actions
//		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
//		Assert.assertEquals(30,limitValue);
		//resp.then().assertThat().body("MRData.limit", equalToIgnoringCase("30"));
		//verify size
	  System.out.println("abc");
	}

}

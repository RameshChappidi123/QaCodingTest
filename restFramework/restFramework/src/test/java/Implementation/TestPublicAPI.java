package Implementation;

import org.testng.Assert;
import org.testng.annotations.Test;


import helper.BaseClass;
import helper.Utility;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TestPublicAPI extends BaseClass{
	
	int response;
	
	//below code will make the get call
	public void getCall()
	{
	    response=RestAssured.given().get("http://jsonplaceholder.typicode.com/posts").getStatusCode();
	}
	
	//below code will get the status for incorrect end point
	public void getCallForIncorrectEndPoint()
	{
	    response=RestAssured.given().get("http://jsonplaceholder.typicode.com/posts/incorrect").getStatusCode();
	}
	
	//below code will get the status for out of range query parameter[i.e querying the values which is not in record list]
	public void getCallForoutofrangeEndPoint()
	{
	    response=RestAssured.given().get("http://jsonplaceholder.typicode.com/posts/101").getStatusCode();
	}
	
	//below code will verify status code.
	public void verifyStatusCode(int expected)
	{
		Utility.verifyResponseCode(response,expected);
	}
	
	//below code will verify content
	public void verifyContent(String key, String value)
	{
		Utility.verifyJsonData(RestAssured.given().get("http://jsonplaceholder.typicode.com/posts/1").asString(),key,value);
	}
	
	//below code will verify for out of range paramaeter response body is coming empty
	public void verifyemptyBdy()
	{
		Assert.assertTrue(Utility.emptyresponsebody(RestAssured.given().get("http://jsonplaceholder.typicode.com/posts/0").asString()), "Response body is not empty");
	}
	
}

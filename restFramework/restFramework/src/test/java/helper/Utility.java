package helper;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;

public class Utility 
{

	//This code will verify status code
	public static void verifyResponseCode(int actual,int expected)
	{
		Assert.assertEquals(actual, expected);	
	}
	
	//this code will parse the json
	public static JsonPath JSONParser(String response)
	{
		JsonPath json=new JsonPath(response);
		return json;
	}
	
	
	//this code will verify getting correct value from response
	public static void verifyJsonData(String response,String key,String value)
	{
		JsonPath json=new JsonPath(response);
		String data=json.getString(key);
		Assert.assertEquals(data, value);
	}
	
	
	//This code will verify content is present in response or not
	public static void verifyJsonDataContains(String response,String key,String value)
	{
		JsonPath json=new JsonPath(response);
		String data=json.getString(key);
		Assert.assertTrue(data.contains(value));
	}
	
	//Verify empty response is present or not
	public static boolean emptyresponsebody(String response)
	{
		if(response.isEmpty())
		{
			return false;
		}else {return true;}
	}
	
	
}

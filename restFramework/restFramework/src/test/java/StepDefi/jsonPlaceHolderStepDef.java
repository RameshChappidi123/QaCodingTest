package StepDefi;

import Implementation.TestPublicAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class jsonPlaceHolderStepDef {

	TestPublicAPI tpi = new TestPublicAPI();
	
	@Then("^I verify the response code is (\\d+) in step$")
	public void i_verify_the_response_code_is_in_step(int arg1) throws Throwable {
		tpi.verifyStatusCode(arg1);
	}
	
	@Given("^verify after performing get call$")
	public void i_perform_get_call() throws Throwable {
		tpi.getCall();
	}

	@Given("^verify error code after performing get call for incorrect end point$")
	public void i_perform_get_call_incorrect_end_point() throws Throwable {
		tpi.getCallForIncorrectEndPoint();
	}
	
	@Given("^verify error code after performing get call for out of range end point$")
	public void i_perform_get_call_out_of_range_end_point() throws Throwable {
		tpi.getCallForoutofrangeEndPoint();
	}
	
	
	@Then("verify response body is empty$")
	public void empty_reposne_body()
	{
		tpi.verifyemptyBdy();
	}
	
	@Then("^I verify value displayed as \"([^\"]*)\" for key \"([^\"]*)\" is correct$")
	public void i_verify_value_displayed_as_for_key_is_correct(String arg1, String arg2) throws Throwable {
		tpi.verifyContent(arg1, arg2);
	}

}

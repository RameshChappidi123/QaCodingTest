package testRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
		"json:test-output/jsonReports/CucumberTestReport.json", "Utils.CustomEventListenerPlugin" }, features = "src\\test\\java\\testcases\\jsonPlaceHolderApi.feature", glue = {
				"StepDef" }, tags = { "@UI" })

public class jsonRunner {

}

package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\test\\bdd\\searcchGoogle.feature", tags = {"@test" }, plugin = { "pretty",
	"html:target/cucumber-reports" },glue = {"stepDef"}, dryRun = false, monochrome = true)
	
	public class googleSearchRunnerClass {
		
}
 
package stepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Implementation.searchInGoogle;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.commonCode;

public class searchGoogleStepDef {

	commonCode comCode = new commonCode();
	WebDriver driver;
	
	
	//Below code will initialize browser and driver
	@Given("^open an browser$")
	public void open_an_browser() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximizing Browser
		driver.manage().window().maximize();
		String getUrl = this.comCode.readCOnfig("url");
		driver.get(getUrl);
	}

	//below code will call the method to search the required text on google
	@When("^user search in google$")
	public void user_search_in_google() throws IOException {
		searchInGoogle sig = new searchInGoogle(driver);
		sig.searchValueGoogle();
	}

	//Below code will call the methods which will verify ouput
	@Then("^verify result page shows correct result$")
	public void verify_result_page_shows_correct_result() throws IOException {
		searchInGoogle sig = new searchInGoogle(driver);
		sig.verifySearchResult();
		sig.closeBrowser();
		
	}
}

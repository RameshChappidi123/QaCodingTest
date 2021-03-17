package Implementation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;
import utility.commonCode;

public class searchInGoogle
{
   WebDriver driver;
   commonCode comCode = new commonCode();
   
   //Page factory
   @FindBy(css= "img[class='lnXdpd']")
   private WebElement googleLogo;
   
   @FindBy(css = "input[class='gLFyf gsfi']")
   private WebElement searchTextBox;
   
   @FindBy(css = "div.FPdoLc.tfB0Bf > center > input.gNO89b")
   private WebElement clickSearchBtn;
   
   @FindBy(css = "#wp-tabs-container > div:nth-child(1) > div.SzZmKb > div > div > div > div.SPZz6b > h2 > span")
   private WebElement verifySearchResult;
   
   @FindBy(id="result-stats")
   private WebElement resultPage;
   
   //Constructor to initiate the webdriver for this page factory
   public searchInGoogle(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   //Below method will search required text in search text bar and lick on search button.
   public void searchValueGoogle() throws IOException
   {
	   this.comCode.wait(driver, this.googleLogo);
	   this.searchTextBox.click();
	   this.searchTextBox.sendKeys(this.comCode.readCOnfig("searchItem"));
	   this.googleLogo.click();
	   this.clickSearchBtn.click();
   } 	
   
 //Below method will verify output page is showing correct result or not
   public void verifySearchResult() throws IOException
   {
	   this.comCode.wait(driver, resultPage);
	   String searchResult = this.verifySearchResult.getText();
	   Assert.assertEquals(searchResult, this.comCode.readCOnfig("searchResult"), "Search result is not as expected.");
   }
   
   //Below code will close the browser
   public void closeBrowser()
   {
	   driver.close();
	   driver.quit();
   }
   
   
}

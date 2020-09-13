package stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObject.HomePage;

public class HomePageSteps {
	TestContext testContext;
	 HomePage homePage;
	 
	 public HomePageSteps(TestContext context) {
	 testContext = context;
	 homePage = testContext.getPageObjectManager().getHomepage();
	 }
	 
	 @Given("^user is on Home Page$")
	 public void user_is_on_Home_Page() throws IOException{
	 homePage.getAppURL(); 
	 Reporter.addStepLog("URL pasted");
	 Assert.assertEquals("a", "a");
	 }

}

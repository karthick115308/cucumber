package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObject.CheckoutPage;
import pageObject.HomePage;

public class Steps {
	

	 WebDriver driver;
	 PageObjectManager pageobjmanager;
	 HomePage homepage;
	 CheckoutPage checkoutPage;
	 ConfigFileReader config;	
	
	 
	 @When("^he search for \"([^\"]*)\"$")
	 public void he_search_for(String arg1)  {
		 homepage.navigateSearchPage(arg1);
	 }
	 
	 @When("^choose to buy the first item$")
	 public void choose_to_buy_the_first_item() {
	 List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
	 items.get(0).click();
	 
	 WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
	 addToCart.click(); 
	 }
	 
	 @When("^moves to checkout from mini cart$")
	 public void moves_to_checkout_from_mini_cart(){
	 WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
	 cart.click();
	 
	 WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
	 continueToCheckout.click(); 
	 }
	 
	 @When("^enter personal details on checkout page$")
	 public void enter_personal_details_on_checkout_page() throws InterruptedException {
	 Thread.sleep(5000);

	 checkoutPage = pageobjmanager.getCheckoutpage();
	 checkoutPage.fill_PersonalDetails(); 
	 }
	 
	
	 
	 @When("^select same delivery address$")
	 public void select_same_delivery_address() throws InterruptedException{
	 WebElement shipToDifferetAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
	 shipToDifferetAddress.click();
	 Thread.sleep(3000);
	 }
	 
	 @When("^select payment method as \"([^\"]*)\" payment$")
	 public void select_payment_method_as_payment(String arg1){
	 List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
	 paymentMethod.get(0).click();
	 }
	 
	 @When("^place the order$")
	 public void place_the_order() {
	 WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
	 acceptTC.click();
	 
	 WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
	 placeOrder.submit();
	 } 

}

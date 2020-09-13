package managers;

import org.openqa.selenium.WebDriver;

import pageObject.CheckoutPage;
import pageObject.HomePage;

public class PageObjectManager {
	private WebDriver driver;
	private CheckoutPage checkoutpage;
	private HomePage homepage;
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	public CheckoutPage getCheckoutpage()
	{
		return (checkoutpage == null ? checkoutpage = new CheckoutPage(driver):checkoutpage);
	}
	public HomePage getHomepage()
	{
		return (homepage == null ? homepage = new HomePage(driver):homepage);
	}

}

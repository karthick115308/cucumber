package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	public CheckoutPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(how = How.CSS, using = "#billing_first_name") 
	 private WebElement txtbx_FirstName;
	 
	 @FindBy(how = How.CSS, using = "#billing_last_name") 
	 private WebElement txtbx_LastName;
	 
	 @FindBy(how = How.CSS, using = "#billing_email") 
	 private WebElement txtbx_Email;
	 
	 @FindBy(how = How.CSS, using = "#billing_phone") 
	 private WebElement txtbx_Phone;

	 public void enter_Name(String name) {
		 txtbx_FirstName.sendKeys(name);
		 }
		 
		 public void enter_LastName(String lastName) {
		 txtbx_LastName.sendKeys(lastName);
		 }
		 
		 public void enter_Email(String email) {
		 txtbx_Email.sendKeys(email);
		 }
		 
		 public void enter_Phone(String phone) {
		 txtbx_Phone.sendKeys(phone);
		 }
		 public void fill_PersonalDetails() {
			 enter_Name("Aotomation");
			 enter_LastName("Test");
			 enter_Phone("0000000000");
			 enter_Email("Automation@gmail.com");
			 
			 }
}

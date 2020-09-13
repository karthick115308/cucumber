package pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	public void navigateSearchPage(String search)
	{
		driver.navigate().to("https://shop.demoqa.com/?s=" + search + "&post_type=product");
	}

	public void getAppURL() throws IOException
	{
		System.out.println(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
}

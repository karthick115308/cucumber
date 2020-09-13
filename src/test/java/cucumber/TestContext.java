package cucumber;

import java.io.IOException;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	WebDriverManager webdrivermanager;
	PageObjectManager pageobjectmanager;
	public TestContext() throws IOException
	{
		webdrivermanager = new WebDriverManager();
		pageobjectmanager = new PageObjectManager(webdrivermanager.getDriver());
	}
	 public WebDriverManager getWebDriverManager() {
		 return webdrivermanager;
		 }
		 
		 public PageObjectManager getPageObjectManager() {
		 return pageobjectmanager;
		 }

}

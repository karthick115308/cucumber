package managers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {
	private WebDriver driver;
	private String driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public WebDriverManager() throws IOException
	{
		driverType = FileReaderManager.getInstance().getConfigReader().getbrowser();
		
	}
	public WebDriver getDriver() throws IOException
	{
		return (driver == null)? createDriver() : driver;
	}
	public WebDriver createDriver() throws IOException
	{
		switch(driverType){
		case "FIREFOX": driver = new FirefoxDriver();
		break;
		case "CHROME": 
			System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getdriverPath());
			driver = new ChromeDriver();
			break;
		case "INTERNETEXPLORER": driver = new InternetExplorerDriver();
		break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void closeDriver() {
		 driver.close();
		 driver.quit();
		 }
}

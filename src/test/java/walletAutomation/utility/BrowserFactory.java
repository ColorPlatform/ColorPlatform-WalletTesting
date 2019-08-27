package walletAutomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL )
	{
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/ehtsham/Downloads/BrowserDrivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/ehtsham/Downloads/BrowserDrivers/chromedriver");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.print("We do not support this browser!\n");
		}
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
}

package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import walletAutomation.utility.BrowserFactory;
import walletAutomation.utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupSuite()
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/WalletReport"+/*Helper.getCurrentDateTime()+*/".html");
		report = new ExtentReports();
		report.attachReporter(extent);
		
	}

	@BeforeTest
	public void setup()
	{
		driver = BrowserFactory.startApplication(driver, "chrome", "https://localhost:9080/");
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.captureScreenshot(driver);
			logger.fail("Test failed");
		}
		report.flush();
	}
	
	@AfterTest
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	public void WaitTwoSeconds()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

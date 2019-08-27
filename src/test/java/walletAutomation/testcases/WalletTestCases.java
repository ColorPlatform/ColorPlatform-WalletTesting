package walletAutomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import walletAutomation.pages.BaseClass;
import walletAutomation.pages.CreatePage;
import walletAutomation.pages.ExistingPage;
import walletAutomation.pages.ExplorePage;
import walletAutomation.pages.HomePage;
import walletAutomation.pages.RecoverPage;
import walletAutomation.pages.WalletPage;
import walletAutomation.pages.WelcomePage;

public class WalletTestCases extends BaseClass {
	
	@Test(priority=1)
	public void signupTest()
	{
		logger = report.createTest("Creating new address validation");
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.logInButton.click();
		
		WelcomePage welcomePage = PageFactory.initElements(driver, WelcomePage.class);
		welcomePage.newAddressButton.click();
		
		CreatePage createPage = PageFactory.initElements(driver, CreatePage.class);
		createPage.SignUP("itti2200","ane1aee4dze7ae","ane1aee4dze7ae");
		
		WalletPage walletPage = PageFactory.initElements(driver, WalletPage.class);
		walletPage.logOutButton.click();
		
		logger.pass("SignUp successful");
		
	}
	
	@Test(priority=2)
	public void withAnyAddressTest()
	{
		logger = report.createTest("Login with any address validation");
	
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.logInButton.click();
		
		WelcomePage welcomePage = PageFactory.initElements(driver, WelcomePage.class);
		welcomePage.existingAddressButton.click();
		
		ExistingPage existingPage = PageFactory.initElements(driver, ExistingPage.class);
		existingPage.AnyAddress();
		
		ExplorePage explorePage = PageFactory.initElements(driver, ExplorePage.class);
		explorePage.Explore("colors19gqgcy78le560ukjp4hx7qc5u8s9pn2snyh8dk");	
		
		WalletPage walletPage = PageFactory.initElements(driver, WalletPage.class);
		walletPage.logOutButton.click();
		
		logger.pass("Login successful");
		
	}
	
	@Test(priority=3)
	public void WithBackupCodeTest()
	{
		logger = report.createTest("Login with backup code");
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.logInButton.click();
		
		WelcomePage welcomePage = PageFactory.initElements(driver, WelcomePage.class);
		welcomePage.existingAddressButton.click();
		
		ExistingPage existingPage = PageFactory.initElements(driver, ExistingPage.class);
		existingPage.Backup();
		
		RecoverPage recoverPage = PageFactory.initElements(driver, RecoverPage.class);
		recoverPage.Recover("tester","tester12345","tester12345","mansion powder soul odor favorite truck great frog split slice correct evil fuel kitten evil palace return tunnel right view twelve snake divert neck");
		
		WalletPage walletPage = PageFactory.initElements(driver, WalletPage.class);
		walletPage.logOutButton.click();
		
		logger.pass("Login successful");
	}
	
}

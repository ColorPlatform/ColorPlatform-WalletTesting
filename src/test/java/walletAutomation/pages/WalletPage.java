package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalletPage {

WebDriver driver;
	
	public WalletPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath = "//i[contains(text(),'exit_to_app')]")
	public WebElement logOutButton;
	
	public void WaitTwoSeconds()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

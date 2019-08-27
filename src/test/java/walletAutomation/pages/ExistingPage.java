package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExistingPage {

	WebDriver driver;
	
	public ExistingPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//a[@id='explore-with-address']//div[@class='tm-li-session-title']")
	public WebElement anyAddressButton;
	@FindBy(xpath = "//span[contains(text(),'Recover with backup code')]")
	public WebElement backupCodeButton;
	
	public void AnyAddress()
	{
		anyAddressButton.click();
		WaitTwoSeconds();
	}
	
	public void Backup()
	{
		backupCodeButton.click();
		WaitTwoSeconds();
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

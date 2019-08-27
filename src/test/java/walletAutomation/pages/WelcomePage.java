package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {

	public WebDriver driver;
    
	public WelcomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath = "//a[@id='creat-new-address']//div[@class='tm-li-session-title']")
	public WebElement newAddressButton;
	@FindBy(xpath = "//a[@id='use-an-existing-address']//div[@class='tm-li-session-title']")
	public WebElement existingAddressButton;
	
	public void WaitTwoSeconds()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExplorePage {
	
	WebDriver driver;
	
	public ExplorePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//input[@class='tm-field']")
	public WebElement addressField;
	@FindBy(xpath = "//span[@class='tm-btn__container']")
	public WebElement exploreButton;
	
	public void Explore(String address)
	{
		addressField.sendKeys(address);
		exploreButton.click();
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

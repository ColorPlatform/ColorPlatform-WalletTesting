package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePage {
	
	WebDriver driver;
	
	public CreatePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//input[@id='sign-up-name']") 
	public WebElement userName;
	@FindBy(xpath = "//input[@id='sign-up-password']") 
	public WebElement password;
	@FindBy(xpath = "//input[@id='sign-up-password-confirm']")
	public WebElement confirmPassword;
	@FindBy(xpath = "//input[@id='sign-up-warning']")
	public WebElement firstCheckField;
	@FindBy(xpath = "//input[@id='error-collection']")
	public WebElement secondCheckField;
	@FindBy(xpath = "//span[@class='tm-btn__container']")
	public WebElement createButton;

	public void SignUP(String name, String pass, String confirmpass)
	{
		userName.sendKeys(name);
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmpass);
		firstCheckField.click();
		secondCheckField.click();
		createButton.click();
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

package walletAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecoverPage {
	
	WebDriver driver;
	
	public RecoverPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//input[@id='import-name']")
	public WebElement backupName;
	@FindBy(xpath = "//input[@id='import-password']")
	public WebElement backupPassword;
	@FindBy(xpath = "//input[@id='import-password-confirmation']")
	public WebElement backupConfirmPassword;
	@FindBy(xpath = "//textarea[@id='import-seed']")
	public WebElement seedPhrase;
	@FindBy(xpath = "//input[@id='error-collection']")
	public WebElement checkField;
	@FindBy(xpath = "//span[contains(text(),'Recover')]")
	public WebElement recoverButton;
	
	public void Recover(String bname,String bpass,String confirmbpass,String sphrase)
	{
		backupName.sendKeys(bname);
		backupPassword.sendKeys(bpass);
		backupConfirmPassword.sendKeys(confirmbpass);
		seedPhrase.sendKeys(sphrase);
		checkField.click();
		recoverButton.click();
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

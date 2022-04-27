package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

public class SauceLabLoginPage extends Setup {

	public SauceLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// Setup.driver = driver;
	}

	@FindBy(xpath = "//div[contains(@class,'logo')]")
	public WebElement loginLogo;
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement txtBoxUserName;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement txtBoxPassword;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement btnLogin;

	public void setUserName(String username) {
		txtBoxUserName.sendKeys(username);
	}

	public void setPassword(String password) {
		txtBoxPassword.sendKeys(password);
	}

	public void verifyloginlogo() {
		
		loginLogo.isDisplayed();
		
	}

	

	public void clickOnLogin() {
		btnLogin.click();
	}

}

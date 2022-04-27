package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class SauceLabCheckOutPage extends Setup {
	public SauceLabCheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// Setup.driver = driver;
	}

	@FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
	public WebElement pagetitle;
	
	
	@FindBy(xpath = "//input[contains(@id,'first-name')]")
	public WebElement txtBoxFirstName;

	@FindBy(xpath = "//input[contains(@id,'last-name')]")
	public WebElement txtBoxLastName;
	
	@FindBy(xpath = "//input[contains(@id,'postal-code')]")
	public WebElement txtBoxPostalCode;
	
	@FindBy(xpath = "//input[contains(@id,'continue')]")
	public WebElement btnContinue;
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public void verifyPagetitle() {
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(pagetitle));
		System.out.println("pagetitle:"+pagetitle.getText());
		pagetitle.isDisplayed();
		System.out.println("Value is:"+pagetitle.isDisplayed());
	}

	public void setFirstName(String firstname) {
		txtBoxFirstName.sendKeys(firstname);
	}

	public void setLastName(String lastname) {
		txtBoxLastName.sendKeys(lastname);
	}
		
	public void setPostalCode(String postalcode) {
		txtBoxPostalCode.sendKeys(postalcode);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	

}

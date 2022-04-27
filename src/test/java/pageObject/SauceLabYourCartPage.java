package pageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SauceLabYourCartPage extends Setup {
	public SauceLabYourCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// Setup.driver = driver;
	}

	@FindBy(xpath = "//span[@class='title'][contains(.,'Your Cart')]")
	public WebElement pagetitle;

	@FindBy(xpath = "//button[contains(.,'Remove')]")
	public WebElement btnRemove;
	
	@FindBy(xpath = "//button[contains(@id,'continue-shopping')]")
	public WebElement btnContinueShopping;
	
	@FindBy(xpath = "//button[contains(@id,'checkout')]")
	public WebElement btnCheckOut;

	WebDriverWait wait = new WebDriverWait(driver, 20);

	public void verifyPagetitle() {
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(pagetitle));
		System.out.println("pagetitle:"+pagetitle.getText());
		pagetitle.isDisplayed();
		System.out.println("Value is:"+pagetitle.isDisplayed());
	}

	public void clickonContinueShopping(){
  
		btnContinueShopping.click();
	
		
	}
   public void clickonRemove() {
		
	   btnRemove.click();
		
	}
	

	public void clickonCheckOut() {
		
		btnCheckOut.click();
		
	}

}

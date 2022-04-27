package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class SauceLabCheckoutOverviewPage extends Setup {
	public SauceLabCheckoutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// Setup.driver = driver;
	}

	@FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Overview')]")
	public WebElement pagetitle;
	
	
	
	@FindBy(xpath = "//button[contains(@id,'finish')]")
	public WebElement btnFinish;
	
	
	@FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Complete!')]")
	public WebElement pagetitlecomplete;
	
	@FindBy(xpath = "//h2[@class='complete-header'][contains(.,'THANK YOU FOR YOUR ORDER')]")
	public WebElement orderconfirmation;
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public void verifyPagetitle() {
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(pagetitle));
		System.out.println("pagetitle:"+pagetitle.getText());
		pagetitle.isDisplayed();
		System.out.println("Value is:"+pagetitle.isDisplayed());
	}

	
	public void clickFinish()
	{
		 btnFinish.click();
	}
	
	public void verifyPagetitlecomplete() {
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(pagetitlecomplete));
		System.out.println("pagetitle:"+pagetitlecomplete.getText());
		pagetitlecomplete.isDisplayed();
		System.out.println("Value is:"+pagetitlecomplete.isDisplayed());
	}

	
	public void verifyOrderConfirmation() {
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(orderconfirmation));
		System.out.println("pagetitle:"+orderconfirmation.getText());
		orderconfirmation.isDisplayed();
		System.out.println("Value is:"+orderconfirmation.isDisplayed());
	}

}

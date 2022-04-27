package pageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SauceLabHomePage extends Setup {
	public SauceLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// Setup.driver = driver;
	}

	@FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
	public WebElement pagetitle;

	@FindBy(xpath = "(//button[contains(.,'Add to cart')])[1]")
	public WebElement btnAddtocart;
	
	@FindBy(xpath = "//button[contains(.,'Remove')]")
	public WebElement btnRemove;
	
	@FindBy(xpath = "//button[contains(@id,'continue-shopping')]")
	public WebElement btnContinueShopping;
	
	
	@FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
	public WebElement btnBag;
	
	
	@FindBy(xpath = "//button[contains(@id,'checkout')]")
	public WebElement btnCheckOut;
	
	@FindBy(xpath = "//select[contains(@class,'product_sort_container')]")
	public WebElement btnProductSort;
	

	WebDriverWait wait = new WebDriverWait(driver, 20);

	public void verifyPagetitle() {
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(pagetitle));
		System.out.println("pagetitle:"+pagetitle.getText());
		pagetitle.isDisplayed();
		System.out.println("Value is:"+pagetitle.isDisplayed());
	}
	
	public void clickonProductSort() {
		
		btnProductSort.click();
		
		Select objSelect = new Select(btnProductSort);
		objSelect.selectByVisibleText("Price (low to high)");
			
		}
	

	public void clickonAddtocart() throws InterruptedException {

		
		btnAddtocart.click();
	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();", btnBag);
		System.out.println("Cart bag is displayed with an item"+btnBag.isDisplayed());
		Thread.sleep(2000);
		btnBag.click();
		
	}
   public void clickonRemove() {
		
	   btnRemove.click();
		
	}
	

	public void clickonCheckOut() {
		
		btnCheckOut.click();
		
	}

}

package stepDefinations;

import java.util.Map;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SauceLabCheckOutPage;
import pageObject.SauceLabCheckoutOverviewPage;
import pageObject.SauceLabHomePage;
import pageObject.SauceLabLoginPage;
import pageObject.SauceLabYourCartPage;

public class SauceLabStepDefinition extends Setup {
	
	SauceLabLoginPage login = new SauceLabLoginPage(driver);
	
	SauceLabHomePage home= new SauceLabHomePage(driver);
	
	SauceLabYourCartPage yourcart=new SauceLabYourCartPage(driver);
	
	SauceLabCheckOutPage checkout=new SauceLabCheckOutPage(driver);
	
	SauceLabCheckoutOverviewPage checkoutoverview=new  SauceLabCheckoutOverviewPage(driver);

	@Given("user is on saucedemo loginpage")
	public void user_is_on_saucedemo_loginpage() throws InterruptedException {
		
     login.verifyloginlogo();
     login.txtBoxUserName.isDisplayed();
		    
	}
	
	
	@And("user logged in using correct credential")
	public void user_logged_in_using_correct_credential(DataTable dataTable) throws InterruptedException {
		
	   
		Map<String, String> loginDetails = dataTable.asMap(String.class, String.class);
		
		login.setUserName(loginDetails.get("username"));
		login.setPassword(loginDetails.get("password"));
		login.clickOnLogin();
		
	}
	
	
	@And("user sorts item low to high")
	public void user_sorts_item_low_to_high() throws InterruptedException {
	
        home.clickonProductSort();
		
		Thread.sleep(2000);
		    
		}
	
	@And("user adds required item to cart")
	public void user_adds_required_item_to_cart() throws InterruptedException {
		
	home.verifyPagetitle();
	home.clickonAddtocart();
	
	Thread.sleep(2000);
	    
	}
	
	@Then("remove that item to go back")
	
	public void remove_that_item_to_go_back() throws InterruptedException {
		
    yourcart.clickonRemove();
    yourcart.clickonContinueShopping();
		    
		}
	
	@And("user proceeds to checkout")
	public void user_proceeds_to_checkout() throws InterruptedException {
	home.clickonCheckOut();
	
	}
	@And("user enters the following details for checkout")
	public void user_enters_the_following_details_for_checkout(DataTable dataTable)throws InterruptedException {
       Map<String, String> checkoutDetails = dataTable.asMap(String.class, String.class);
       
		checkout.setFirstName(checkoutDetails.get("FirstName"));
		checkout.setLastName(checkoutDetails.get("LastName"));
		checkout.setPostalCode(checkoutDetails.get("PostalCode"));
		
	}
	@When("user confirm checkout")
	public void user_confirm_checkout() throws InterruptedException{
	    checkout.clickContinue();
	}
	@Then("user verify final confirmation message")
	public void user_verify_final_confirmation_message() throws InterruptedException {
		checkoutoverview.verifyPagetitle();
		checkoutoverview.clickFinish();
		checkoutoverview.verifyPagetitlecomplete();
		checkoutoverview.verifyOrderConfirmation();
		
	   
	}




}

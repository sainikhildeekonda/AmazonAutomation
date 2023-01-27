package com.Amazon.testscripts;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import com.Amazon.PageObjectModelWebPageClassFiles.SignInPage;
import com.Amazon.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageUsernameorNumberValidationAfterBuyNowTest {

	 private DriverUtilities driverUtilities;
	  private  WebDriver driver;
	@Given("check sign-in page is displayed")
	public void check_sign_in_page_is_displayed() {
		driverUtilities=DriverUtilities.getInstance();
		   driver=driverUtilities.getDriver();
		   assertTrue(SignInPage.CheckSignIn(driver).isDisplayed());
	}

	@When("check if User is asked for email or mobile number")
	public void check_if_user_is_asked_for_email_or_mobile_number() {
		   assertTrue(SignInPage.checkIfemailOrMobileNumberAsked(driver).isDisplayed());
	}

	@Then("user stays in same page")
	public void user_stays_in_same_page() {
	 
	}
	@After
	public void testDone()
	{
		 driver.close();
	}	
}

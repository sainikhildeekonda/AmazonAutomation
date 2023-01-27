package com.Amazon.testscripts;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.Amazon.PageObjectModelWebPageClassFiles.DetailsPage;
import com.Amazon.PageObjectModelWebPageClassFiles.SignInPage;
import com.Amazon.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KindleProductDetailPageTest {

	 private DriverUtilities driverUtilities;
	  private  WebDriver driver;
	  
	  @Given("check Buy now is displayed")
		public void check_buy_now_is_displayed() {
			driverUtilities=DriverUtilities.getInstance();
			   driver=driverUtilities.getDriver();
			   assertTrue(DetailsPage.BuyNowOption(driver).isDisplayed());

		}

		@When("User click on buy now")
		public void user_click_on_buy_now() throws InterruptedException {
			if(DetailsPage.BuyNowOption(driver).isDisplayed())
			{
				DetailsPage.BuyNowOption(driver).click();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		@Then("the User should be directed to login page")
		public void the_user_should_be_directed_to_login_page() {
		  assertTrue(SignInPage.CheckSignIn(driver).isDisplayed());
		}
}

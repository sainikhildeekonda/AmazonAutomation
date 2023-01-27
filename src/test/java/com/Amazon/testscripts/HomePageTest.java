package com.Amazon.testscripts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.Amazon.PageObjectModelWebPageClassFiles.DetailsPage;
import com.Amazon.PageObjectModelWebPageClassFiles.HomePage;
import com.Amazon.data.DataFile;
import com.Amazon.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest {

	 private DriverUtilities driverUtilities;
	  private  WebDriver driver;

@Before
public void setUp()
{
	 driverUtilities=DriverUtilities.getInstance();
	   driver=driverUtilities.getDriver();
}
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		driverUtilities=DriverUtilities.getInstance();
		   driver=driverUtilities.getDriver();
		   driver.get(DataFile.homeURL);
	}

	@When("user open the amazon application")
	public void user_open_the_amazon_application() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Then("Home Page of amazon should be displayed")
	public void home_page_of_amazon_should_be_displayed() {
			assertEquals("https://www.amazon.ca/",HomePage.CheckForHomePageUrl(driver));
		
	}

	@Given("check hamburger menu is displayed")
	public void check_hamburger_menu_is_displayed() {
		driverUtilities=DriverUtilities.getInstance();
		   driver=driverUtilities.getDriver();
	

	}

	@When("User click on hamburger menu")
	public void user_click_on_hamburger_menu() throws InterruptedException {
		if(HomePage.CheckHamburgerMenu(driver).isDisplayed())
		{
			HomePage.CheckHamburgerMenu(driver).click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Then("the menu should open and contents should be displayed")
	public void the_menu_should_open_and_contents_should_be_displayed() {
		assertTrue(HomePage.MenuContents(driver).isDisplayed());
	}

	@Given("check kindle in Digital Content and Devices is displayed")
	public void check_digital_content_and_devices_is_displayed() {
		driverUtilities=DriverUtilities.getInstance();
		   driver=driverUtilities.getDriver();
			assertTrue(HomePage.KindleOption(driver).isDisplayed()); 
	}

	@When("User click on kindle")
	public void user_click_on_kindle() throws InterruptedException {
		if(HomePage.KindleOption(driver).isDisplayed())
		{
			HomePage.KindleOption(driver).click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("User should redirect to the Kinder E Reader menu")
	public void user_should_redirect_to_the_kinder_e_reader_menu() {
	assertTrue(HomePage.CheckKindleEReader(driver).isDisplayed());
	}

	@Given("check all new kindle is displayed")
	public void check_kinder_e_reader_menu_is_displayed() {
	driverUtilities=DriverUtilities.getInstance();
	   driver=driverUtilities.getDriver();
}

	@When("User click on all new kindle")
	public void user_click_on_all_new_kindle() throws InterruptedException {
			
		if(HomePage.CheckAllNewkindle(driver).isDisplayed())
		{
			HomePage.CheckAllNewkindle(driver).click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@Then("the Kindle details page should be displayed")
	public void the_kindle_details_page_should_be_displayed() {
	assertTrue(DetailsPage.kindleDetails(driver).isDisplayed());
	}

	


}

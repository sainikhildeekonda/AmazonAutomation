package com.Amazon.PageObjectModelWebPageClassFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	public static WebElement CheckSignIn(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@class=\"a-spacing-small\"]"));
	}

	public static WebElement checkIfemailOrMobileNumberAsked(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@class=\"a-form-label\"]"));
	}

}

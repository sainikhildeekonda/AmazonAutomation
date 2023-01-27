package com.Amazon.PageObjectModelWebPageClassFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailsPage {

	public static WebElement kindleDetails(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"productTitle\"]"));
	}

	public static WebElement BuyNowOption(WebDriver driver) {

		return driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]"));
	}
	
	

}

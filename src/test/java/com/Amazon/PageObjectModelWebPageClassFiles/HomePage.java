package com.Amazon.PageObjectModelWebPageClassFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	

	public static String CheckForHomePageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public static WebElement CheckHamburgerMenu(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]"));
	}

	public static WebElement MenuContents(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='digital content and devices']"));
	}

	public static WebElement KindleOption(WebDriver driver) {
		
		return driver.findElement(By.xpath("//a[@data-ref-tag=\"nav_em_1_1_1_8\"]"));

	}

	public static WebElement CheckKindleEReader(WebDriver driver) {
	
		return driver.findElement(By.xpath("//*[text()='kindle e-readers']"));

	
	}

	public static WebElement CheckAllNewkindle(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='All-new Kindle']"));
		
	}



}

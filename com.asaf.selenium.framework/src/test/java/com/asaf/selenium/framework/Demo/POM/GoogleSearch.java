package com.asaf.selenium.framework.Demo.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.asaf.com.asaf.selenium.framework.TestNGBase;

public class GoogleSearch {
	//Declare controls
	private By searchBox = By.name("q");
	private By wikiLnk = By.xpath(null);
	
	
	//local variables
	WebDriver myDriver = TestNGBase.chromeDriver;
	
	public void launchGoogle() throws InterruptedException
	{
		//launch google
		myDriver.get("https://www.google.com/");
		Thread.sleep(3000);
		
	}
	
	public void searchGoogle() throws InterruptedException
	{
		myDriver.findElement(searchBox).sendKeys("Amdocs" + Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	
	public void validateAndClickWiki()
	{
		
		
	}
	
	
	

	
	

}

package com.asaf.selenium.framework.Demo.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.asaf.com.asaf.selenium.framework.TestNGBase;

public class GoogleSearch extends TestNGBase {
	//Declare controls
	private By searchBox = By.name("q");
	private By wikiLnk = By.xpath("//a[@href='https://en.wikipedia.org/wiki/Amdocs']");
	private By ceoName = By.xpath("//td[text()='Shuky Sheffer (']");
	
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
	
	public boolean validateAndClickWiki()
	{
		boolean linkExist;
		String ceoNameStr;
		//launch Google
		try {
		launchGoogle();
		searchGoogle();
		linkExist = myDriver.findElement(wikiLnk).isDisplayed();
		if(linkExist) {
			myDriver.findElement(wikiLnk).click();
			System.out.println("Wiki Link Exist and clicked.");	
			if(myDriver.findElement(ceoName).isDisplayed())
			{System.out.println("Wiki Page Visible.");
			ceoNameStr =myDriver.findElement(ceoName).getText();
			System.out.println(ceoNameStr);
			}
			else
			{System.out.println("Wiki Page not Visible.");
			}
		}
		else
		{
			System.out.println("Wiki Link Does not Exist.");
		}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
				
		return true;
	}
	

}

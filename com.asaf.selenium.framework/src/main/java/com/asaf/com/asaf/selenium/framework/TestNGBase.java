package com.asaf.com.asaf.selenium.framework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGBase {
	
  public static WebDriver chromeDriver;
  
  @Test
 public void f() {
  }
  //@BeforeClass
 // public void beforeClass() {
  //}

  //@AfterClass
  //public void afterClass() {
  //}

  //@BeforeTest
  //public void beforeTest() {
	//  System.out.println("End Suite");
 // }

  @BeforeSuite
  public void beforeSuite() {
	  //Set Chrome Driver
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	  
	  chromeDriver = new ChromeDriver();
	  chromeDriver.manage().window().maximize();
	  chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterSuite
  public void afterSuite() {
	 // chromeDriver.quit();
	  System.out.println("End Suite");
  }

}

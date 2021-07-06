package com.asaf.selenium.framework.Demo.Tests;



import org.testng.Assert;
//import static org.junit.Assert.*;
import org.testng.annotations.Test;

import com.asaf.selenium.framework.Demo.POM.GoogleSearch;

public class GoogleSearchTest extends GoogleSearch{

	@Test
	public void TestGoogleSearch()
	{
	
	//object of POM class
	GoogleSearch googleSearch = new GoogleSearch();
	
	System.out.println("Main Test");	
	//googleSearch.validateAndClickWiki(); 
	Assert.assertTrue(googleSearch.validateAndClickWiki());
	
	}
	
	}



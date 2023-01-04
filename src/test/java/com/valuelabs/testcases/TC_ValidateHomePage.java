package com.valuelabs.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.valuelabs.base.BaseClass;
import com.valuelabs.pageobjectsrepo.HomePage;


@Listeners(com.valuelabs.listners.MyTestNGListener.class)
public class TC_ValidateHomePage extends HomePage {
	HomePage hp;
	
	
	@BeforeMethod
	public void setup() {
		initialise();
		hp = new HomePage();
	}
	
	@Test(priority=1)
	public void validateTitleOfHomePageOfEnglishLang() {
		hp.selectEnglishLang();		
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "stc tv - Watch Online movies, series & live TV | Enjoy Free Trial","title not matched");
	}
	
	@Test(priority=2)
	public void validateLiteSubscripForKSA() {		
		Assert.assertTrue(hp.presenceOfLiteScription(),"Lite scription present for SA ");
	}
	
	@Test(priority=3,enabled = false)
	public void validateClassicSubscripForKSA() {		
		Assert.assertTrue(hp.presenceOfClassicScription(),"Classic scription present for SA ");
	}
	
	@Test(priority=4,enabled = false)
	public void validatePremiumSubscripForKSA() {		
		Assert.assertTrue(hp.presenceOfpremiumScription(),"premium scription present for SA ");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

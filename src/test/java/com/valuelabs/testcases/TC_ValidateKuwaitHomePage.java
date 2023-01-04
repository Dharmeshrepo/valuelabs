package com.valuelabs.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.valuelabs.base.BaseClass;
import com.valuelabs.pageobjectsrepo.HomePage;
import com.valuelabs.pageobjectsrepo.KuwaitHomePage;
@Listeners(com.valuelabs.listners.MyTestNGListener.class)
public class TC_ValidateKuwaitHomePage extends BaseClass {
	
HomePage hp;
KuwaitHomePage kp;
	
	
	@BeforeClass
	public void setup() {
		initialise();
		hp = new HomePage();
		kp = new KuwaitHomePage();
		hp.selectEnglishLang();
		
	}
				
	@Test(priority=1)
	public void ValidatePlanPriceCurrencyForKuwait() {		
		hp.clickOnCountrySelection();
		hp.selectCountry("Kuwait");		
		kp.checkPlanPriceCurr("lite");
		kp.checkPlanPriceCurr("classic");
		kp.checkPlanPriceCurr("premium");
	}
	

	@Test(priority=2)
	public void ValidatePlanPriceCurrencyForBahrain() {		
		hp.clickOnCountrySelection();
		hp.selectCountry("Bahrain");		
		kp.checkPlanPriceCurr("lite");
		kp.checkPlanPriceCurr("classic");
		kp.checkPlanPriceCurr("premium");
	}
	
	@Test(priority=3)
	public void ValidatePlanPriceCurrencyForKSA() {		
		hp.clickOnCountrySelection();
		hp.selectCountry("KSA");		
		kp.checkPlanPriceCurrKSA("lite");
		kp.checkPlanPriceCurrKSA("classic");
		kp.checkPlanPriceCurrKSA("premium");
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}



}

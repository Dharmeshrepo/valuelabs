package com.valuelabs.pageobjectsrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valuelabs.base.BaseClass;

public class KuwaitHomePage extends BaseClass {

	@FindBy(id = "name-lite")
	WebElement liteScription;

	@FindBy(xpath = "//div[@id='currency-premium']/b")
	WebElement currencyValOfliteScription;

	@FindBy(xpath = "//div[@id='currency-premium']/i")
	WebElement currencyTypeOfliteScription;

	public KuwaitHomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrencyTypeInfo() {
		String currTypeVal = currencyTypeOfliteScription.getText();
		return currTypeVal;
	}

	public String getCurrencyValInfo() {
		String currVal = currencyValOfliteScription.getText();
		return currVal;
	}

	public void checkPlanPriceCurr(String subType) {
		boolean liteSubPresent = driver.findElement(By.id("name-" + subType + "")).isDisplayed();
		String liteSubPrice = driver.findElement(By.xpath("//div[@id='currency-" + subType + "']/b")).getText();
		String liteSubCurrency = driver.findElement(By.xpath("//div[@id='currency-" + subType + "']/i")).getText();

		log.info(subType + " Subscription is present");
		log.info(subType + " Subscription's price is " + liteSubPrice);
		log.info(subType + " Subscription's currency is " + liteSubCurrency);

	}

	public void checkPlanPriceCurrKSA(String subType) {
		boolean liteSubPresent = driver.findElement(By.id("name-" + subType + "")).isDisplayed();
		String liteSubPrice = driver.findElement(By.xpath("//div[@id='currency-" + subType + "']/b")).getText();
		String liteSubCurrency = driver.findElement(By.xpath("//div[@id='currency-" + subType + "']/i[2]")).getText();

		log.info(subType + " Subscription is present");
		log.info(subType + " Subscription's price is " + liteSubPrice);
		log.info(subType + " Subscription's currency is " + liteSubCurrency);

	}

}

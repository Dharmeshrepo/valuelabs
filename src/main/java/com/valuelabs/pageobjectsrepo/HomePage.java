package com.valuelabs.pageobjectsrepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.valuelabs.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(id = "translation-btn")
	WebElement lnkEnlishLangSelection;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement lnkSignIn;

	// Type & Price and Currenc
	@FindBy(xpath = "//div[@class='plan-names']/div")
	List<WebElement> allTypesScriptions;

	@FindBy(id = "name-lite")
	WebElement liteScription;

	@FindBy(id = "name-classic")
	WebElement classicScription;

	@FindBy(id = "name-premium")
	WebElement premiumScription;

	@FindBy(id = "country-name")
	WebElement LnkcountrySelection;

	@FindBy(id = "kw-contry-lable")
	WebElement kuwaitCountry;

	@FindBy(id = "bh-contry-lable")
	WebElement bahrainCountry;

	@FindBy(id = "sa-contry-lable")
	WebElement ksaCountry;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	boolean status;

	public void selectEnglishLang() {
		log.info("User is about to select English langauge");
		lnkEnlishLangSelection.click();
		log.info("User has selected English langauge");

	}

	public boolean presenceOfLiteScription() {
		log.info("Looking for 'Lite' Scription");
		status = liteScription.isDisplayed();
		if (status) {
			log.info("'Lite' Scription is present");
		}
		return status;

	}

	public boolean presenceOfClassicScription() {
		log.info("Looking for 'Classic' Scription");
		status = classicScription.isDisplayed();
		if (status) {
			log.info("'Classic' Scription is present");
		}
		return status;
	}

	public boolean presenceOfpremiumScription() {
		log.info("Looking for 'Premium' Scription");
		status = premiumScription.isDisplayed();
		if (status) {
			log.info("'Premium' Scription is present");
		}
		return status;
	}

	public void clickOnCountrySelection() {
		LnkcountrySelection.click();
		log.info("User has clicked on country selection option");

	}

	public void selectCountry(String country) {
		switch (country) {
		case "Kuwait":
			kuwaitCountry.click();
			log.info("User has selected " + LnkcountrySelection.getText() + " country");
			break;
		case "Bahrain":
			bahrainCountry.click();
			log.info("User has selected " + LnkcountrySelection.getText() + " country");
			break;
		case "KSA":
			ksaCountry.click();
			log.info("User has selected " + LnkcountrySelection.getText() + " country");
			break;
		}
	}

}

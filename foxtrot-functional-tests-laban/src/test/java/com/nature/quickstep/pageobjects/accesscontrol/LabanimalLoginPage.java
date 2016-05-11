package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class LabanimalLoginPage extends PageObject {

	public static final String LOGIN_COOKIE = "login";
	private static final int wait = 20;

	@Override
	public void navigateTo() {
		browser().get(context().getURL("labanimal.com/laban/index.html"));
	}

	@Override
	public boolean isPresent() {
		return false;
	}

	public WebElement fldEmailAddress() {
		ensure().element(By.id("email-input")).seconds(wait);
		return browser().findElement(By.id("email-input"));
	}

	public WebElement fldPassword() {
		ensure().element(By.id("password-input")).seconds(wait);
		return browser().findElement(By.id("password-input"));
	}

	public WebElement btnLogin() {
		ensure().element(By.id("submit-input")).seconds(wait);
		return browser().findElement(By.id("submit-input"));
	}

	public WebElement lnkLogout() {
		ensure().element(By.id("laban-logoff")).seconds(wait);
		return browser().findElement(By.id("laban-logoff"));
	}

	public void loginUser(String email, String password) {
		fldEmailAddress().clear();
		fldPassword().clear();
		fldEmailAddress().sendKeys(email);
		fldPassword().sendKeys(password);
		btnLogin().click();
	}

	public void validateUserSuccessfullyLoggedIN() {
		Cookie loginCookie = browser().manage().getCookieNamed(LOGIN_COOKIE);
		assertNotNull(loginCookie);
	}

	public void clickOnLogoutLink() {
		lnkLogout().click();
	}

	public void validateUserNotLoggedIN() {
		Cookie loginCookie = browser().manage().getCookieNamed(LOGIN_COOKIE);
		assertNull(loginCookie);
	}

}

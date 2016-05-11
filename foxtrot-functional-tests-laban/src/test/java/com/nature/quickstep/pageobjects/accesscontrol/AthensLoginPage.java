package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class AthensLoginPage extends PageObject {
	private static final int wait = 20;

	@Override
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void navigateTo() {

		browser()
				.get(context()
						.getURL("labanimal.com/laban/journal/v43/n10/full/laban.622.html"));

	}

	public void validateLoginViaAthensLink() {
		assertEquals("Login via Athens", lnkLoginViaAthens().getText());
	}

	public WebElement lnkLoginViaAthens() {
		ensure().element(
				By.xpath("html/body/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/p[2]/a[6]"))
				.seconds(wait);
		return browser()
				.findElement(
						By.xpath("html/body/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/p[2]/a[6]"));

	}

	public void validateAthensLoginPage() {
		assertEquals("Authentication Point", fldAthensLoginpage().getText());
	}

	public WebElement fldAthensLoginpage() {
		ensure().element(By.xpath(".//*[@id='c2']/div/div[2]/div/h2/big"))
				.seconds(wait);
		return browser().findElement(
				By.xpath(".//*[@id='c2']/div/div[2]/div/h2/big"));

	}

	public void loginUsingAthensAccount(String username, String password)
			throws Exception {

		fldUsername().sendKeys(username);
		fldPassword().sendKeys(password);
		btnLogin().click();

	}

	public WebElement fldUsername() {
		ensure().element(By.id("ath_uname")).seconds(wait);
		return browser().findElement(By.id("ath_uname"));
	}

	public WebElement fldPassword() {
		ensure().element(By.id("ath_passwd")).seconds(wait);
		return browser().findElement(By.id("ath_passwd"));
	}

	public WebElement btnLogin() {
		ensure().element(By.name("submit")).seconds(wait);
		return browser().findElement(By.name("submit"));
	}

	public void validatefulltextcontent() {
		assertEquals("REGULATORY OVERSIGHT OF BIRDS", fldfulltextcontent()
				.getText());
	}

	public WebElement fldfulltextcontent() {
		ensure().element(
				By.xpath("html/body/table[3]/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[7]/td/span[8]"))
				.seconds(wait);
		return browser()
				.findElement(
						By.xpath("html/body/table[3]/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[7]/td/span[8]"));

	}
}
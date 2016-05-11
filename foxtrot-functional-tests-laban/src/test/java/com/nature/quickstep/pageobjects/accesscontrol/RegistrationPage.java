package com.nature.quickstep.pageobjects.accesscontrol;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("labanimal.com/laban/register"));
    }

    final long rnum = randomNumber();
    String email = "quickstep" + rnum + "@mailinator.com";

    public void completeStep1Registration() {

        ensure().element(By.name("email")).seconds(15);
        emailLaban().sendKeys(email);
        confirmEmailLaban().sendKeys(email);
        passwordLaban().sendKeys("password");
        confirmPasswordLaban().sendKeys("password");

        name1Laban().sendKeys("Cucumber");
        name2Laban().sendKeys("Jvm" + rnum);

        typeOfLabLaban("Other");
        positionLaban("Other");
        companyLaban().sendKeys("TEST");
    }

    public WebElement emailLaban() {
        return browser().findElement(By.name("email"));
    }

    public WebElement confirmEmailLaban() {
        return browser().findElement(By.name("emailConfirm"));
    }

    public WebElement passwordLaban() {
        return browser().findElement(By.name("password"));
    }

    public WebElement confirmPasswordLaban() {
        return browser().findElement(By.name("passwordConfirm"));
    }

    public WebElement name1Laban() {
        return browser().findElement(By.name("firstname"));
    }

    public WebElement name2Laban() {
        return browser().findElement(By.name("lastname"));
    }

    public void typeOfLabLaban(String workplace) {
        Select sele = new Select(browser().findElement(By.name("place")));
        sele.selectByVisibleText(workplace);
    }

    public void positionLaban(String position) {
        Select sele = new Select(browser().findElement(By.name("position")));
        sele.selectByVisibleText(position);
    }

    public WebElement companyLaban() {
        return browser().findElement(By.name("company"));
    }

    public WebElement continueLaban() {
        ensure().element(By.cssSelector("input[type=\"image\"]")).seconds(15);
        return browser().findElement(By.cssSelector("input[type=\"image\"]"));
    }

    public long randomNumber() {
        Date dt = new Date();
        long milliseconds = dt.getTime();
        return milliseconds;
    }

}

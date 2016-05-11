package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationComplete extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
    }

    public WebElement confirmationMessageLaban() {

        String confMsgElementXPath = "html/body/table[2]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/p[1]/span[2]/b";
        ensure().element(By.xpath(confMsgElementXPath)).seconds(15);
        return browser().findElement(By.xpath(confMsgElementXPath));
    }

    public void validateRegistrationCompleteMsg() {

        assertEquals("Your registration on labanimal.com is complete!", confirmationMessageLaban().getText());
    }

}

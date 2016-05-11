package com.nature.quickstep.pageobjects.accesscontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationEalertPage extends PageObject {

    @Override
    public void navigateTo() {
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement continuepage2Laban() {

        String elementXpath = "html/body/table[2]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table/tbody/tr/td/input";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

    public WebElement confirmLaban() {

        String elementXpath = "html/body/table[2]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/table/tbody/tr[32]/td/input";
        ensure().element(By.xpath(elementXpath)).seconds(15);
        return browser().findElement(By.xpath(elementXpath));
    }

}

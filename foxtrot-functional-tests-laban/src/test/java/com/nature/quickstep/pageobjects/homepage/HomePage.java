package com.nature.quickstep.pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class HomePage extends PageObject {

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub
        browser().get(context().getURL("labanimal.com/"));
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Returns a handle to the log in link.
     * 
     * @return <code>WebElement</code> as a handle to the log in link.
     */
    public WebElement lnkLogIn() {
        return browser().findElement(By.className("login"));
    }
}

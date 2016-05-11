package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.PageObject;

public class FindersPage extends PageObject {

    @Override
    public void navigateTo() {
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    public void navigateToFinder(String finder, String doi) throws Exception {
        browser().get(context().getURL("labanimal.com/laban/" + finder + "/" + doi));
    }

    public void verifyArticlePage(String article) throws Exception {
        assertEquals(context().getURL("labanimal.com/" + article), browser().getCurrentUrl());
    }

}

package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.site.FindersPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindersStepDefinitions {

    FindersPage findersPage = new FindersPage();

    @Given("^I am on labananimal.com$")
    public void I_am_on_labananimal_com() throws Throwable {
    }

    @When("^I navigate to finder \"([^\"]*)\" for doi \"([^\"]*)\"$")
    public void I_navigate_to_finder_for_doi(String finder, String doi) throws Throwable {
        findersPage.navigateToFinder(finder, doi);
    }

    @Then("^I should see the laban article \"([^\"]*)\"$")
    public void I_should_see_the_laban_article(String article) throws Throwable {
        findersPage.verifyArticlePage(article);
    }
}

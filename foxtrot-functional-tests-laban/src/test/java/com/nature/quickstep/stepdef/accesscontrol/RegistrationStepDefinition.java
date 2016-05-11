package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.RegistrationComplete;
import com.nature.quickstep.pageobjects.accesscontrol.RegistrationEalertPage;
import com.nature.quickstep.pageobjects.accesscontrol.RegistrationPage;
import com.nature.quickstep.pageobjects.homepage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {

    HomePage homePage = new HomePage();
    RegistrationPage regPage = new RegistrationPage();
    RegistrationEalertPage regEalertPage = new RegistrationEalertPage();
    RegistrationComplete regComplete = new RegistrationComplete();

    @Given("^I have no account on labanimal.com$")
    public void I_have_no_account_on_labanimal_com() throws Throwable {
        homePage.navigateTo();
    }

    @When("^I fill up information required on personal detail page$")
    public void I_fill_up_information_required_on_personal_detail_page() throws Throwable {
        regPage.navigateTo();
        regPage.completeStep1Registration();
        regPage.continueLaban().click();
    }

    @When("^I fill up Ealerts and confirm the registration$")
    public void I_fill_up_Ealerts_and_confirm_the_registration() throws Throwable {
        regEalertPage.continuepage2Laban().click();
        regEalertPage.confirmLaban().click();
    }

    @Then("^I should see a registration successful message$")
    public void I_should_see_a_registration_successful_message() throws Throwable {
        regComplete.validateRegistrationCompleteMsg();
    }
}

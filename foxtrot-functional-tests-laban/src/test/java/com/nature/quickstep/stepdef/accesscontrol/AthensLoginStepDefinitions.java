package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.AthensLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AthensLoginStepDefinitions {

	AthensLoginPage athens = new AthensLoginPage();

	@Given("^I navigate to Labanimal journal access page$")
	public void iNavigateToLabanimalJournalAccessPage() throws Throwable {
		athens.navigateTo();
		athens.validateLoginViaAthensLink();
	}

	@Given("^I click on Article 'Login via Athens' link$")
	public void iClickOnArticleLoginViaAthensLink() throws Throwable {
		athens.lnkLoginViaAthens().click();

	}

	@Given("^It navigates to the Athens login page$")
	public void itNavigatesToTheAthensLoginPage() throws Throwable {
		athens.validateAthensLoginPage();

	}

	@When("^I enter valid Athens credentials and click on login button$")
	public void iEnterValidAthensCredentialsAndClickOnLoginButton()
			throws Throwable {
		athens.loginUsingAthensAccount("npgtestindia", "AthMacIn2014");

	}

	@Then("^I can get full access for Labanimal journal articles$")
	public void iCanGetFullAccessForLabanimalJournalArticles() throws Throwable {
		athens.validatefulltextcontent();

	}
}

package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.LabanimalLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

	LabanimalLoginPage login = new LabanimalLoginPage();

	@Given("^User navigate to Labanimal.com login page$")
	public void userNavigateToLabanimalComLoginPage() throws Throwable {
		login.navigateTo();

	}

	@When("^User enters valid credentials$")
	public void userEntersValidCredentials() throws Throwable {
		login.loginUser("quickstepuser14@mailinator.com", "qwer1234");

	}

	@Then("^User should be able to login successfully$")
	public void userShouldBeAbleToLoginSuccessfully() throws Throwable {
		login.validateUserSuccessfullyLoggedIN();
		login.clickOnLogoutLink();
		login.validateUserNotLoggedIN();

	}

	@When("^User enters invalid credentials$")
	public void userEntersInvalidCredentials() throws Throwable {
		login.loginUser("invalidUserID", "invalidPassword");

	}

	@Then("^User should not be able to login$")
	public void userShouldNotBeAbleToLogin() throws Throwable {
		login.validateUserNotLoggedIN();

	}

	@Given("^User is loggedin and on Labanimal.com home page$")
	public void userIsLoggedinAndOnLabanimalComHomePage() throws Throwable {

		login.navigateTo();
		login.loginUser("quickstepusernature_login@mailinator.com", "qwer1234");
		login.validateUserSuccessfullyLoggedIN();

	}

	@When("^User clicks on logout link$")
	public void userClicksOnLogoutLink() throws Throwable {
		login.clickOnLogoutLink();

	}

	@Then("^User should be logout successfully$")
	public void userShouldBeLogoutSuccessfully() throws Throwable {
		login.validateUserNotLoggedIN();

	}
}
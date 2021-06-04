package com.lifeplus.step_definitions;

import com.lifeplus.utilities.ConfigurationReader;
import com.lifeplus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("user navigates to login")
    public void user_navigates_to_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("enter valid {string} and {string}")
    public void enter_valid_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be login successfully")
    public void the_user_should_be_login_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

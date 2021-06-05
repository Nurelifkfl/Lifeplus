package com.lifeplus.step_definitions;

import com.lifeplus.pages.LoginPage;
import com.lifeplus.utilities.BrowserUtils;
import com.lifeplus.utilities.ConfigurationReader;
import com.lifeplus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginStepDefinitions {

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user navigates to login")
    public void user_navigates_to_login() {

        BrowserUtils.waitFor(2000);
        String loginButton="//*[text()='Log in or register']";
       Driver.get().findElement(By.xpath(loginButton)).click();

       String popUpLoginBut=".popup-button.login-button";
       Driver.get().findElement(By.cssSelector(popUpLoginBut)).click();
    }

    @When("enter valid {string} and {string}")
    public void enter_valid_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be login successfully")
    public void the_user_should_be_login_successfully() {



    }



}

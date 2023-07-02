package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registration1_AccountCreation;
import org.testng.Assert;

public class D01_Registration {
    P01_Registration1_AccountCreation link = new P01_Registration1_AccountCreation();
    @Given("User navigate to registration page")
    public void user_navigate_to_registration_page() {
        Hooks.driver.get("https://portal-demo.finflx.com/register/");
    }
    @When("User Enters Work Email {string}")
    public void user_enters_work_email(String WorkEmail) {
        link.workEmail.sendKeys(WorkEmail);
    }

    @When("User Clicks Continue button")
    public void user_clicks_continue_button() {
        link.continueBTN.click();
    }

    @When("User Enters First name {string}")
    public void user_enters_first_name(String firstName) {
        link.firstName.sendKeys(firstName);
    }

    @When("User Enters Last name {string}")
    public void user_enters_last_name(String lastName) {
        link.lastName.sendKeys(lastName);
    }

    @When("User Enters Company name {string}")
    public void user_enters_company_name(String companyName) {
        link.workEmail.sendKeys(companyName);
    }

    @When("User Clicks Create Account button")
    public void user_clicks_create_account_button() {
    link.createAccountBTN.click();
    }

    @Then("New Account is registered")
    public void new_account_is_registered() {
        Assert.assertTrue(link.registerSuccess.getText().contains("Registered successfully !"));
    }

}

package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Registration2_UserCreation;
import org.example.pages.P03_Email;
import org.example.pages.P04_DepartmentAndPlan;
import org.testng.Assert;

public class D02_UserCreation {
    P02_Registration2_UserCreation link = new P02_Registration2_UserCreation();
    P03_Email mailLink = new P03_Email();
    P04_DepartmentAndPlan deplink = new P04_DepartmentAndPlan();

    @Given("User navigate to his email")
    public void user_navigate_to_his_email() {
        Hooks.driver.get("https://mailtrap.io/");
        mailLink.logInBTN.click();
        mailLink.logInMailBox.sendKeys("youssefmohamed.ymx@gmail.com");
        mailLink.nextBTN.click();
        mailLink.logInPasswordBox.sendKeys("P@ssw0rd");
        mailLink.logInBTN2.click();
        Hooks.driver.get("https://mailtrap.io/inboxes/1822737/messages");
    }

    @When("User finds his verification mail")
    public void user_finds_his_verification_mail() {
        mailLink.registrationMail.click();

    }

    @When("User Clicks Start here button")
    public void user_clicks_start_here_button() {
        mailLink.startHereBTN.click();
    }

    @When("User Enters firstName {string}")
    public void user_enters_firstName(String first) {
        link.firstName2.sendKeys(first);
    }

    @When("User Enters lastName {string}")
    public void user_enters_lastName(String last) {
        link.lastName2.sendKeys(last);
    }

    @When("User Enters password {string}")
    public void user_enters_password(String pass) {
        link.newPassword.sendKeys(pass);
    }


    @When("User Reenters password {string}")
    public void user_reenters_password(String pass) {
        link.confirmPassword.sendKeys(pass);
    }

    @When("User Clicks Create Account button")
    public void User_Clicks_Create_Account_button() {
        link.createAccountBTN2.click();
    }
    @When("User chooses department")
    public void user_chooses_department() {
        deplink.HR.click();
        deplink.ContinueBTN1.click();
    }

    @When("User chooses plan")
    public void user_chooses_plan() {
        deplink.FinFlxApp.click();
        deplink.ContinueBTN2.click();
    }

    @When("User clicks the Start button")
    public void user_clicks_the_start_button() {
        deplink.startBTN.click();
    }

    @Then("User is directed to homepage")
    public void user_is_directed_to_homepage() {
        Assert.assertTrue(deplink.upload.getText().contains("Upload Employee Details"));
    }

}

package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_Homepage;
import org.example.pages.P06_Login;

public class D03_UploadEmployees {
    P05_Homepage link = new P05_Homepage();
    P06_Login loginLink = new P06_Login();

    @Given("User logs in with Email {string} and Password {string}")
    public void user_logs_in_with_email_and_password(String mail, String password) {
    Hooks.driver.get("https://portal-demo.finflx.com/login");
    loginLink.email.sendKeys(mail);
    loginLink.password.sendKeys(password);
    loginLink.loginBTN.click();
    }

    @When("User uploads Employees data")
    public void user_uploads_employees_data() {

        link.uploadEmployees.sendKeys("C:\\Work Files\\FinFlx\\Onboarding Automation\\OnboardingAutomation\\ImportEmployeesTemplate.xlsx");
    }

    @When("User Clicks invite employess button")
    public void user_clicks_invite_employess_button() {
        link.inviteEmployees.click();
    }

    @Then("Employees are added to the app")
    public void employees_are_added_to_the_app() {
        System.out.println("Waiting for issue to be fixed");
    }
}

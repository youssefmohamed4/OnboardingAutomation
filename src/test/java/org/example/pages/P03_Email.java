package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_Email {
    public P03_Email() {
        PageFactory.initElements(Hooks.driver, this);
    }
    @FindBy(partialLinkText = "Log In")
    public WebElement logInBTN;

    @FindBy(id = "user_email")
    public WebElement logInMailBox;

    @FindBy(className = "login_next_button button button--medium button--block")
    public WebElement nextBTN;

    @FindBy(name = "commit")
    public WebElement logInBTN2;

    @FindBy(id = "user_password")
    public WebElement logInPasswordBox;

    @FindBy(partialLinkText = "FinFlx Gratuity Platform Registration")
    public WebElement registrationMail;

    @FindBy(partialLinkText = "Start Here")
    public WebElement startHereBTN;


}

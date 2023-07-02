package org.example.pages;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Registration1_AccountCreation {
    public P01_Registration1_AccountCreation(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(name="workEmail")
    public WebElement workEmail;

    @FindBy(id = ":r0:")
    public WebElement continueBTN;

    @FindBy(name="firstName")
    public WebElement firstName;

    @FindBy(name="lastName")
    public WebElement lastName;

    @FindBy(name="companyName")
    public WebElement companyName;

    @FindBy(id = ":r0:")
    public WebElement createAccountBTN;

    @FindBy(className = "MuiAlert-message css-9qnipz")
    public WebElement registerSuccess;
}

package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_DepartmentAndPlan {

    public P04_DepartmentAndPlan() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(partialLinkText = "Human Resources")
    public WebElement HR;

    @FindBy(id = ":rf:")
    public WebElement ContinueBTN1;

    @FindBy(partialLinkText = "FinFlx App")
    public WebElement FinFlxApp;

    @FindBy(id = ":r15:")
    public WebElement ContinueBTN2;


    @FindBy(id = ":r17:")
    public WebElement startBTN;

    @FindBy(className = "MuiTypography-root MuiTypography-h1 css-1tzspw2")
    public WebElement upload;




}

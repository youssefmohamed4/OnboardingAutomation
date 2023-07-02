package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_Homepage {

    public P05_Homepage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(xpath = "//input")
    public WebElement uploadEmployees;

    @FindBy(id = ":r1:")
    public WebElement inviteEmployees;

}

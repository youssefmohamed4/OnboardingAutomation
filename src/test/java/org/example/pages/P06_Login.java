package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_Login {
    public P06_Login() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(partialLinkText = "Email")
    public WebElement email;

    @FindBy(partialLinkText = "Password")
    public WebElement password;

    @FindBy(id = ":rh:")
    public WebElement loginBTN;
}

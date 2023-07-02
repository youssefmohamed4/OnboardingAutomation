package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Registration2_UserCreation {

    public P02_Registration2_UserCreation() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(name = "firstName")
    public WebElement firstName2;

    @FindBy(name = "lastName")
    public WebElement lastName2;

    @FindBy(className = "MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-1e1a7h9")
    public WebElement newPassword;

    @FindBy(className = "MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-1e1a7h9")
    public WebElement confirmPassword;

    @FindBy(id = ":r0:")
    public WebElement createAccountBTN2;

    @FindBy(className = "MuiTypography-root MuiTypography-h1 css-1tzspw2")
    public WebElement department;

}

package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageTags_LoginPage {

    public void LogInPage (){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "USER_LOGIN")
    public WebElement inputEmail;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(className = "login-btn")
    public WebElement logInButton;

}

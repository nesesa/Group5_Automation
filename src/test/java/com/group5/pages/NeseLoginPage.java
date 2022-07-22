package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeseLoginPage {

    public NeseLoginPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(name="USER_LOGIN")
    public WebElement userName;

    @FindBy(name="USER_PASSWORD")
    public WebElement passWord;

    @FindBy(className = "login-btn")
    public WebElement logInButton;

}

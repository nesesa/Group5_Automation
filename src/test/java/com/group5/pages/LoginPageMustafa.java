package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMustafa {

    public LoginPageMustafa(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // MainPage Login

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement Username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement Password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement Login;

    // Message Page

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
    public WebElement EVENT;



}

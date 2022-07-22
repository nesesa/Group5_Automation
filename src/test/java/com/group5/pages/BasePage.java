package com.group5.pages;


import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {PageFactory.initElements(Driver.getDriver(), this);}



}

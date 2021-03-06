package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage_Zull1127_Mustafa {

    public MainPage_Zull1127_Mustafa(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Message Page Login

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-message\"]/span")
    public static WebElement MessageButton;


    /**
     * AC1
     */

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public static WebElement AddMention;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public static WebElement ExistingMailAddressClear;

    @FindBy(xpath = " //a[contains(@id,\"destDepartmentTab\")]")
    public static WebElement EmployeesAndDepartments;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public static WebElement EmployeeMailAddress;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[1]")
    public static WebElement SelectedEmployeeMailAddress;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner']/a[contains(text(),\"cybertekschool\")])[1]")
    public static WebElement ActualMailAddress;










    // AC2

    @FindBy(xpath = "//span[@title=\"Link\"]")
    public WebElement Link;

    // AC3

    @FindBy(xpath = "//span[@title=\"Insert video\"]")
    public WebElement InsertVideo;

    // AC4

    @FindBy(xpath = "//span[@title=\"Quote text\"]")
    public WebElement QuoteText;

    // AC5

    @FindBy(xpath = "//span[@title=\"Add tag\"]")
    public WebElement AddTag;

    // AC6




    //SEND Button

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public static WebElement SEND;


}

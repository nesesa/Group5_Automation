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

    @FindBy(xpath = "//span[.='Message']/span")
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


    /**
     * AC2
     */

    @FindBy(xpath = "//span[@title=\"Link\"]")
    public static WebElement Link;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public static WebElement LinkText;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public static WebElement LinkURL;

    @FindBy(xpath = "//input[@id='undefined']")
    public static WebElement SaveButton;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a")
    public static WebElement ActualText;

    /**
     * AC3
     */

    @FindBy(xpath = "//span[@id='bx-b-video-blogPostForm']/span/i")
    public static WebElement InsertVideo;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public static WebElement VideoSourceText;

    @FindBy(xpath = "//input[@id='undefined']")
    public static WebElement VideoSaveButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe'][1]")
    public static WebElement Iframe;

    @FindBy(xpath = "//body[text()]")
    public static WebElement actualInputInMessagesBox;

    /**
     * AC14
     */

    @FindBy(xpath = "//span[@title='Quote text']")
    public static WebElement QuoteButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public static WebElement QuoteTextBox;

    @FindBy(xpath = "(//div[@class='blog-post-quote']//td)[1]")
    public static WebElement actualQuote;

    /**
     * AC5
     */

    @FindBy(xpath = "//span[@title='Add tag']")
    public static WebElement addTag;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement tagInputRow;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement tagAddButton;

    @FindBy(xpath = "(//a[@class='feed-com-tag'])[1]")
    public static WebElement actualTag;

    @FindBy(xpath = "//body")
    public static WebElement messageInputRow;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement messageVerify;

    /**
     * AC6
     */

    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
    public static WebElement deleteTag;

    @FindBy(xpath = "(//div[@class='feed-com-tags-block'])[1]")
    public static WebElement tagLocation;




    //SEND Button

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public static WebElement SEND;


}

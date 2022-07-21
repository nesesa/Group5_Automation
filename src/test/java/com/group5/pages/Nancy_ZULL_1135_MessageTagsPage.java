package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Nancy_ZULL_1135_MessageTagsPage {

    public Nancy_ZULL_1135_MessageTagsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Message']/span")
    public static WebElement messagesTab;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public static WebElement mentionButton;

    @FindBy(xpath = "//a[contains(@id,\"destDepartmentTab\")]")
    public static WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public static List<WebElement> employeeUsernames;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a[contains(text(),\"cybertekschool\")]")
    public static WebElement verifyMention;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[1]")
    public static WebElement messagesIframe;

    @FindBy(xpath = "//body")
    public static WebElement messagesInput;

    @FindBy(id = "blog-submit-button-save")
    public static WebElement sendButton;

    @FindBy(xpath = "//span[@title='Link']")
    public static WebElement linkButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public static WebElement inputText;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public static WebElement inputUrl;

    @FindBy(xpath = "//input[@value='Save']")
    public static WebElement saveButton;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a")
    public static WebElement actualLinkText;

    @FindBy(xpath = "//span[@title='Insert video']")
    public static WebElement insertVideoButton;

    @FindBy(xpath = "//input[@class='bxhtmled-90-input']")
    public static WebElement videoInputBox;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public static WebElement videoSaveButton;

    @FindBy(xpath = "//body[text()]")
    public static WebElement actualInputInMessagesBox;

    @FindBy(xpath = "//span[@title='Quote text']")
    public static WebElement quoteTextButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public static WebElement getQuoteTextRibbon;

    @FindBy(xpath = "//div[@class='blog-post-quote']//td")
    public static WebElement actualQuote;

    @FindBy(xpath = "//span[@title='Add tag']")
    public static WebElement addTagButton;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public static WebElement tagTextInput;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public static WebElement tagAddButton;

    @FindBy(xpath = "//a[@class='feed-com-tag']")
    public static WebElement actualTag;

    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
    public static WebElement tagDeleteButton;

    @FindBy(xpath = "//div[@class='feed-post-text-block']")
    public static WebElement tagLocator;



}

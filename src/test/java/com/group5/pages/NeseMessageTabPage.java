package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeseMessageTabPage {

    public NeseMessageTabPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath ="//span[@data-type='groups']/span")
    public WebElement allEmployees;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but'] ")
    public WebElement deleteBtn1;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement frameBody;

    @FindBy(xpath ="//div[contains(text(),'helpdesk1@cybertekschool.com')]")
    public WebElement email1;

    @FindBy(xpath = "(//span[contains(text(),'helpdesk1@cybertekschool.com')])[1]")
    public WebElement email2;

    @FindBy(xpath = "//a[@href='#U693']/div/div")
    public WebElement catAnimal;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel'] ")
    public WebElement cancelBtn;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[1]")
    public WebElement messagesIframe;

    @FindBy(xpath = "//*[@id='feed-add-post-form-tab-message']/span")
    public WebElement messageButton;

    @FindBy(xpath ="//div[@class='feed-add-error']//span[contains(text(),'The message title is not specified')]")
    public WebElement errorMessageTopic;

    @FindBy(xpath = "//span[contains(text(),'Please specify at least one person.')]")
    public WebElement textError;

    @FindBy(xpath = " //span[contains(text(),'The post has been deleted.' )] ")
    public WebElement deleteBtn2;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement recipient;

    @FindBy(xpath =" //span[contains(text(),'More' )]")
    public WebElement moreBtn2;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    public WebElement deleteButton;
}

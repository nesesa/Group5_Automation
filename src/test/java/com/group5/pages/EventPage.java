package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EventPage {
    public EventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement inputEmail;
    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;
    @FindBy(className = "login-btn")
    public WebElement   logInButton;
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-calendar\"]/span")
    public  WebElement eventButton;



    @FindBy(xpath = "//input[@id='feed-cal-event-fromcal_3Jcl']")
    public  WebElement startDate;
    @FindBy(css = "#feed_cal_event_from_timecal_3Jcl")
    public WebElement startTime;
    @FindBy(css = "#feed-cal-event-tocal_3Jcl")
    public WebElement endDate;
    @FindBy(css = "#feed_cal_event_to_timecal_3Jcl")
    public WebElement endTime;
    @FindBy(xpath = "//span[contains(text(),'Specify time zone')]")
    public  WebElement specifiedTimeSelectBox;
    @FindBy(css = "#feed-cal-tz-switchcal_3Jcl")
    public WebElement SpecifyTimezone;
    @FindBy(css = "#feed-cal-tz-fromcal_3Jcl")
    public WebElement fromTimeZone;
    @FindBy(css = "#feed-cal-tz-tocal_3Jcl")
    public WebElement toTimeZone;
    @FindBy(xpath = "//input[@id='event-full-daycal_3Jcl']")
    public  WebElement allDayCheckBox;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public  WebElement sendButton;
    @FindBy(xpath = "//span[contains(text(),'05/15/2022, 09:30 am')]")
    public  WebElement activeStreamDisplay;




    @FindBy(xpath = "//div[@class='feed-event-reminder-collapsed']")
    public  WebElement setReminderCheckBox;
    @FindBy(xpath = "//input[@id='event-remind_countcal_3Jcl']")
    public WebElement setReminderBox;
    @FindBy(xpath = "//select[@id='event-remind_typecal_3Jcl']")
    public WebElement setReminderDropdown;


    @FindBy(xpath = "//input[@id='event-locationcal_3Jcl']")
    public WebElement eventLocation;


    @FindBy(xpath = "//a[@id='feed-event-dest-add-link']")
    public WebElement memberButton;
    @FindBy(xpath = "//span[contains(text(),'helpdesk22@cybertekschool.com')]")
    public WebElement chosen1;



    @FindBy(xpath = "//div[contains(text(),'To all employees')]")
    public WebElement allEmployees;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement popUpButton;

    @FindBy(xpath = "//input[@placeholder='Event name']")
    public WebElement messageBox;

    @FindBy(xpath = "//a[contains(text(),'CPD')]")
    public WebElement eventName;

    @FindBy(xpath = "(//button[contains(text(),'Cancel')])[3]")
    public WebElement cancelButton;

    @FindBy(xpath = "(//span[@class='feed-event-more-link-text'])[1]")
    public WebElement moreButton;

    @FindBy(xpath = "//div[@id=\"feed-cal-additional-inner\"]/table/tbody/tr/td[@class=\"feed-cal-addit-left-c\"]/label")
    public List<WebElement> checklist;




}

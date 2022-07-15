package com.group5.pages;

import com.group5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}

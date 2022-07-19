package com.group5.step_defs;

import com.group5.pages.EventPage;
import com.group5.utilities.BrowserUtils;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class EventStepDef {
    EventPage eventPage=new EventPage();
    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        eventPage.inputEmail.sendKeys("helpdesk1@cybertekschool.com");
        eventPage.inputPassword.sendKeys("UserUser");
        eventPage.logInButton.click();
    }
    @Given("User navigates to Event tab")
    public void user_navigates_to_event_tab() {
        eventPage.eventButton.click();
    }
    @When("User adds Event start date and time")
    public void user_adds_event_start_date_and_time() {
        String startDate = "08/15/2022";
        String startTime = "10:30 am";
        eventPage.startDate.clear();
        eventPage.startDate.sendKeys(startDate);
        eventPage.startTime.clear();
        eventPage.startTime.sendKeys(startTime);
    }
    @When("User adds Event end date and time")
    public void user_adds_event_end_date_and_time() {
        String endDate = "09/04/2022";
        String endTime = "12:30 am";
        eventPage.endDate.clear();
        eventPage.endDate.sendKeys(endDate);
        eventPage.endTime.clear();
        eventPage.endTime.sendKeys(endTime);
    }

    @When("User clicks {string}")
    public void user_clicks(String timeZone) {
        eventPage.SpecifyTimezone.click();
        Select slc = new Select(eventPage.fromTimeZone);
        slc.selectByValue("America/Dawson");
        slc = new Select(eventPage.toTimeZone);
        slc.selectByValue("Europe/London");
    }
    @When("User clicks {string} checkbox")
    public void userClicksCheckbox(String allDay) {
        eventPage.allDayCheckBox.click();
    }


    @When("User adds  {string} star date")
    public void userAddsStarDate(String date) {

        eventPage.startDate.clear();
        String startDate = "05/15/2022";
        eventPage.startDate.sendKeys(startDate);


    }
    @When("User clicks the send button")
    public void userClicksTheSendButton() {
        eventPage.sendButton.click();
    }
    @Then("User sees the  {string} on Active Stream")
    public void userSeesTheOnActiveStream(String date) {
        String expected="07/15/2022";
        String actual=eventPage.activeStreamDisplay.getText();

        Assert.assertEquals(actual,expected);
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);


    }


    @Given("User clicks “Set reminder” checkbox")
    public void user_clicks_set_reminder_checkbox() {

        eventPage.setReminderCheckBox.click();
    }
    @When("User fills out  {string} to the number box")
    public void userFillsOutToTheNumberBox(String number) {
        BrowserUtils.sleep(2);
        eventPage.setReminderBox.clear();
        number="366";
        eventPage.setReminderBox.sendKeys(number);
    } ;
    @When("User chooses {string} from time dropdown")
    public void user_chooses_from_time_dropdown(String time) {
        BrowserUtils.sleep(2);
        time="days";
        Select select=new Select(eventPage.setReminderDropdown);
        select.selectByValue("day");

    }




}

package com.group5.step_defs;

import com.group5.pages.EventPage;
import com.group5.utilities.BrowserUtils;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EventStepDef {
    EventPage eventPage=new EventPage();
    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        eventPage.inputEmail.sendKeys("helpdesk1@cybertekschool.com");
        eventPage.inputPassword.sendKeys("UserUser");
        eventPage.logInButton.click();
    }
    @When("User navigates to Event tab")
    public void user_navigates_to_event_tab() {
        eventPage.eventButton.click();

    }

    @When("User adds Event star  date and time")
    public void userAddsEventStarDateAndTime() {
        String startDate = "08/15/2022";
        String startTime = "10:30 am";
        eventPage.startDate.clear();
        eventPage.startDate.sendKeys(startDate);
        eventPage.startTime.clear();
        eventPage.startTime.sendKeys(startTime);
    }
    @And("User adds Event end day date and time")
    public void userAddsEventEndDayDateAndTime() {
        String endDate = "09/04/2022";
        String endTime = "12:30 am";
        eventPage.endDate.clear();
        eventPage.endDate.sendKeys(endDate);
        eventPage.endTime.clear();
        eventPage.endTime.sendKeys(endTime);
    }
    @When("User clicks {string} checkbox")
    public void userClicksCheckbox(String allDay) {
        eventPage.allDayCheckBox.click();
    }
    @When("User clicks {string} box")
    public void userClicksBox(String timeZone) {
        eventPage.SpecifyTimezone.click();
        Select slc = new Select(eventPage.fromTimeZone);
        slc.selectByValue("America/Dawson");
        slc = new Select(eventPage.toTimeZone);
        slc.selectByValue("Europe/London");


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
    @When("User clears the number box")
    public void userClearsTheNumberBox() {
        eventPage.setReminderBox.clear();
    }


    @Then("User should not see much {string} in number box")
    public void userShouldNotSeeMuchInNumberBox(String number) {

        //eventPage.setReminderBox.sendKeys(number);
        String expected="366";
        String actual=number;
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(actual,expected);


    }


    @When("User clicks {string} button")
    public void userClicksButton(String meetingRoom) {
        eventPage.eventLocation.click();
    }
    @When("User chooses {string} from dropdown")
    public void userChoosesFromDropdown(String chosenRoom) {
        eventPage.eventLocation.sendKeys("Central Meeting Room");

    }
    @Then("User sees the chosen room on {string} box")
    public void userSeesTheChosenRoomOnBox(String room) {
        Assert.assertTrue(eventPage.eventLocation.isDisplayed());
    }


    @When("User click Members box")
    public void userClickMembersBox() {
        eventPage.memberButton.click();
    }
    @When("User add attendees by{string}")
    public void userAddAttendeesBy(String individual) {
        // eventPage.memberButton.sendKeys("helpdesk22@cybertekschool.com");
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(eventPage.chosen1).click();

    }
    @And("User clicks the {string}button")
    public void userClicksTheButton(String popUpButton) {
        eventPage.popUpButton.click();
    }
    @Then("User sees selected person on the member box")
    public void userSeesSelectedPersonOnTheMemberBox() {
        Assert.assertTrue(eventPage.memberButton.isDisplayed());
    }

    @When("user adds attendees by {string}")
    public void userAddsAttendeesBy(String allEmployees) {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(eventPage.allEmployees).click();



    }
    @Then("User sees selected groups and department on the member box")
    public void userSeesSelectedGroupsAndDepartmentOnTheMemberBox() {
        Assert.assertTrue(eventPage.memberButton.isDisplayed());
    }

    @When("User fills out Message Box with {string}")
    public void userFillsOutMessageBoxWith(String cpd) {
        eventPage.messageBox.sendKeys(cpd);
    }
    @Then("User sees  event name on the Active Stream")
    public void userSeesEventNameOnTheActiveStream() {
        eventPage.eventName.isDisplayed();
    }
    @When("User clicks the cancel button")
    public void userClicksTheCancelButton() {
        eventPage.cancelButton.click();
    }


    @When("user clicks More")
    public void userClicksMore() {
        eventPage.moreButton.click();
    }
    @Then("the following event details parameters should be displayed")
    public void theFollowingEventDetailsParametersShouldBeDisplayed(List<String> expectedList) {

        List<String> actualList = BrowserUtils.getElementsText( eventPage.checklist);
        Assert.assertEquals(expectedList,actualList);

    }



}

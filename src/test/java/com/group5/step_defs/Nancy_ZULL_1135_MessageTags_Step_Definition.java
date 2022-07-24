package com.group5.step_defs;


import com.github.javafaker.Faker;
import com.group5.pages.Nancy_ZULL_1135_MessageTagsPage;
import com.group5.pages.Nancy_ZULL_1135_LoginPage;
import com.group5.utilities.BrowserUtils;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class Nancy_ZULL_1135_MessageTags_Step_Definition {

    Nancy_ZULL_1135_LoginPage logInPage = new Nancy_ZULL_1135_LoginPage();
    Nancy_ZULL_1135_MessageTagsPage messageTagsPage = new Nancy_ZULL_1135_MessageTagsPage();
    Faker faker = new Faker();

    /**
     * Pre-Conditionss
     */
    @Given("User is on homepage")
    public void user_is_on_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

       logInPage.inputEmail.sendKeys("marketing1@cybertekschool.com");

       logInPage.inputPassword.sendKeys("UserUser");

       logInPage.logInButton.click();


    }

    @Given("User navigates to messages tab")
    public void userNavigatesToMessagesTab() {

        Nancy_ZULL_1135_MessageTagsPage.messagesTab.click();
        BrowserUtils.sleep(2);
    }


    /**
     * Acceptance Criteria 1
     */
    @When("User clicks Add Mention button")
    public void userClicksAddMentionButton() {

        Nancy_ZULL_1135_MessageTagsPage.mentionButton.click();
        BrowserUtils.sleep(2);
    }

    @And("User clicks Employee and departments tab")
    public void userClicksEmployeeAndDepartmentsTab() {

        Nancy_ZULL_1135_MessageTagsPage.employeesAndDepartmentsButton.click();

    }

    @When("User clicks on Department Employee username")
    public void userclicksondepartmentemployeeusername(String employeeUsername) {

        try {
            for (WebElement each : Nancy_ZULL_1135_MessageTagsPage.employeeUsernames) {

                if (each.getText().equalsIgnoreCase(employeeUsername))
                    each.click();

            }
        } catch (StaleElementReferenceException e) {

        }
    }
    @Then("User sees mentioned Employee username on Activity Stream")
    public void userSeesMentionedEmployeeUsernameOnActivityStream(String employeeUsername) {

        BrowserUtils.sleep(2);
        String expectedResult = employeeUsername;
        String actualResult = Nancy_ZULL_1135_MessageTagsPage.verifyMention.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }






    /**
     * Acceptance Criteria 2
     */
    @When("User clicks Link button")
    public void userClicksLinkButton() {

        Nancy_ZULL_1135_MessageTagsPage.linkButton.click();
    }

    @When("User fills out the text box with {string} and link ribbon with {string}")
    public void userFillsOutTheTextBoxWithAndLinkRibbonWith(String text, String link) {

        Nancy_ZULL_1135_MessageTagsPage.inputText.sendKeys(text);
        Nancy_ZULL_1135_MessageTagsPage.inputUrl.sendKeys(link);

    }

    @And("User clicks Save button")
    public void userClicksSaveButton() {
        Nancy_ZULL_1135_MessageTagsPage.saveButton.click();
    }

    @And("User clicks Send button at Messages Tab")
    public void userClicksSendButtonAtMessagesTab() {
        Nancy_ZULL_1135_MessageTagsPage.sendButton.click();
    }

    @Then("User sees the {string} attached to a specific {string}")
    public void userSeesTheAttachedToASpecific(String link, String text) {

        BrowserUtils.sleep(3);
        Assert.assertEquals(text, Nancy_ZULL_1135_MessageTagsPage.actualLinkText.getText());
    }

    /**
     * Acceptance Criteria 3
     */
    @When("User clicks Insert Video button")
    public void userClicksInsertVideoButton() {

        Nancy_ZULL_1135_MessageTagsPage.insertVideoButton.click();

    }

    @When("User enters {string} of the Video from {string}")
    public void userEntersOfTheVideoFrom(String url) {

        Nancy_ZULL_1135_MessageTagsPage.videoInputBox.sendKeys(url);

    }

    @And("User clicks Save button at Video popup")
    public void userClicksSaveButtonAtVideoPopup() {

        Nancy_ZULL_1135_MessageTagsPage.videoSaveButton.click();

    }

    @Then("User sees the video URL at Activity Stream")
    public void userSeesTheVideoURLAtActivityStream() {

        Driver.getDriver().switchTo().frame(Nancy_ZULL_1135_MessageTagsPage.messagesIframe);
        Assert.assertTrue(Nancy_ZULL_1135_MessageTagsPage.actualInputInMessagesBox.isDisplayed());

    }

    /**
     * Acceptance Criteria 4
     */
    @When("User clicks Quote Text button")
    public void userClicksQuoteTextButton() {

        Nancy_ZULL_1135_MessageTagsPage.quoteTextButton.click();

    }

    @When("User enters a {string} in yellow quote ribbon")
    public void userEntersAInYellowQuoteRibbon(String quote) {

        Driver.getDriver().switchTo().frame(Nancy_ZULL_1135_MessageTagsPage.messagesIframe);
        Nancy_ZULL_1135_MessageTagsPage.getQuoteTextRibbon.sendKeys(quote);
        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("User sees the {string} in Activity Stream")
    public void userSeesTheInActivityStream(String quote) {

        BrowserUtils.sleep(2);
        Assert.assertEquals(quote, Nancy_ZULL_1135_MessageTagsPage.actualQuote.getText());

    }

    /**
     * Acceptance Criteria 5
     */
    @When("User clicks add tag button")
    public void userClicksAddTagButton() {

        Nancy_ZULL_1135_MessageTagsPage.addTagButton.click();

    }

    @When("User enter a message input in message box")
    public void userEnterAMessageInputInMessageBox() {

        Driver.getDriver().switchTo().frame(Nancy_ZULL_1135_MessageTagsPage.messagesIframe);
        Nancy_ZULL_1135_MessageTagsPage.messagesInput.sendKeys(faker.chuckNorris().fact());
        Driver.getDriver().switchTo().defaultContent();


    }

    @When("User enters {string} in input box")
    public void userEntersInInputBox(String tag) {

        Nancy_ZULL_1135_MessageTagsPage.tagTextInput.sendKeys(tag);

    }

    @And("User clicks add button")
    public void userClicksAddButton() {

        Nancy_ZULL_1135_MessageTagsPage.tagAddButton.click();

    }

    @Then("User sees {string} in Activity Stream")
    public void userSeesInActivityStream(String tag) {

        BrowserUtils.sleep(2);
        Assert.assertEquals(tag, Nancy_ZULL_1135_MessageTagsPage.actualTag.getText());

    }

    /**
     * Acceptance Criteria 6
     */
    @When("User clicks delete sign next to the tag")
    public void userClicksDeleteSignNextToTheTag() {

        Nancy_ZULL_1135_MessageTagsPage.tagDeleteButton.click();

    }

    @Then("User removes the {string}")
    public void userRemovesThe(String tag) {

        BrowserUtils.sleep(2);
        Assert.assertFalse(Nancy_ZULL_1135_MessageTagsPage.tagLocator.getText().contains(tag));

    }


}
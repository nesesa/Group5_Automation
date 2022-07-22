package com.group5.step_defs;

import com.group5.pages.NeseLoginPage;
import com.group5.pages.NeseMessageTabPage;
import com.group5.utilities.BrowserUtils;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NeseMessageTabDef {

    NeseLoginPage neseLogInPage= new NeseLoginPage();
    NeseMessageTabPage NeseMessageTabPage = new NeseMessageTabPage();


    /**
     * Pre-Conditions
     */



    @Given("User is on homepage")
    public void userIsOnHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       neseLogInPage.userName.sendKeys(ConfigurationReader.getProperty("username") );
        neseLogInPage.passWord.sendKeys(ConfigurationReader.getProperty("password"));
        neseLogInPage .logInButton.click();

    }

    @Given("User navigates to messages tab")
    public void userNavigatesToMessagesTab() {
        NeseMessageTabPage.messageButton.click();


    }

    /**
     * Acceptance Criteria 1
     */

    @And("User clicks on send message button")
    public void userClicksOnSendMessageButton() {
        NeseMessageTabPage.sendBtn.click();

    }

    @And("User sees {string}")
    public void userSee(String string) {

        System.out.println("The message title is not specified");
        Assert.assertTrue(NeseMessageTabPage.errorMessageTopic.isDisplayed());
        // Assert.assertTrue(basePage.errorMessageTopic.getText().equals(string));
        BrowserUtils.sleep(2);


    }

    @And("User removes  All Employees button")
    public void userRemovesAllEmployeesButton() {
        BrowserUtils.sleep(2);
        NeseMessageTabPage .deleteBtn1.click();


    }

    @Then("user sees {string}")
    public void useSee(String string) {


        System.out.println("Please specify at least one person.");
        NeseMessageTabPage.recipient.click();
        //BrowserUtils.sleep(2);
        Assert.assertTrue(NeseMessageTabPage.textError.isDisplayed()); ;

    }



    /**
     * Acceptance Criteria 2
     */


    @When("User sees message delivery is to {string} by default")
    public void user_sees_message_delivery_is_to_by_default(String string) {
        System.out.println("user sees message delivery is to All employees by default");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(NeseMessageTabPage.allEmployees.getText().equals(string));
    }


    @When("User clicks on add more button")
    public void user_clicks_on_add_more_button() {
        System.out.println("user clicks on add more button");
        NeseMessageTabPage .moreButton.click();

    }
    @When("User clicks Employees and Departments button")
    public void user_employees_and_departments_button() {
        System.out.println("user clicks Employees and Departments button");
        NeseMessageTabPage .allEmployees.click();

    }

    @And("User clicks on email")
    public void userClicksOnEmail() {
        System.out.println("user clicks on email");
        NeseMessageTabPage.email1.click();
    }

    @Then("User sees {string} on the screen")
    public void userSeeEmailOnTheScreen(String string) {
        System.out.println("user see email ");
        // Assert.assertTrue(basePage.email2.isDisplayed());
        Assert.assertTrue(NeseMessageTabPage.email2.getText().equals(string));
        BrowserUtils.sleep(5);
    }


    /**
     * Acceptance Criteria 3
     */

    @Given("User writes {string}")
    public void user_writes(String string) {

        Driver.getDriver().switchTo().frame(NeseMessageTabPage.messagesIframe);
        NeseMessageTabPage .frameBody.sendKeys("cancelling my message");
        Driver.getDriver().switchTo().defaultContent();
        BrowserUtils.sleep(5);

    }


    @Given("User clicks cat animal")
    public void user_clicks_cat_animal() {
        System.out.println("user clicks on cat animal");
        NeseMessageTabPage .catAnimal.click();

    }
    @Given("User clicks on cancel button")
    public void user_clicks_on_cancel_button() {
        System.out.println("user clicks on cancel button");

        BrowserUtils.sleep(2);
        NeseMessageTabPage.cancelBtn.click();
        BrowserUtils.sleep(5);

    }

    /**
     * Acceptance Criteria 4
     */

    @When("User clicks on add more button from the sent message section")
    public void user_clicks_on_add_more_button_from_the_sent_message_section() {

        BrowserUtils.sleep(5);
        NeseMessageTabPage.moreBtn2.click();


    }


    @When("User clicks on delete button")
    public void user_clicks_on_delete_button() {
        BrowserUtils.sleep(5);
        NeseMessageTabPage .deleteButton.click();
        Driver.getDriver().switchTo().alert().accept();
        Driver.getDriver().switchTo().defaultContent();


    }
    @Then("User sees that message is deleted")
    public void user_see_that_message_is_deleted() {

        Assert.assertTrue(NeseMessageTabPage.deleteBtn2.getText().equals("The post has been deleted."));
        BrowserUtils.sleep(5);


    }



}

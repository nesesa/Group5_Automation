package com.group5.step_defs;

import com.group5.pages.BasePage;
import com.group5.pages.LoginPageMustafa;
import com.group5.pages.MainPage_Zull1127_Mustafa;
import com.group5.utilities.BrowserUtils;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;

public class Step_Definitions_Zull1127_Mustafa {

    BasePage basePage=new BasePage();
    LoginPageMustafa loginPageMustafa = new LoginPageMustafa();
    MainPage_Zull1127_Mustafa mainPage_zull1127_mustafa=new MainPage_Zull1127_Mustafa();

    /**
     * Background MainPage Login
     */

    @Given("User is on zulcrm home page")
    public void user_is_on_zulcrm_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("azulcrm.url"));
    }

    @When("User login username")
    public void user_login_username() {
        loginPageMustafa.Username.clear();
        loginPageMustafa.Username.sendKeys("helpdesk1@cybertekschool.com");
    }

    @When("User login password")
    public void user_login_password() {
        loginPageMustafa.Password.sendKeys("UserUser");
    }

    @Then("User click Log In and login CRM main page")
    public void user_click_log_in_and_login_crm_main_page() {
        loginPageMustafa.Login.click();
    }

    @When("User is on MESSAGE page")
    public void user_is_on_message_page() {
        MainPage_Zull1127_Mustafa.MessageButton.click();
    }

    /**
     * AC1
     */



    @When("User click Add Mention button")
    public void user_click_add_mention_button() {
        MainPage_Zull1127_Mustafa.ExistingMailAddressClear.click();
        MainPage_Zull1127_Mustafa.AddMention.click();
    }

    @When("User clicks Employee and departments button")
    public void user_clicks_employee_and_departments_button() {
        MainPage_Zull1127_Mustafa.EmployeesAndDepartments.click();
    }

    @When("User clicks one of the Department Employee mail address")
    public void user_clicks_one_of_the_department_employee_mail_address() {
        MainPage_Zull1127_Mustafa.EmployeeMailAddress.click();
    }

    @When("User clicks SEND button on Message page")
    public void user_clicks_send_button_on_message_page() {
        MainPage_Zull1127_Mustafa.SEND.click();
    }

    @Then("User sees that Employee mail address on Activity Stream page")
    public void user_sees_that_employee_mail_address_on_activity_stream_page() {

        String EmployeeExpectedMailAddress = MainPage_Zull1127_Mustafa.SelectedEmployeeMailAddress.getText();
        System.out.println("EmployeeExpectedMailAddress = " + EmployeeExpectedMailAddress);


        String EmployeeActualMailAddress = MainPage_Zull1127_Mustafa.ActualMailAddress.getText();
        System.out.println("EmployeeActualMailAddress = " + EmployeeActualMailAddress);
        Assert.assertEquals(EmployeeExpectedMailAddress, EmployeeActualMailAddress);
    }

        /**
         * AC2
         */

        @When("User click Link button")
        public void user_click_link_button() {
            MainPage_Zull1127_Mustafa.Link.click();
        }

        @When("User write a description into the {string} label")
        public void user_write_a_description_into_the_label(String text) {
            MainPage_Zull1127_Mustafa.LinkText.sendKeys(text);
        }

        @When("User write the link about the description into the {string} label")
        public void user_write_the_link_about_the_description_into_the_label(String link) {
            MainPage_Zull1127_Mustafa.LinkURL.sendKeys(link);
        }

        @When("User clicks Save button")
        public void user_clicks_save_button() {
            MainPage_Zull1127_Mustafa.SaveButton.click();
        }

        @Then("User sees the {string} is written as a link in the Message box")
        public void user_sees_the_is_written_as_a_link_in_the_message_box(String text) {
            BrowserUtils.sleep(3);
            Assert.assertEquals(text,MainPage_Zull1127_Mustafa.ActualText.getText());
        }

    /**
     * AC3
     */

    @When("User click Insert Video button")
    public void user_click_insert_video_button() {
        MainPage_Zull1127_Mustafa.InsertVideo.click();
    }

    @And("User enter {string} address of a YouTube video and a Vimeo video")
    public void userEnterAddressOfAYouTubeVideoAndAVimeoVideoFrom(String videoURL) {
        MainPage_Zull1127_Mustafa.VideoSourceText.sendKeys(videoURL);
        BrowserUtils.sleep(3);
    }

    @When("User clicks Save button on the opened popup")
    public void user_clicks_save_button_on_the_opened_popup() {
        MainPage_Zull1127_Mustafa.VideoSaveButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("User sees the video on Activity Stream")
    public void user_sees_the_video_on_activity_stream() {
        Driver.getDriver().switchTo().frame(MainPage_Zull1127_Mustafa.Iframe);
        Assert.assertTrue(MainPage_Zull1127_Mustafa.actualInputInMessagesBox.isDisplayed());
    }

    /**
     * AC4
     */

    @When("User click Quote Text button")
    public void user_click_quote_text_button() {
        MainPage_Zull1127_Mustafa.QuoteButton.click();
    }

    @When("User write a {string} into the highlighted row")
    public void user_write_a_into_the_highlighted_row(String quote) {

        Driver.getDriver().switchTo().frame(MainPage_Zull1127_Mustafa.Iframe);

        MainPage_Zull1127_Mustafa.QuoteTextBox.sendKeys(quote);

        Driver.getDriver().switchTo().defaultContent();


    }

    @Then("User sees the {string} in Activity Stream")
    public void user_sees_the_in_activity_stream(String quote) {

        BrowserUtils.sleep(3);
        Assert.assertEquals(quote, MainPage_Zull1127_Mustafa.actualQuote.getText());

    }




}









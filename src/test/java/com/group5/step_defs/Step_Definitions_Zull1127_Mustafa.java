package com.group5.step_defs;

import com.group5.pages.BasePage;
import com.group5.pages.LoginPageMustafa;
import com.group5.pages.MainPage_Zull1127_Mustafa;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
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

    /**
     * AC1
     */

    @When("User is on MESSAGE page")
    public void user_is_on_message_page() {
        MainPage_Zull1127_Mustafa.MessageButton.click();
    }

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

        String EmployeeExpectedMailAddress =MainPage_Zull1127_Mustafa.SelectedEmployeeMailAddress.getText();
        System.out.println("EmployeeExpectedMailAddress = "+ EmployeeExpectedMailAddress);


        String EmployeeActualMailAddress = MainPage_Zull1127_Mustafa.ActualMailAddress.getText();
        System.out.println("EmployeeActualMailAddress = " + EmployeeActualMailAddress);
        Assert.assertEquals(EmployeeExpectedMailAddress,EmployeeActualMailAddress);





    }



}

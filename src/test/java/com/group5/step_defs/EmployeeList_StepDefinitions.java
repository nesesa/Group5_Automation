package com.group5.step_defs;

import com.group5.pages.EmployeeListPage;
import com.group5.utilities.ConfigurationReader;
import com.group5.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class EmployeeList_StepDefinitions {

    EmployeeListPage employeeListPage = new EmployeeListPage();


    @Given("user is on the webpage")
    public void user_is_on_the_webpage() {
        String url = ConfigurationReader.getProperty("web.url");
        Driver.getDriver().get(url);
    }

    @When("user enters marketing username")
    public void user_enters_marketing_username() {
        employeeListPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

    }

    @When("user enters marketing password")
    public void user_enters_marketing_password() {
        employeeListPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        employeeListPage.loginButton.click();
    }


    @Given("user is logged in as Marketing employee")
    public void user_is_logged_in_as_marketing_employee() {
        System.out.println("User is logged in");

    }

    @Then("user navigates to Employees link")
    public void user_navigates_to_employees_link() {

        employeeListPage.employeeLink.click();
    }

    @Then("user clicks on the Find Employee")
    public void user_clicks_on_the_find_employee() {

        employeeListPage.findEmployee.click();
    }

    @Then("user sees Employee List")
    public void user_sees_employee_list() {

        Assert.assertTrue(employeeListPage.employeesList.isDisplayed());
    }

    @Then("user clicks on the inactive tab")
    public void user_clicks_on_the_inactive_tab() {

        employeeListPage.inactiveTab.click();

    }

    @Then("user should see Inactive employees tab")
    public void user_should_see_inactive_employees_tab() {

        Assert.assertTrue(employeeListPage.inactiveEmployeesTab.isDisplayed());

    }

    @Then("the user clicks on the Search by Alphabet tab")
    public void the_user_clicks_on_the_search_by_alphabet_tab() {

        employeeListPage.alphabetTab.click();
    }

    @Then("verify that user is able to find employees by search by Alphabet")
    public void verify_that_user_is_able_to_find_employees_by_search_by_alphabet() {

        employeeListPage.letterSearch.click();
        Assert.assertTrue(employeeListPage.letterSearchUser.isDisplayed());

    }


    @Then("the user clicks on search box on the page")
    public void the_user_clicks_on_search_box_on_the_page() {

        employeeListPage.searchBox.click();
    }

    @Then("verify that user is able to find employees by search box")
    public void verify_that_user_is_able_to_find_employees_by_search_box() {


        employeeListPage.searchBoxTab.sendKeys("Alex Deep");
        employeeListPage.searchBoxTab.sendKeys(Keys.ENTER);

        Assert.assertTrue(employeeListPage.searchBoxUser.isDisplayed());


    }





}


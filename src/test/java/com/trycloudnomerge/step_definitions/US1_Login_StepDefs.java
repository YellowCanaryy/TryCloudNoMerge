package com.trycloudnomerge.step_definitions;


import com.trycloudnomerge.pages.LoginPage;
import com.trycloudnomerge.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_Login_StepDefs {
 LoginPage loginPage = new LoginPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
    }
    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
         loginPage.userNameInput.sendKeys(username);
         loginPage.passwordInput.sendKeys(password);


    }


    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.submitButton.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));


    }



}

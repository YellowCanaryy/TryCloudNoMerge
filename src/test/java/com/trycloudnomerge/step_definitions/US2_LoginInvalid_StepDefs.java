package com.trycloudnomerge.step_definitions;


import com.trycloudnomerge.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_LoginInvalid_StepDefs {
    LoginPage loginPage = new LoginPage();
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.submitButton.click();

    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String expectedMessage) {

        String actualMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);


    }

}

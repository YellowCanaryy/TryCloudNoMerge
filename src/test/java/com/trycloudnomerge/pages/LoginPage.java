package com.trycloudnomerge.pages;

import com.trycloudnomerge.utilities.ConfigurationReader;
import com.trycloudnomerge.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        public LoginPage() {
                PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(id = "user")
        public WebElement userNameInput;

        @FindBy(id = "password")
        public WebElement passwordInput;

        @FindBy(id = "submit-form")
        public WebElement submitButton;

        @FindBy(xpath = "//p[contains(., 'Wrong username or password')]")
        public WebElement errorMessage;

        public void login(){
                Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
                userNameInput.sendKeys(ConfigurationReader.getProperty("username1"));
                passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
                submitButton.click();
        }

        public void login(String envKey){
                Driver.getDriver().get(envKey);
                userNameInput.sendKeys(ConfigurationReader.getProperty("username1"));
                passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
                submitButton.click();
        }

        public void login(String envKey,String userName, String password){
                Driver.getDriver().get(envKey);
                userNameInput.sendKeys(ConfigurationReader.getProperty(userName));
                passwordInput.sendKeys(ConfigurationReader.getProperty(password));
                submitButton.click();
        }
}

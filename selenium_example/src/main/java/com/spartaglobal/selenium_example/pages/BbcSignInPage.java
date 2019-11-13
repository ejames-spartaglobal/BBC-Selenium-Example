package com.spartaglobal.selenium_example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {

    private WebDriver driver;

    private String bbcSignInPageURL = "https://account.bbc.com/signin";
    private By userNameField = By.id("user-identifier-input");
    private By signIn = By.id("submit-button");
    public By passwordField = By.id("password-input");
    private By usernameErrorID = By.id("form-message-username");
    private By passwordErrorID = By.id("form-message-password");


    public BbcSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUsernameErrorMessageText(){
        return driver.findElement(usernameErrorID).getText();
    }

    public String getPasswordErrorMessageText(){
        return driver.findElement(passwordErrorID).getText();
    }

    public BbcSignInPage goToSignInPage(){
        driver.navigate().to(bbcSignInPageURL);
        return this;
    }

    public BbcSignInPage inputUsername(String userName){
        driver.findElement(userNameField).sendKeys(userName);
        return this;
    }

    public BbcSignInPage inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public BbcSignInPage clickSignInLink(){
        driver.findElement(signIn).click();
        return this;
    }

}

package com.spartaglobal.selenium_example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomePage {

    private WebDriver webDriver;

    String homepageURL = "https://www.bbc.co.uk";
    private By signInLinkID=By.id("idcta-link");

    public BBCHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;

    }

    public BBCHomePage goToBbcHomePage(){
        webDriver.navigate().to(homepageURL);
        return this;
    }

    public BBCHomePage clickSignInLink(){
        webDriver.findElement(signInLinkID).click();
        return this;
    }

    public void closeDriver(){
        webDriver.close();
    }
}

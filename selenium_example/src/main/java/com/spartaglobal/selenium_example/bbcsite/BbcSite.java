package com.spartaglobal.selenium_example.bbcsite;

import com.spartaglobal.selenium_example.pages.BBCHomePage;
import com.spartaglobal.selenium_example.pages.BbcSignInPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BbcSite {
    private WebDriver driver;
    private BBCHomePage bbcHomePage;
    private BbcSignInPage bbcSignInPage;

    public BbcSite(WebDriver driver) {
        this.driver = driver;
        this.bbcHomePage = new BBCHomePage(driver);
        this.bbcSignInPage = new BbcSignInPage(driver);

    }

    public BBCHomePage bbcHomePage(){
        return bbcHomePage;
    }

    public BbcSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }

}

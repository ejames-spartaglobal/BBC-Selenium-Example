package com.spartaglobal.selenium_example;

import com.spartaglobal.selenium_example.bbcsite.BbcSite;
import com.spartaglobal.selenium_example.seleniumconfig.SeleniumConfig;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSignInTest {

    private static ChromeDriver chromeDriver;
    private static BbcSite bbcSite;

    @BeforeClass
    public static void setup()
    {
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        seleniumConfig.setScreenSize(1920,1080);
        bbcSite = new BbcSite(seleniumConfig.getDriver());
    }



    @Test
    public void emptyUserNameFieldTest(){
        Assert.assertEquals("Something's missing. Please check and try again.",bbcSite.bbcSignInPage().goToSignInPage().inputUsername("").inputPassword("hippopotamus").clickSignInLink().getUsernameErrorMessageText());
    }

//    @Test
//    public void invalidUserNameFieldTest(){
//        Assert.assertEquals();
//    }

    @Test
    public void emptyPasswordFieldTest(){
        Assert.assertEquals("Something's missing. Please check and try again.",bbcSite.bbcSignInPage().goToSignInPage().inputUsername("").inputPassword("").clickSignInLink().getPasswordErrorMessageText());
    }

    @Test
    public void shortPasswordFieldTest(){
        Assert.assertEquals("Sorry, that password is too short. It needs to be eight characters or more.",bbcSite.bbcSignInPage().goToSignInPage().inputUsername("").inputPassword("wasd").clickSignInLink().getPasswordErrorMessageText());
    }

    @Test
    public void noNumPasswordFieldTest(){
        Assert.assertEquals("Sorry, that password isn't valid. Please include something that isn't a letter.", bbcSite.bbcSignInPage().goToSignInPage().inputUsername("").inputPassword("wasdwasd").clickSignInLink().getPasswordErrorMessageText());
    }

    @Test
    public void easyToGuessPasswordTest(){
        Assert.assertEquals("Sorry, that password isn't valid. Make sure it's hard to guess.", bbcSite.bbcSignInPage().goToSignInPage().inputUsername("").inputPassword("abcd1234").clickSignInLink().getPasswordErrorMessageText());
    }
}

package com.spartaglobal.selenium_example.seleniumconfig;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {

    private WebDriver driver;

    public SeleniumConfig(String browser, String driverPath) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",driverPath);

            driver=new ChromeDriver();
        }
    }

    public void setImplicitWaitTime(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void setScreenSize(int width, int height){
        driver.manage().window().setSize(new Dimension(width,height));
    }

    public WebDriver getDriver() {
        return driver;
    }
}

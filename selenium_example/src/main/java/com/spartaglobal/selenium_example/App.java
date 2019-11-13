package com.spartaglobal.selenium_example;

import com.spartaglobal.selenium_example.bbcsite.BbcSite;
import com.spartaglobal.selenium_example.pages.BBCHomePage;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        BbcSite bbcSite = new BbcSite(chromeDriver);
        bbcSite.bbcHomePage().goToBbcHomePage().clickSignInLink();
        bbcSite.bbcSignInPage().goToSignInPage().inputUsername("ngjrvmeev");
//        bbcSite.bbcHomePage().closeDriver();

//        chromeDriver.navigate().to("https://bbc.co.uk");
//        chromeDriver.findElementById("idcta-link").click();
//
//        WebElement email = chromeDriver.findElement(By.id("user-identifier-input"));
//        WebElement password=chromeDriver.findElement(By.id("password-input"));
//
//        email.sendKeys("ejames@spartaglobal.com");
//        password.sendKeys("abcdefg");
//    }
    }
}

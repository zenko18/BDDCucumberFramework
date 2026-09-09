package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverFactory {

    public WebDriver driver;
    public WebDriver launchBrowser() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By login = By.id("login-button");
    By appLogo = By.className("app_logo");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername(String username) {

        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLoginButton() {

        driver.findElement(login).click();
    }

    public void isAppLogoPresent() {
         driver.findElement(appLogo).isDisplayed();
    }

    public void userLogin(String username, String password) {
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(login).click();
    }

    public void closeBrowser() {
        driver.close();
    }


}

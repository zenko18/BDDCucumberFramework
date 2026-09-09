package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.example.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class POMLoginStepsDefinition {


    LoginPage loginPage;
    WebdriverFactory driverFactory;
    WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {

        driverFactory = new WebdriverFactory();
        driver = driverFactory.launchBrowser();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("User enters valid {string} and {string}")
    public void userValidUsernamePassword(String username, String password) {

        loginPage = new LoginPage(driver);
        loginPage.enterPassword(password);
        loginPage.enterUsername(username);
    }

    @And("Clicks on login button")
    public void loginButton() {

        loginPage.clickLoginButton();
    }

    @Then("User should navigated to home page")
    public void homePage() {
        loginPage.isAppLogoPresent();
    }

    @And("Close the browser")
    public void closeBrowser() {

        loginPage.closeBrowser();
    }
}

package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepsMoh {
    WebDriver driver;

    @Given("I am on the website {string}")
    public void iAmOnTheWebsite(String url) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("I click on tab {string} and fill with {string} and {string}")
    public void iClickOnTabAndFillWith(String tab, String email, String password) {
        driver.findElement(By.linkText(tab)).click();
        WebElement emailField = driver.findElement(By.id("Email"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    @And("I click on the Login button")
    public void iClickOnTheLoginButton() {
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
    }

    @Then("I will receive an {string}")
    public void iWillReceiveAn(String expectedErrorMessage) {
        WebElement errorElement = driver.findElement(By.cssSelector(".validation-summary-errors"));
        String actualErrorMessage = errorElement.getText().replace("\n", "");
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        driver.quit();
    }
}

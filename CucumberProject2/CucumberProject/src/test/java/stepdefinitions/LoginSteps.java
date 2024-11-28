package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import hooks.Hooks;

public class LoginSteps {
    WebDriver driver = Hooks.getDriver();

    @Given("I am on the demo website {string}")
    public void visitWebsite(String url) {

        //Webdriver aus Hooks abrufen
        WebDriver driver = Hooks.getDriver();
        driver.get(url);
        System.out.println("Website wird aufgerufen: " + url);
    }

    @When("I click on tab {string} and fill with valid credentials")
    public  void clickOnTabAndFillWithCredentials(String tab) {
        WebDriver driver = Hooks.getDriver();
        WebElement Login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        Login.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("gaslami@nelta.de");
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("123456");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();
        System.out.println("Tab wird angeklickt und Felder werden befüllt " + tab);
    }

    @Then("I will be successfully logged in and redirected to the homepage")
    public void redirectingToHomepage() {
    WebDriver driver = Hooks.getDriver();
    WebElement accountLink = driver.findElement(By.xpath("//a[@class='account']"));
    if (accountLink.isDisplayed()) {
        System.out.println("Login erfolgreich!");
    } else {
        System.out.println("Login fehlgeschlagen.");
    }
}}

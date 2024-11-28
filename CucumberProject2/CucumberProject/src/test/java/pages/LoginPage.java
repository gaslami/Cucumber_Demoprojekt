
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Elemente auf der Login-Seite
    private By emailField = By.id("Email");       // Textfeld für E-Mail
    private By passwordField = By.id("Password"); // Textfeld für Passwort
    private By loginButton = By.cssSelector("input[value='Log in']"); // Login-Button
    private By errorMessage = By.cssSelector("div.validation-summary-errors"); // Fehlernachricht

    // Konstruktor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Aktionen (Methoden)
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}

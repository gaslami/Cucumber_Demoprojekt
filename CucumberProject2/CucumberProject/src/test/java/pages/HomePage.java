
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Elemente auf der Homepage
    private By loginTab = By.linkText("Log in"); // Tab "Log in"

    // Konstruktor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Aktionen (Methoden)
    public void clickLoginTab() {
        driver.findElement(loginTab).click();
    }
}

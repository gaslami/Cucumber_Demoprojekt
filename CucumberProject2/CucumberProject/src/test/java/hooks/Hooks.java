//Hooks.java ist eine Klasse, die in Cucumber als spezielle Setup- und Teardown-Klasse
// verwendet wird. Hier definierst du Methoden, die vor (@Before) oder nach (@After) jedem
// Szenario ausgeführt werden

package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setup() {
        // Setze den Pfad zum ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        if (driver != null) { //verhindert, dass Fehler ausgelöst wird indem geprüft wird, dass driver nicht =0 ist
            driver.quit();
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}


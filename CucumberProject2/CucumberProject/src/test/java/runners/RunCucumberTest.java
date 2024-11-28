package runners;
//Die Runner-Klasse ist der Einstiegspunkt, um die Tests auszuführen und zu konfigurieren.

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Diese Anmerkung teilt JUnit mit, dass diese Klasse Cucumber-Tests ausführen soll
@RunWith(Cucumber.class)

// CucumberOptions wird verwendet, um verschiedene Optionen für Cucumber zu konfigurieren
@CucumberOptions(
        features = "src/test/resources/features", // Gibt den Pfad zu den .feature-Dateien an, die ausgeführt werden sollen.
        glue = {"stepdefinitions"}, // Pfad zu den Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Plugins für die Ausgabe der Testergebnisse -pretty sorgt für eine lesbare Ausgabe im Terminal.
)
public class RunCucumberTest {
}

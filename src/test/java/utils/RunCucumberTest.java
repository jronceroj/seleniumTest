package utils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = {"src/test/java/selenium"},
        features = "src/main/resources/cucumber/login.feature",
        tags = {"@LoginSuccesfull","@LoginNotSuccesfull"}
    )

public class RunCucumberTest {
}

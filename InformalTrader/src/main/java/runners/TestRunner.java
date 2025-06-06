package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features",
    glue = "stepdefinitions",
    plugin = {"pretty", "html:target/Informal-TraderTestReport"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

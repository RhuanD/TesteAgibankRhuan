package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@Pesquisa"
)
@RunWith(Cucumber.class)
public class TestRunner {
}

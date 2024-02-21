package runners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@Pesquisa"
)
@RunWith(Cucumber.class)
public class TestRunner {
}

package tdd;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-report.html", "json:target/cucumber-reports/cucumber-report.json"}
)
public class PalindromCheckerTest { }

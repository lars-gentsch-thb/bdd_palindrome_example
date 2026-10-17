package tdd;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

/**
 * Startet alle Feature-Dateien unter src/test/resources/tdd über die JUnit Platform.
 * Step-Definitionen (Glue) liegen im Package tdd.steps.
 */
@Suite
@IncludeEngines("cucumber")
@SelectPackages("tdd")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "tdd.steps")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
        value = "pretty, html:target/cucumber-reports/cucumber-report.html, json:target/cucumber-reports/cucumber-report.json")
public class PalindromCheckerTest {
}

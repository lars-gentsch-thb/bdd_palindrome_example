package tdd;

import static org.junit.Assert.assertTrue;
import static tdd.PalindromChecker.isPalindrome;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = "classpath:cucumber/palindrome_checker_bdd_test.feature")
public class PalindromCheckerTest {
}

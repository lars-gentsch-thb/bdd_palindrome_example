package tdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import tdd.PalindromChecker;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerStep {

    Boolean exceptionWasThrown = false;
    String textCheckForPalindrome = null;
    Boolean isPalindrome = false;

    @Given("^a text with value (.*)$")
    public void givenAText(String text) {
        textCheckForPalindrome = text;
    }

    @When("^checker called with text$")
    public void checkTextForPalindrome() {
        isPalindrome = PalindromChecker.isPalindrome(textCheckForPalindrome);
    }

    @Then("^text is a palindrome$")
    public void textIsAPalindrome() {
        assertThat(isPalindrome).isEqualTo(true);
    }

    @Then("^text is not a palindrome$")
    public void textIsNotAPalindrome() {
        assertThat(isPalindrome).isEqualTo(false);
    }
}

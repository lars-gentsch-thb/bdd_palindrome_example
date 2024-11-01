Feature: Check for palindrome

  Scenario: Given text with value ANNA is a palindrome
    Given a text with value ANNA
    When checker called with text
    Then text is a palindrome

#  Scenario: Given text KLAUS is not a palindrome

#  Scenario: Given text with >!< is not a palindrome

#  Scenario: Given text with Retsinakanister is a palindrome

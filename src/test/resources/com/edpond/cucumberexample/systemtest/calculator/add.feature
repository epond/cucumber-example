Feature: Adding

  Scenario: Add two numbers
    Given the input "2+2"
    When the calculator is run
    Then the output should be "4"

  Scenario: Add two more numbers
    Given the input "3+2"
    When the calculator is run
    Then the output should be "5"
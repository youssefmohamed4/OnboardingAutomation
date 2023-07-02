@smoke
Feature: F01_Registration | Users create new account
  #Happy Scenario
  Scenario: Successful Registration (Valid data)
    Given User navigate to registration page
    When User Enters Work Email "workemail@esm.com"
    And User Clicks Continue button
    And User Enters First name "TestFirst"
    And User Enters Last name "TestLast"
    And User Enters Company name "TestCompany"
    And User Clicks Create Account button
    Then New Account is registered

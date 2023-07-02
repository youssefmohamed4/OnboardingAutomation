Feature: F02_Verification | Users Verifies His Email and creates his account
  #Happy Scenario
  Scenario: Successful Registration (Valid data)
    Given User navigate to his email
    When User finds his verification mail
    And User Clicks Start here button
    And User Enters First name "TestFirst"
    And User Enters Last name "TestLast"
    And User Enters password "P@ssw0rd"
    And User Reenters password "P@ssw0rd"
    And User Clicks Create Account button
    And User chooses department
    And User chooses plan
    And User clicks the Start button
    Then User is directed to homepage

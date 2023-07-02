Feature: F02_Verification | Users Verifies His Email and creates his account
  #Happy Scenario
  Scenario: Successful Registration (Valid data)
    Given User logs in with Email "q@esm.com" and Password "P@ssw0rd"
    When User uploads Employees data
    And User Clicks invite employess button
    Then Employees are added to the app


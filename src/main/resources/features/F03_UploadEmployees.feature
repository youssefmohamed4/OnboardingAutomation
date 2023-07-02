@smoke
Feature: F03_EmployeesUpload | Users invites employees to the app
  #Happy Scenario
  Scenario: Successful Employees upload
    Given User logs in with Email "q@esm.com" and Password "P@ssw0rd"
    When User uploads Employees data
    And User Clicks invite employess button
    Then Employees are added to the app


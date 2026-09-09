Feature: Login Page Automation of SauceDemo
  Scenario: Check Login is successful with valid credentials
    Given User is on login page
    When User enters valid username and password
    And Clicks on login button
    Then User should navigated to home page
    And Close the browser
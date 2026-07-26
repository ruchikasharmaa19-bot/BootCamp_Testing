Feature: Checking Login & Logout Functionality

Scenario: Successful Login with Valid Credentials
  Given User should open Chrome Browser
  When User should enter URL in Browser
  And User should navigate to Home Page
  And User should enter Username and Password
  And User should click on Login button
  Then User should see the Home Page
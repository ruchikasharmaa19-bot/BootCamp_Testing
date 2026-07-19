Feature: Customer Registration and Authentication

  As a banking customer
  I want to register, log in, manage my profile, and securely access banking services
  So that I can perform online banking transactions safely.

  Background:
    Given the banking application is available
    And the customer database is connected
    And the OTP service is active
    And the authentication service is available

  @Registration
  Scenario: Successful Customer Registration
    Given the customer is on the Registration page
    When the customer enters a valid Customer ID
    And the customer enters a registered mobile number
    And the customer enters a valid PAN number
    And the customer enters the date of birth
    And the customer clicks the Register button
    Then an OTP should be sent to the registered mobile number
    And the customer enters the correct OTP
    And the customer creates a valid username
    And the customer creates a strong password
    Then the online banking account should be activated successfully

  @Login
  Scenario: Successful Customer Login
    Given the customer has an activated online banking account
    When the customer enters a valid username
    And the customer enters the correct password
    And the customer clicks the Login button
    Then the customer should be logged in successfully
    And the customer should be redirected to the Dashboard

  @ForgotPassword
  Scenario: Reset Forgotten Password
    Given the customer is on the Forgot Password page
    When the customer enters the registered username
    And the customer verifies the OTP
    And the customer creates a new password following the password policy
    Then the password should be reset successfully
    And the customer should be able to log in using the new password

  @UpdateProfile
  Scenario: Update Customer Profile
    Given the customer is logged into the banking application
    When the customer navigates to the Profile page
    And the customer updates the email address
    And the customer updates communication preferences
    And the customer clicks Save
    Then the profile information should be updated successfully

  @ChangePassword
  Scenario: Change Password
    Given the customer is logged into the banking application
    When the customer enters the current password
    And the customer enters a new password
    And the new password satisfies the bank password policy
    And the customer confirms the new password
    Then the password should be updated successfully

  @Logout
  Scenario: Successful Logout
    Given the customer is logged into the banking application
    When the customer clicks the Logout button
    Then the customer should be logged out successfully
    And the Login page should be displayed

  @EndToEnd
  Scenario: Complete Banking Customer Journey
    Given Ravi has installed the banking application
    When Ravi selects New Customer Registration
    And Ravi enters a valid Customer ID
    And Ravi enters a registered mobile number
    And Ravi enters a valid PAN number
    And Ravi enters the date of birth
    And Ravi submits the registration form
    Then an OTP should be sent to Ravi's registered mobile number
    When Ravi enters the correct OTP
    And Ravi creates a username
    And Ravi creates a strong password
    Then Ravi's online banking account should be activated
    When Ravi logs in using valid credentials
    Then Ravi should be redirected to the Dashboard
    When Ravi updates the email address
    And Ravi updates communication preferences
    Then the profile should be updated successfully
    And Ravi should be able to access Account Balance
    And Ravi should be able to access Fund Transfer
    And Ravi should be able to access Bill Payments
    And Ravi should be able to access Transaction History
    When Ravi clicks the Logout button
    Then Ravi should be logged out successfully
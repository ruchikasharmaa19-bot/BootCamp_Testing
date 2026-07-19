Feature: Digital KYC for New Customer Onboarding

  As a new customer
  I want to complete Digital KYC online
  So that I can open a bank account securely without visiting a bank branch.

  Background:
    Given the Digital KYC Application is available
    And the Customer Database is connected
    And the OTP Service is active
    And the Aadhaar Verification Service is available
    And the PAN Verification Service is available
    And the Face Verification Service is running

  @Registration
  Scenario: Register for Digital KYC
    Given the customer is on the Digital KYC Registration page
    When the customer enters a valid mobile number
    And the customer enters a valid email address
    And clicks Continue
    Then an OTP should be sent to the registered mobile number

  @OTPVerification
  Scenario: Verify mobile number using OTP
    Given the customer has received an OTP
    When the customer enters the correct OTP
    Then the mobile number should be verified successfully

  @AadhaarVerification
  Scenario: Verify Aadhaar details
    Given the customer's mobile number is verified
    When the customer enters a valid Aadhaar number
    And consents for Aadhaar verification
    Then the Aadhaar details should be verified successfully

  @PANVerification
  Scenario: Verify PAN details
    Given the Aadhaar verification is successful
    When the customer enters a valid PAN number
    Then the PAN details should be verified successfully

  @PersonalDetails
  Scenario: Enter personal information
    Given the customer has completed identity verification
    When the customer enters the following details
      | First Name | Rahul             |
      | Last Name  | Sharma            |
      | DOB        | 15-08-1995        |
      | Gender     | Male              |
      | Occupation | Software Engineer |
      | Income     | 800000            |
    And clicks Continue
    Then the personal information should be saved successfully

  @AddressVerification
  Scenario: Verify address details
    Given the customer has entered personal information
    When the customer enters the communication address
    And uploads address proof
    Then the address should be verified successfully

  @FaceVerification
  Scenario: Complete face verification
    Given the customer has completed document verification
    When the customer performs live face verification
    Then the customer's identity should be verified successfully

  @DocumentUpload
  Scenario: Upload supporting documents
    Given the customer is on the Document Upload page
    When the customer uploads
      | PAN Card            |
      | Address Proof       |
      | Passport Photograph |
    Then all documents should be uploaded successfully

  @AccountOpening
  Scenario: Open savings account
    Given all KYC verification steps are completed
    When the customer submits the application
    Then the bank account should be created successfully
    And the customer should receive the account number
    And the customer should receive the customer ID

  @DebitCard
  Scenario: Request debit card
    Given the savings account has been created
    When the customer selects Request Debit Card
    Then the debit card request should be submitted successfully

  @Notifications
  Scenario: Receive account opening confirmation
    Given the account has been opened successfully
    When the onboarding process is completed
    Then an SMS notification should be sent
    And an Email notification should be sent

  @Login
  Scenario: Login after account activation
    Given the customer account is active
    When the customer enters valid login credentials
    Then the customer should be redirected to the Dashboard

  @Logout
  Scenario: Logout successfully
    Given the customer is logged into Internet Banking
    When the customer clicks the Logout button
    Then the customer should be logged out successfully

  @EndToEnd
  Scenario: Complete Digital KYC Journey
    Given a new customer opens the Digital KYC Application
    When the customer registers using a mobile number
    And verifies the OTP
    And completes Aadhaar verification
    And completes PAN verification
    And enters personal information
    And verifies the address
    And uploads the required documents
    And completes live face verification
    And submits the KYC application
    Then the savings account should be opened successfully
    And the customer ID should be generated
    And the account number should be generated
    And the customer should receive SMS and Email confirmation
    When the customer logs into Internet Banking
    Then the customer should successfully access the banking dashboard
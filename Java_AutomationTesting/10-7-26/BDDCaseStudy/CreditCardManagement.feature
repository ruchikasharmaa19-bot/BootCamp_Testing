Feature: Credit Card Management

  As a bank customer
  I want to apply for, manage, and control my credit card digitally
  So that I have complete visibility and control over my credit card usage
  without visiting a bank branch.

  Background:
    Given the Credit Card Management System is available
    And the Customer Database is connected
    And the Authentication Service is active
    And the Credit Card Processing System is available
    And the Notification Service is running

  @ApplyCreditCard
  Scenario: Apply for a new credit card
    Given the customer is logged into Internet Banking
    When the customer navigates to Credit Card Application
    And enters valid personal and financial details
    And uploads the required documents
    And submits the application
    Then the credit card application should be submitted successfully
    And the customer should receive an application reference number

  @ApplicationStatus
  Scenario: View application status
    Given the customer has submitted a credit card application
    When the customer views the application status
    Then the current application status should be displayed

  @ActivateCard
  Scenario: Activate a new credit card
    Given the customer has received a new credit card
    When the customer enters the card details
    And verifies the OTP
    Then the credit card should be activated successfully

  @ViewCardDetails
  Scenario: View credit card details
    Given the customer is logged into the application
    When the customer opens Credit Card Dashboard
    Then the customer should view
     

  @ManageLimits
  Scenario Outline: Update transaction limits
    Given the customer is logged into Credit Card Management
    When the customer updates "<Limit Type>" to "<Amount>"
    And saves the changes
    Then the transaction limit should be updated successfully



  @CardControls
  Scenario: Enable or disable international transactions
    Given the customer is logged into the application
    When the customer disables international transactions
    Then international transactions should not be permitted

  @CardControls
  Scenario: Lock credit card temporarily
    Given the customer is logged into the application
    When the customer selects Lock Card
    Then the credit card should be locked immediately
    And all new transactions should be declined

  @CardControls
  Scenario: Unlock credit card
    Given the customer's credit card is locked
    When the customer selects Unlock Card
    Then the credit card should be activated immediately

  @ReplaceCard
  Scenario: Replace damaged or lost credit card
    Given the customer is logged into the application
    When the customer requests card replacement
    And selects the replacement reason
    Then a replacement card request should be created
    And the customer should receive confirmation

  @PINManagement
  Scenario: Change credit card PIN
    Given the customer is logged into the application
    When the customer enters the existing PIN
    And enters a new PIN
    And confirms the new PIN
    Then the PIN should be updated successfully

  @RewardPoints
  Scenario: View reward points
    Given the customer has reward points
    When the customer opens Reward Points
    Then the available reward points should be displayed

  @RewardRedemption
  Scenario: Redeem reward points
    Given the customer has sufficient reward points
    When the customer redeems reward points
    Then the redemption should be completed successfully

  @CardStatement
  Scenario Outline: Download credit card statement
    Given the customer is logged into the application
    When the customer selects "<Statement Month>"
    And clicks Download Statement
    Then the statement should be downloaded successfully

   

  @BillPayment
  Scenario Outline: Pay credit card bill
    Given the customer has an outstanding bill
    When the customer selects "<Payment Method>"
    And confirms the payment
    Then the bill payment should be successful



  @TransactionHistory
  Scenario: View credit card transaction history
    Given the customer is logged into the application
    When the customer opens Transaction History
    Then all recent credit card transactions should be displayed

  @Notifications
  Scenario: Receive spending alert
    Given the customer completes a credit card transaction
    When the transaction is processed successfully
    Then an SMS notification should be sent
    And an Email notification should be sent
    And a Push Notification should be sent

  @CloseCard
  Scenario: Request credit card closure
    Given the customer has no outstanding dues
    When the customer requests card closure
    Then the closure request should be submitted successfully

  @Logout
  Scenario: Logout successfully
    Given the customer is logged into Internet Banking
    When the customer clicks Logout
    Then the customer should be logged out successfully

  @EndToEnd
  Scenario: Complete Credit Card Management Journey
    Given a customer logs into Internet Banking
    When the customer applies for a new credit card
    And tracks the application status
    And activates the credit card
    And views the credit card details
    And updates transaction limits
    And locks the credit card temporarily
    And unlocks the credit card
    And changes the credit card PIN
    And views reward points
    And redeems reward points
    And downloads the monthly statement
    And pays the credit card bill
    And views transaction history
    And receives spending notifications
    And logs out
    Then the customer should successfully manage the credit card digitally
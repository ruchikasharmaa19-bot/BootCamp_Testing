Feature: Fund Transfer Management

  As a bank customer
  I want to transfer funds securely between my accounts and to other beneficiaries
  So that I can manage my banking transactions digitally.

  Background:
    Given the Internet Banking Application is available
    And the customer is logged into the application
    And the Core Banking System is connected
    And the Payment Gateway is available
    And the OTP Service is active

  @OwnAccountTransfer
  Scenario: Transfer funds between own accounts
    Given the customer has Savings and Current accounts
    When the customer selects Own Account Transfer
    And selects the source account
    And selects the destination account
    And enters the transfer amount
    And confirms the transaction
    Then the amount should be transferred successfully
    And both account balances should be updated

  @IntraBankTransfer
  Scenario: Transfer funds within the same bank
    Given the customer has a registered beneficiary
    When the customer selects Intra-Bank Transfer
    And selects the beneficiary
    And enters the transfer amount
    And confirms the transaction
    Then the amount should be transferred successfully
    And the beneficiary account should be credited

  @InterBankTransfer
  Scenario Outline: Transfer funds to another bank
    Given the customer has an active beneficiary
    When the customer selects "<Transfer Mode>"
    And enters the transfer amount
    And confirms the transaction
    Then the transaction should be processed successfully

    

  @Beneficiary
  Scenario: Add a new beneficiary
    Given the customer opens Beneficiary Management
    When the customer enters the beneficiary details
      | Name           | Rahul Sharma      |
      | Account Number | 123456789012      |
      | IFSC Code      | SBIN0001234       |
      | Bank Name      | State Bank        |
    And submits the request
    Then the beneficiary should be added successfully

  @Beneficiary
  Scenario: Update beneficiary details
    Given the customer has an existing beneficiary
    When the customer updates the beneficiary details
    And saves the changes
    Then the beneficiary information should be updated successfully

  @Beneficiary
  Scenario: Delete beneficiary
    Given the customer has an existing beneficiary
    When the customer deletes the beneficiary
    Then the beneficiary should be removed successfully

  @OTPVerification
  Scenario: Authenticate transaction using OTP
    Given the customer initiates a fund transfer
    When the system sends an OTP
    And the customer enters the correct OTP
    Then the transaction should be authenticated successfully

  @Receipt
  Scenario: View transaction confirmation
    Given the transaction is completed successfully
    Then the customer should see the transaction confirmation
    And the transaction reference number
    And the updated account balance

  @Receipt
  Scenario: Download transaction receipt
    Given the transaction has been completed
    When the customer clicks Download Receipt
    Then the transaction receipt should be downloaded successfully

  @TransferLimit
  Scenario Outline: Set transfer limits
    Given the customer opens Transfer Limit Settings
    When the customer sets "<Limit Type>" to "<Amount>"
    And saves the changes
    Then the transfer limit should be updated successfully



  @TransactionHistory
  Scenario: View fund transfer history
    Given the customer has completed fund transfers
    When the customer opens Transaction History
    Then all completed fund transfers should be displayed
    And each transaction should show
      | Transaction ID |
      | Date           |
      | Beneficiary    |
      | Amount         |
      | Status         |
      | Transfer Mode  |

  @EndToEnd
  Scenario: Complete Fund Transfer Journey
    Given the customer logs into Internet Banking
    When the customer adds a new beneficiary
    And the beneficiary is successfully activated
    And the customer initiates an IMPS transfer
    And enters the transfer amount
    And verifies the transaction using OTP
    Then the transfer should be completed successfully
    And the customer should receive a transaction confirmation
    And the customer should download the transaction receipt
    And the transaction should appear in the transaction history
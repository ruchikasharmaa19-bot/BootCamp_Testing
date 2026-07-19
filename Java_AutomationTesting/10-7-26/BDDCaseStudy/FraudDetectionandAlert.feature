Feature: Bank Fraud Detection and Prevention System

  As a bank
  I want to detect fraudulent transactions, notify customers,
  prevent unauthorized access, manage disputes, and configure fraud rules
  So that customer accounts remain secure and fraud losses are minimized.

  Background:
    Given the Fraud Detection Engine is running
    And the Customer Database is connected
    And the Transaction Processing System is available
    And the Notification Service is active
    And the Fraud Rules Engine is configured

  @TransactionMonitoring
  Scenario: Flag suspicious transaction based on fraud rules
    Given a customer initiates a transaction
    When the transaction amount exceeds ₹100000 from a new device
    Then the transaction should be flagged as Suspicious within 2 seconds

  @TransactionMonitoring
  Scenario: Assign risk score for unusual location
    Given a customer initiates a transaction
    When the transaction originates from an unusual location or IP address
    Then the system should calculate a geo-velocity risk score
    And assign an appropriate fraud risk score

  @TransactionMonitoring
  Scenario: Detect suspicious login pattern
    Given multiple failed login attempts have occurred
    When a successful transaction is initiated
    Then the transaction should be flagged for manual review

  @TransactionMonitoring
  Scenario: Hold high-risk transaction
    Given a transaction is flagged as Suspicious
    When the fraud risk exceeds the high-risk threshold
    Then the transaction should be held for verification

  @TransactionMonitoring
  Scenario: Fraud engine unavailable
    Given the Fraud Detection Engine is unavailable
    When a transaction is initiated
    Then the transaction should be blocked or queued securely

  @Alerts
  Scenario: Send fraud alert notification
    Given a transaction has been flagged as suspicious
    When the fraud alert is generated
    Then an SMS should be sent within 30 seconds
    And an Email notification should be sent within 30 seconds

  @Alerts
  Scenario: Display fraud alert details
    Given the customer opens the fraud notification
    Then the notification should display
      | Transaction Amount |
      | Transaction Date   |
      | Merchant           |
      | Beneficiary        |
    And the notification should display "Was this you?" options

  @Alerts
  Scenario: Send push notification
    Given push notifications are enabled
    When a suspicious transaction occurs
    Then a push notification should be sent immediately

  @Alerts
  Scenario: Failed notification delivery
    Given customer contact information is invalid
    When notification delivery fails
    Then the failure should be logged
    And the bank operations team should be notified

  @Alerts
  Scenario: Informational alert for low-risk anomaly
    Given a low-risk anomaly is detected
    When the transaction is processed
    Then an informational alert should be sent

  @Freeze
  Scenario: Auto-freeze account
    Given a transaction is classified as high-risk fraud
    When the fraud score exceeds the critical threshold
    Then the account should be frozen immediately

  @Freeze
  Scenario: Customer freezes account
    Given the customer receives a fraud alert
    When the customer selects "This wasn't me"
    Then the account should be frozen immediately
    And a fraud investigation case should be created

  @Freeze
  Scenario: Attempt transaction on frozen account
    Given the account is frozen
    When the customer initiates a transaction
    Then the transaction should be declined
    And the customer should receive a freeze notification

  @Freeze
  Scenario: Unfreeze verified account
    Given the account is frozen
    When the customer verifies their identity
    Then the account should be unfrozen within 30 minutes

  @Freeze
  Scenario: Remove false positive freeze
    Given the customer confirms the transaction is legitimate
    When fraud verification is completed
    Then the account should be unfrozen
    And the fraud detection model should record the feedback

  @Dispute
  Scenario: Report fraudulent transaction
    Given the customer views transaction history
    When the customer selects Report as Fraud
    Then the dispute form should be displayed

  @Dispute
  Scenario: Submit dispute request
    Given the customer completes the dispute form
    When supporting documents are uploaded
    And the customer submits the dispute
    Then a dispute request should be created

  @Dispute
  Scenario: Generate dispute reference number
    Given a dispute request is submitted
    Then a unique dispute reference number should be generated
    And the customer should receive the reference number

  @Dispute
  Scenario: Track dispute status
    Given the customer has submitted a dispute
    When the customer opens dispute tracking
    Then the dispute status should be displayed
      | Submitted |
      | Under Review |
      | Resolved |

  @Dispute
  Scenario: Refund approved dispute
    Given the dispute is approved
    When the investigation is completed
    Then the disputed amount should be refunded

  @Dispute
  Scenario: Reject dispute
    Given the dispute is rejected
    When the decision is finalized
    Then the rejection reason should be displayed
    And the customer should be able to escalate the dispute

  @FraudRules
  Scenario: View fraud rules
    Given the admin is logged into the Fraud Management Portal
    When the admin opens Fraud Rules Dashboard
    Then all active fraud rules should be displayed

  @FraudRules
  Scenario Outline: Update fraud rule
    Given the admin has permission to modify fraud rules
    When the admin updates "<Rule>" to "<Value>"
    And saves the changes
    Then the rule should become active within 5 minutes

   
  @FraudRules
  Scenario: Audit fraud rule changes
    Given the admin updates a fraud rule
    When the changes are saved
    Then the audit log should contain
      | Admin ID |
      | Timestamp |
      | Previous Value |
      | Updated Value |

  @FraudRules
  Scenario: Unauthorized access to fraud rules
    Given an unauthorized user attempts to access Fraud Rules
    When access is requested
    Then access should be denied
    And the unauthorized attempt should be logged

  @EndToEnd
  Scenario: Complete Fraud Detection Workflow
    Given a customer initiates a high-value transaction from a new device
    When the fraud engine detects suspicious activity
    Then the transaction should be flagged
    And a fraud alert should be sent
    When the customer selects "This wasn't me"
    Then the account should be frozen
    And a fraud case should be created
    When the customer submits a dispute
    Then a dispute reference number should be generated
    And the customer should be able to track the dispute status
    When customer identity is successfully verified
    Then the account should be unfrozen
    And the fraud investigation should be completed successfully
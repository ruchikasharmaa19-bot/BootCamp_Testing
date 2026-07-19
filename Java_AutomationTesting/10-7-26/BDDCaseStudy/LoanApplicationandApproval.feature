Feature: Digital Loan Application and Loan Management

  As a customer
  I want to apply for loans digitally, upload documents, track my application,
  and receive loan disbursement notifications
  So that I can complete the entire loan process without visiting a bank branch.

  Background:
    Given the Loan Origination System is available
    And the Customer Database is connected
    And the Credit Bureau Service is available
    And the Notification Service is active
    And the Document Verification Service is running
    And the Core Banking System is connected

  @LoanApplication
  Scenario: Apply for a loan online
    Given the customer is logged into Internet Banking
    When the customer selects a loan type
    Then eligibility criteria should be displayed
    And the interest rate range should be displayed
    And available tenure options should be displayed
    And the required documents should be displayed

  @LoanApplication
  Scenario: Pre-populate customer details
    Given the customer is an existing bank customer
    When the customer starts the loan application
    Then the customer's personal details should be pre-populated
    And the customer's KYC details should be pre-populated

  @LoanApplication
  Scenario Outline: Calculate EMI during application
    Given the customer enters "<Loan Amount>" and "<Tenure>"
    When the customer proceeds
    Then the indicative EMI should be calculated instantly



  @LoanApplication
  Scenario: Submit loan application
    Given the customer has completed the application
    When the customer submits the application
    Then a unique application reference number should be generated
    And an SMS confirmation should be sent
    And an Email confirmation should be sent

  @LoanApplication
  Scenario: Resume saved application
    Given the customer has a saved loan application
    When the customer logs in again
    Then the application should be restored without data loss

  @LoanApplication
  Scenario: Apply for secured loan
    Given the customer selects Home Loan
    When the customer proceeds
    Then property details should be requested
    And collateral information should be requested

  @DocumentUpload
  Scenario: Upload KYC and Income Documents
    Given the customer reaches the document upload page
    Then the required document checklist should be displayed

  @DocumentUpload
  Scenario: Upload valid documents
    Given the customer uploads all required documents
    When the documents are validated
    Then the documents should be accepted successfully

  @DocumentUpload
  Scenario: Reject blurry documents
    Given the customer uploads an unclear document
    When OCR validation fails
    Then the customer should be prompted to upload the document again

  @DocumentUpload
  Scenario Outline: Employment-specific document upload
    Given the applicant employment type is "<Employment Type>"
    When the applicant uploads documents
    Then the required document list should be displayed



  @DocumentUpload
  Scenario: Complete document submission
    Given all mandatory documents are uploaded
    When the customer proceeds
    Then the application status should become "Documents Submitted - Under Verification"

  @CreditCheck
  Scenario: Fetch credit score
    Given the applicant provides consent
    When the bank requests the credit score
    Then the credit score should be fetched successfully

  @CreditCheck
  Scenario: Evaluate loan eligibility
    Given the credit score has been received
    When internal risk rules are applied
    Then the eligibility decision should be generated

  @CreditCheck
  Scenario: Credit bureau unavailable
    Given the credit bureau service is unavailable
    When a credit score request is initiated
    Then the request should be retried
    And the application should be routed for manual review

  @CreditCheck
  Scenario: Low credit score
    Given the applicant has a low credit score
    When eligibility is evaluated
    Then an alternative loan option should be suggested

  @CreditCheck
  Scenario: Audit credit check
    Given the credit score is fetched
    Then the bureau name should be logged
    And the score should be logged
    And the timestamp should be logged

  @Approval
  Scenario: Review loan application
    Given the application has completed document verification
    When the loan officer opens the application
    Then applicant details should be displayed
    And uploaded documents should be displayed
    And credit score should be displayed
    And risk flags should be displayed
    And the recommended decision should be displayed

  @Approval
  Scenario: Approve loan
    Given the loan amount is within approval authority
    When the loan officer approves the application
    Then the loan should be approved successfully

  @Approval
  Scenario: Escalate high-value loan
    Given the loan exceeds approval authority
    When the application is submitted
    Then the application should be escalated automatically

  @Approval
  Scenario: Reject loan application
    Given the loan officer rejects the application
    When the rejection reason is entered
    Then the rejection reason should be logged
    And the applicant should be notified

  @Approval
  Scenario: Request additional documents
    Given additional information is required
    When the loan officer requests more documents
    Then the applicant should receive a notification
    And the application status should become "Pending Customer Response"

  @EMICalculator
  Scenario Outline: Calculate EMI
    Given the customer opens the EMI Calculator
    When the customer enters "<Loan Amount>"
    And "<Interest Rate>"
    And "<Tenure>"
    Then EMI should be calculated instantly
    And total interest should be displayed
    And total repayment amount should be displayed



  @EMICalculator
  Scenario: Apply from EMI Calculator
    Given EMI has been calculated
    When the customer clicks Apply Now
    Then the loan application should open
    And loan amount should be pre-filled
    And tenure should be pre-filled

  @Disbursement
  Scenario: Loan disbursement
    Given the loan has been approved
    And the customer has signed the agreement
    When the loan is disbursed
    Then funds should be credited successfully

  @Disbursement
  Scenario: Notify customer after disbursement
    Given loan disbursement is completed
    When the notification is generated
    Then an SMS should be sent
    And an Email should be sent
    And the loan account number should be shared

  @Disbursement
  Scenario: Share repayment schedule
    Given the loan has been disbursed
    When the notification is sent
    Then EMI details should be included
    And repayment schedule should be available

  @Disbursement
  Scenario: Partial loan disbursement
    Given the customer has a Home Loan
    When a stage-wise disbursement is completed
    Then the customer should receive a notification

  @Disbursement
  Scenario: Disbursement failure
    Given loan disbursement fails
    When invalid account details are detected
    Then the operations team should be notified
    And the customer should receive a delay notification

  @Disbursement
  Scenario: EMI reminder
    Given the first EMI due date is approaching
    When three days remain before the due date
    Then the customer should receive an EMI reminder

  @ApplicationTracking
  Scenario: Track application status
    Given the customer has submitted a loan application
    When the customer views application status
    Then the status should display
      | Submitted |
      | Under Review |
      | Approved |
      | Rejected |
      | Disbursed |

  @EndToEnd
  Scenario: Complete Digital Loan Journey
    Given a customer logs into Internet Banking
    When the customer applies for a Home Loan
    And calculates the EMI
    And uploads KYC documents
    And uploads income documents
    And submits the application
    And the system performs the credit check
    And the loan officer approves the application
    And the customer signs the loan agreement
    And the loan amount is disbursed
    Then the customer should receive disbursement confirmation
    And the repayment schedule should be available
    And the customer should receive future EMI reminders
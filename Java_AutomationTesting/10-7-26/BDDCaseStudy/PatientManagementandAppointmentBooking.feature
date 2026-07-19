Feature: Patient Management and Appointment Booking

  As a patient
  I want to register, manage my profile, search doctors, book appointments,
  access medical records, receive prescriptions, and make payments
  So that I can receive healthcare services online securely and conveniently.

  Background:
    Given the Healthcare Application is available
    And the Patient Database is connected
    And the Authentication Service is running
    And the Doctor Management System is available
    And the Appointment Management System is active

  @PatientRegistration
  Scenario: Register a new patient account
    Given the patient is on the Registration page
    When the patient enters valid personal details
    And the patient enters valid contact information
    And the patient creates a secure password
    And the patient accepts the terms and conditions
    And the patient clicks the Register button
    Then the patient account should be created successfully
    And the patient should receive a registration confirmation

  @PatientLogin
  Scenario: Login with valid credentials
    Given the patient has a registered account
    When the patient enters a valid username
    And the patient enters a valid password
    And the patient clicks the Login button
    Then the patient should be redirected to the Dashboard

  @ProfileManagement
  Scenario: Update patient profile
    Given the patient is logged into the application
    When the patient updates personal information
    And the patient updates medical information
    And the patient updates emergency contact details
    And the patient clicks Save
    Then the profile should be updated successfully

  @SearchDoctor
  Scenario Outline: Search doctor by specialization
    Given the patient is logged into the application
    When the patient searches for "<Specialization>"
    Then doctors with "<Specialization>" specialization should be displayed

   

  @BookAppointment
  Scenario: Book an appointment
    Given the patient has selected a doctor
    When the patient selects an available appointment date
    And the patient selects an available time slot
    And the patient confirms the appointment
    Then the appointment should be booked successfully
    And the appointment confirmation should be sent

  @RescheduleAppointment
  Scenario: Reschedule an appointment
    Given the patient has a booked appointment
    When the patient selects Reschedule Appointment
    And the patient chooses a new available date
    And the patient confirms the changes
    Then the appointment should be rescheduled successfully

  @CancelAppointment
  Scenario: Cancel an appointment
    Given the patient has a scheduled appointment
    When the patient selects Cancel Appointment
    And the patient confirms the cancellation
    Then the appointment should be cancelled successfully

  @OnlineConsultation
  Scenario: Attend online consultation
    Given the patient has a scheduled online appointment
    When the consultation time arrives
    And the patient joins the consultation
    Then the patient should be connected with the doctor successfully

  @MedicalRecords
  Scenario: View medical records
    Given the patient is logged into the application
    When the patient opens Medical Records
    Then previous consultation history should be displayed
    And diagnostic reports should be available

  @Prescription
  Scenario: View prescription
    Given the patient has completed a consultation
    When the patient opens the Prescription page
    Then prescribed medicines should be displayed
    And dosage instructions should be displayed

  @Notifications
  Scenario: Receive appointment notifications
    Given the patient has a booked appointment
    When the appointment date is approaching
    Then the patient should receive an appointment reminder
    And the patient should receive notification through Email or SMS

  @Payment
  Scenario Outline: Pay consultation fees
    Given the patient has a pending consultation payment
    When the patient selects "<Payment Method>"
    And the patient confirms the payment
    Then the payment should be completed successfully
    And the payment receipt should be generated



  @Logout
  Scenario: Logout successfully
    Given the patient is logged into the application
    When the patient clicks the Logout button
    Then the patient should be logged out successfully
    And the Login page should be displayed

  @EndToEnd
  Scenario: Complete Patient Healthcare Journey
    Given a new patient opens the Healthcare Application
    When the patient registers with valid details
    And the patient logs into the application
    And the patient updates the profile
    And the patient searches for a Cardiologist
    And the patient books an appointment
    And the patient attends the online consultation
    And the patient views medical records
    And the patient views prescriptions
    And the patient receives appointment notifications
    And the patient pays the consultation fee using UPI
    And the patient logs out
    Then the patient should successfully complete the digital healthcare journey
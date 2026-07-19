Feature: Healthcare Patient Management System

  As a patient
  I want to register, log in, search doctors, book appointments,
  manage my profile, access medical records, and make payments
  So that I can efficiently manage my healthcare online.

  Background:
    Given the Healthcare Application is available
    And the Patient Database is connected
    And the Authentication Service is running
    And the Doctor Management System is available

  @PatientRegistration
  Scenario: Register a new patient
    Given the patient is on the Registration page
    When the patient enters the following details
      | First Name | John                     |
      | Last Name  | Smith                    |
      | Email      | john@gmail.com           |
      | Mobile     | 9876543210              |
      | Gender     | Male                     |
      | DOB        | 15-08-1998              |
      | Password   | Welcome@123             |
    And the patient clicks the Register button
    Then the patient account should be created successfully

  @PatientLogin
  Scenario: Successful patient login
    Given the patient has a registered account
    When the patient enters a valid email
    And the patient enters a valid password
    And clicks the Login button
    Then the patient should be redirected to the Dashboard

  @SearchDoctor
  Scenario Outline: Search doctors by specialty
    Given the patient is logged into the application
    When the patient searches for "<Specialty>"
    Then doctors specializing in "<Specialty>" should be displayed


  @BookAppointment
  Scenario: Book an appointment
    Given the patient has searched for a doctor
    When the patient selects a doctor
    And selects an available appointment slot
    And confirms the appointment
    Then the appointment should be booked successfully

  @ViewAppointments
  Scenario: View upcoming appointments
    Given the patient is logged into the application
    When the patient navigates to My Appointments
    Then all upcoming appointments should be displayed

  @CancelAppointment
  Scenario: Cancel a booked appointment
    Given the patient has an existing appointment
    When the patient selects Cancel Appointment
    And confirms the cancellation
    Then the appointment should be cancelled successfully

  @MedicalRecords
  Scenario: View medical records
    Given the patient is logged into the application
    When the patient opens Medical Records
    Then previous consultation history should be displayed
    And laboratory reports should be available
    And prescriptions should be visible

  @Prescription
  Scenario: View prescription details
    Given the patient has completed a consultation
    When the patient opens Prescriptions
    Then the prescribed medicines should be displayed
    And dosage instructions should be displayed

  @LaboratoryReports
  Scenario: Download laboratory reports
    Given the patient's laboratory reports are available
    When the patient clicks Download Report
    Then the report should be downloaded successfully

  @Payment
  Scenario Outline: Make payment using different payment methods
    Given the patient has a pending consultation fee
    When the patient selects "<Payment Method>"
    And confirms the payment
    Then the payment should be completed successfully



  @UpdateProfile
  Scenario: Update patient profile
    Given the patient is logged into the application
    When the patient updates the following information
      | Mobile | 9876500000        |
      | Email  | john_new@gmail.com |
      | City   | Bangalore          |
    And clicks Save
    Then the profile should be updated successfully

  @Logout
  Scenario: Logout from the application
    Given the patient is logged into the application
    When the patient clicks the Logout button
    Then the patient should be logged out successfully
    And the Login page should be displayed

  @EndToEnd
  Scenario: Complete patient healthcare journey
    Given a new patient opens the Healthcare Application
    When the patient registers with valid details
    And logs into the application
    And searches for a Cardiologist
    And books an appointment
    And views upcoming appointments
    And accesses medical records
    And views prescriptions
    And downloads laboratory reports
    And pays the consultation fee using UPI
    And updates profile information
    And logs out
    Then the patient journey should be completed successfully
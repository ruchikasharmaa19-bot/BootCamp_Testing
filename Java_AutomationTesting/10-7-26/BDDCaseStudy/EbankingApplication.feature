Feature: Healthcare Patient Management

  As a patient
  I want to register, log in, search doctors, book appointments, access medical records,
  make payments, and manage my profile
  So that I can receive healthcare services online.

  Background:
    Given the Healthcare Application is running
    And the Patient Database is connected
    And the Doctor Management System is available
    And the Authentication Service is active

  @Registration
  Scenario: Successful Patient Registration
    Given the patient is on the Registration page
    When the patient enters the following details
      | First Name | Ruchika             |
      | Last Name  | Sharma              |
      | Gender     | Female              |
      | DOB        | 20-08-2000          |
      | Mobile     | 9876543210          |
      | Email      | ruchika@gmail.com   |
      | Password   | Welcome@123         |
    And the patient clicks the Register button
    Then the patient account should be created successfully

  @Login
  Scenario: Successful Patient Login
    Given the patient has a registered account
    When the patient enters a valid email address
    And the patient enters a valid password
    And the patient clicks the Login button
    Then the patient should be redirected to the Dashboard

  @DoctorSearch
  Scenario Outline: Search Doctor by Specialty
    Given the patient is logged into the application
    When the patient searches for "<Specialty>"
    Then doctors with "<Specialty>" specialization should be displayed

    Examples:
      | Specialty      |
      | Cardiologist   |
      | Neurologist    |
      | Dermatologist  |
      | Pediatrician   |
      | Orthopedic     |

  @BookAppointment
  Scenario: Book a Doctor Appointment
    Given the patient is logged into the application
    When the patient selects a doctor
    And the patient selects an available appointment date
    And the patient selects an available time slot
    And the patient confirms the appointment
    Then the appointment should be booked successfully

  @ViewAppointments
  Scenario: View Upcoming Appointments
    Given the patient is logged into the application
    When the patient navigates to My Appointments
    Then all upcoming appointments should be displayed

  @CancelAppointment
  Scenario: Cancel an Appointment
    Given the patient has a booked appointment
    When the patient selects Cancel Appointment
    And confirms the cancellation
    Then the appointment should be cancelled successfully

  @MedicalRecords
  Scenario: View Medical Records
    Given the patient is logged into the application
    When the patient opens Medical Records
    Then previous consultation history should be displayed
    And medical reports should be available

  @Prescription
  Scenario: View Prescription
    Given the patient has completed a consultation
    When the patient opens the Prescription page
    Then the prescribed medicines should be displayed
    And dosage instructions should be displayed

  @LaboratoryReports
  Scenario: Download Laboratory Reports
    Given the patient's laboratory reports are available
    When the patient clicks Download Report
    Then the report should be downloaded successfully

  @Payment
  Scenario Outline: Pay Consultation Fee
    Given the patient has a pending consultation payment
    When the patient selects "<Payment Method>"
    And the patient confirms the payment
    Then the payment should be completed successfully



  @UpdateProfile
  Scenario: Update Patient Profile
    Given the patient is logged into the application
    When the patient updates the following information
      | Mobile | 9876500000          |
      | Email  | ruchika@gmail.com   |
      | City   | Bangalore           |
    And the patient clicks Save
    Then the profile should be updated successfully

  @Logout
  Scenario: Logout Successfully
    Given the patient is logged into the application
    When the patient clicks the Logout button
    Then the patient should be logged out successfully
    And the Login page should be displayed

  @EndToEnd
  Scenario: Complete Healthcare Patient Journey
    Given a new patient opens the Healthcare Application
    When the patient registers with valid details
    And the patient logs into the application
    And the patient searches for a Cardiologist
    And the patient books an appointment
    And the patient views upcoming appointments
    And the patient accesses medical records
    And the patient views prescriptions
    And the patient downloads laboratory reports
    And the patient pays the consultation fee using UPI
    And the patient updates profile information
    And the patient logs out
    Then the complete patient workflow should be completed successfully
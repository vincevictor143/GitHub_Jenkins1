Feature: Login Feature
  As an authenticated
  I want to login to application
  So that I can access application feature

  Scenario: Check valid login
    Given user is on Login Page
    When user has provided valid credentials
    Then user should be able to login
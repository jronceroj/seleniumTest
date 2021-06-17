Feature: As a user I want to make login in a web

  Background:
    Given navigate to web

  @LoginSuccesfull
  Scenario: Do login in the application
    When user makes login
    Then login is succesfull

  @LoginNotSuccesfull
  Scenario: Do login in the application with incorrect data
    When user makes login
    Then login is not succesfull
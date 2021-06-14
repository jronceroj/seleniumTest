Feature: As a user I want to make login in a web

  Background:
    Given a user
    And we enter to web

  Scenario: Do login in the application
    When user makes login
    Then login is succesfull

  Scenario: Do login in the application with incorrect data
    When user makes login
    Then login is not succesfull
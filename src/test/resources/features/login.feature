Feature: Login
@wip
  Scenario: login with valid credentials
    Given user is on homepage
    When user navigates to login
    And enter valid "username" and "password"
    Then the user should be login successfully
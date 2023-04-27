Feature: Login Page

  Background:
    Given I am on the Login Page

  Scenario Outline: Input invalid email
    When I input <invalid email> invalid email
    Then I see error message Email must be a valid email address.
    Examples:
      | invalid email  |
      | test@          |
      | test@co        |
      | test@gmail     |
      | testgmail.com  |
      | @gmail.com     |
      | test@gmail,com |
      | test@gmail=com |


  Scenario Outline: Password length unacceptable
    When I input <password> invalid password
    Then I see error message <error>
    Examples:
      | password               | error                                          |
      | *                      | Password must be at least 8 characters.        |
      | ********************** | Password must be no longer than 20 characters. |



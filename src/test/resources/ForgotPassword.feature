Feature: Forgot password page

  Background:
    Given I am on Login page
    When I click on Forgot password?

  @Tests
  Scenario Outline: Forgot password tests
    When I fill the email field with <email>
    Then I see msg <Error Message>
    Examples:
      | email          | Error Message                                                    |
      | some_email     | Email must be a valid email address.                             |
      | test@yahoo.com | Error! This user doesn't exist in our DB                         |
      | test@gmail.com | Password recovery instructions have been sent to test@gmail.com. |

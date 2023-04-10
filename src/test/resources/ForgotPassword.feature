Feature: Forgot password page

  Background:
    Given I am on Login page
    When I click on Forgot password?

  @InvalidEmailFormat
  Scenario Outline: Invalid email format
    And I fill the email field
      | <email> |
    Then I see <Error Message> invalid format
    Examples:
      | email      | Error Message                        |
      | some_email | Email must be a valid email address. |

  @UserDoesNotExist
  Scenario Outline: User does not exist
    And I fill the email field
      | <email> |
    Then I see <Error Message> user does not exist
    Examples:
      | email          | Error Message                            |
      | test@yahoo.com | Error! This user doesn't exist in our DB |

  @InstructionsSent
  Scenario Outline: Instructions have been sent
    And I fill the email field
      | <email> |
    Then I see <Message> instructions sent
    Examples:
      | email          | Message                                                          |
      | test@gmail.com | Password recovery instructions have been sent to test@gmail.com. |

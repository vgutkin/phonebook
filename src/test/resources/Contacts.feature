Feature: Contacts page

  Background:
    Given I am logged in

  @ChangeLanguage
  Scenario Outline: Language changed
    When I click on <language> language
    Then I see contact list label renamed to <label>

    Examples:
      | language | label            |
      | English  | Contacts list    |
      | Russian  | Список контактов |
      | German   | Kontaktliste     |
      | Ukraine  | Список контактів |

  @AddNewContact
  Scenario: New contact being added
    When I click Add new contact
    And I fill contacts data
    And I click Save Button
    Then I see contact info panel
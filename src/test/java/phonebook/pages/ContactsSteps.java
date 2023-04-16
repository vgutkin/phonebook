package phonebook.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static phonebook.Constants.LOGIN_URL;

public class ContactsSteps extends BaseSteps {

    @When("I click on {} language")
    public void iClickOnLanguage(String language) {
        contactsPage.languageDropDownClick();
        contactsPage.languageClick(language);
    }

    @Then("I see {} contact list label renamed")
    public void iSeeContactListLabelRenamed(String language) {
        contactsPage.checkContactListLabelRenamed(language);
    }

    @When("I click Add new contact")
    public void iClickAddNewContact() {
        contactsPage.addNewContactBtnClick();
    }

    @When("I fill contacts data")
    public void iFillContactsData() {
        contactsPage.inputContactData();
    }

    @When("I click Save Button")
    public void iClickSaveButton() {
        contactsPage.saveBtnClick();
    }

    @Then("I see contact info panel")
    public void iSeeContactInfo() {
        contactsPage.iSeeContactInfoPanel();
    }
}

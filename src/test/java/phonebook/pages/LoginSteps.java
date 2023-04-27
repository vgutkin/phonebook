package phonebook.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static phonebook.Constants.*;

public class LoginSteps extends BaseSteps {

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        open(LOGIN_URL);
    }

    @Given("I am logged in")
    public ContactsPage iAmLoggedIn() {
        open(LOGIN_URL);
        loginPage.fillInField(FieldType.EMAIL, USER_EMAIL);
        loginPage.fillInField(FieldType.PASSWORD, USER_PASSWORD);
        return loginPage.loginButtonClick();
    }

    @When("I input {} invalid email")
    public void iInputInvalidEmail(String email) {
        loginPage.fillInField(FieldType.EMAIL, email);
    }

    @When("I input {} invalid password")
    public void iInputInvalidPassword(String password) {
        loginPage.fillInField(FieldType.PASSWORD, password);
    }

    @Then("I see error message {}")
    public void iSeeErrorMessage(String msg) {
        loginPage.seeErrorMessage(msg);
    }
}

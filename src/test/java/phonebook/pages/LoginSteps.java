package phonebook.pages;

import io.cucumber.docstring.DocString;
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
    public void iAmLoggedIn() {
        open(LOGIN_URL);
        loginPage.enterEmail(USER_EMAIL);
        loginPage.enterPassword(USER_PASSWORD);
        loginPage.loginButtonClick();
    }

    @When("I input {} invalid email")
    public void iInputInvalidEmailInvalidEmail(String email) {
        loginPage.enterEmail((email));
    }

    @Then("I see error message")
    public void iSeeStaticErrorMessage(DocString text) {
        String message = text.getContent();
        loginPage.seeErrorMessage(message);
    }

    @When("I input {} invalid password")
    public void iInputInvalidPassword(String password) {
        loginPage.enterPassword(password);
    }

    @Then("I see {} error message")
    public void iSeeErrorMessage(String msg) {
        loginPage.seeErrorMessage(msg);
    }
}

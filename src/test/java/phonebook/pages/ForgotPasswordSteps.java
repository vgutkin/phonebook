package phonebook.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static phonebook.Constants.LOGIN_URL;
import static phonebook.pages.BaseSteps.forgotPasswordPage;
import static phonebook.pages.BaseSteps.loginPage;

public class ForgotPasswordSteps {

    @Given("I am on Login page")
    public void iAmOnLoginPage() {
        open(LOGIN_URL);
    }

    @When("I click on Forgot password?")
    public void iClickOnForgotPassword() {
        forgotPasswordPage = loginPage.clickOnForgotPassword();
    }

    @Then("I see Forgot password page")
    public void iSeeForgotPasswordPagePage() {
        forgotPasswordPage.iSeePasswordRecoveryText();
    }

    @When("I fill the email field with {}")
    public void iFillTheEmailField(String email) {
        forgotPasswordPage.fillEmailData(email);
    }

    @Then("I see {}")
    public void iSeeMsg(String msg) {
        forgotPasswordPage.clickOnSendBtnFPP();
        forgotPasswordPage.iSeeMsg(msg);
    }
}

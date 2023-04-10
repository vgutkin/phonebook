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

    @When("I fill the email field")
    public void iFillTheEmailField(String email) {
        forgotPasswordPage.fillEmailData(email);
    }

    @When("I click on send button")
    public void iClickSendBtn() {
        forgotPasswordPage.clickOnSendBtnFPP();
    }

    @Then("I see {} invalid format")
    public void iSeeInvalidFormatError(String msg) {
        forgotPasswordPage.clickOnSendBtnFPP();
        forgotPasswordPage.iSeeInvalidFormatError(msg);
    }

    @Then("I see {} user does not exist")
    public void iSeeUserDoesNotExistError(String msg) {
        forgotPasswordPage.clickOnSendBtnFPP();
        forgotPasswordPage.iSeeUserDoesNotExistError(msg);
    }

    @Then("I see {} instructions sent")
    public void iSeeInstructionsSentMsg(String msg) {
        forgotPasswordPage.clickOnSendBtnFPP();
        forgotPasswordPage.iSeeInstructionsSentMsg(msg);
    }
}

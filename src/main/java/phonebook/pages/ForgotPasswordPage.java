package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {

    // locators
    protected static By passwordIsRequiredError = By.xpath("//*[@id='password-error-required']");
    protected static By emailFieldFPP = By.xpath("//*[@id='defaultRegisterFormEmail']");
    protected static By sendBtnFPP = By.xpath("//*[@id='forgot-pass-form']/div[2]/div[1]/button");
    protected static By passwordRecoveryTextFPP = By.xpath("/html/body/app-root/app-forgot-password/div/div[1]/div/h3");
    protected static By userDoesNotExistAlert = By.xpath("//*[@id='forgot-pass-form']/div[2]/div[2]");
    protected static By invalidEmailFormatAlert = By.xpath("//*[@id='forgot-pass-form']/div[1]/div[2]/div");
    protected static By instructionsSentMsg = By.xpath("//*[@id='success-message']/h6");

    // methods
    public void iSeePasswordRecoveryText() {
        $(passwordRecoveryTextFPP).shouldHave(Condition.exist);
    }

    public void clickOnSendBtnFPP() {
        $(sendBtnFPP).click();
    }

    public void fillEmailData(String email) {
        $(emailFieldFPP).setValue(email);
    }

    public void iSeeMsg(String msg) {
        boolean invalidEmailFormat = msg.contains("valid email");
        boolean userDoesNotExist = msg.contains("user doesn't exist");
        boolean instructionsSent = msg.contains("instructions");
        if (invalidEmailFormat) {
            alertShouldHaveText(invalidEmailFormatAlert, msg);
        } else if (userDoesNotExist) {
            alertShouldHaveText(userDoesNotExistAlert, msg);
        } else if (instructionsSent) {
            alertShouldHaveText(instructionsSentMsg, msg);
        }
    }

    private void alertShouldHaveText(By alert, String msg) {
        $(alert).shouldHave(text(msg));
    }
}

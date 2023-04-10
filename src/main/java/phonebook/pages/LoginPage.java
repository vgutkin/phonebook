package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static phonebook.Constants.USER_EMAIL;
import static phonebook.Constants.USER_PASSWORD;

/**
 * This class contains all Login page locators and methods.
 */
public class LoginPage {

    //locators
    protected static By emailField = By.xpath("//*[@id='defaultRegisterFormEmail']");
    protected static By passwordField = By.xpath("//*[@id='login-form']/div[2]/div[1]/div/input");
    protected static By invalidEmailErrorMessage = By.xpath("//*[@id='email-error-invalid']");
    protected static By emailIsRequiredErrorMessage = By.xpath("//*[@id='email-error-required']");
    protected static By forgotPasswordLP = By.xpath("/html/body/app-root/app-login/div/div[1]/div/div/a[2]");
    protected static By longPasswordErrorMessage = By.xpath("//*[@id='password-error-maxlength']");
    protected static By shortPasswordErrorMessage = By.xpath("//*[@id='password-error-minlength']");
    protected static By loginButton = By.xpath("//*[@id='login-form']/div[3]/div[1]/button");


    //methods
    public void inputInvalidEmail(String email) {
        $(emailField).setValue(email);
    }

    public void seeErrorMessage(String text) {
        By locator = null;
        switch (text) {
            case "Email must be a valid email address.":
                locator = invalidEmailErrorMessage;
                break;
            case "Email is required.":
                locator = emailIsRequiredErrorMessage;
                break;
            case "Password must be no longer than 20 characters.":
                locator = longPasswordErrorMessage;
                break;
            case "Password must be at least 8 characters.":
                locator = shortPasswordErrorMessage;
                break;
            default:
                break;
        }
        $(locator).shouldHave(Condition.text(text));
    }


    public void inputInvalidPassword(String password) {
        $(passwordField).setValue(password);
    }

    public ForgotPasswordPage clickOnForgotPassword() {
        $(forgotPasswordLP).click();
        return page(ForgotPasswordPage.class);
    }

    public void enterUserName() {
        $(emailField).setValue(USER_EMAIL);
    }

    public void enterPassword() {
        $(passwordField).setValue(USER_PASSWORD);
    }

    public ContactsPage loginButtonClick() {
        $(loginButton).click();
        return page(ContactsPage.class);
    }
}

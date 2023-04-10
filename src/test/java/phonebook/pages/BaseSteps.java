package phonebook.pages;

import phonebook.pages.ContactsPage;
import phonebook.pages.ForgotPasswordPage;
import phonebook.pages.LoginPage;

public class BaseSteps {

    //classes
    public static LoginPage loginPage = new LoginPage();
    public static ContactsPage contactsPage = new ContactsPage();
    public static ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
}

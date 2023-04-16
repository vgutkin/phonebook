package phonebook.pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains all Contacts page locators and methods.
 */
public class ContactsPage {

    static Faker faker = new Faker();

    //locators
    protected static By languageDropDown = By.xpath("//*[@id='langSelect']");
    protected static By addNewContactBtn = By.xpath("/html/body/app-root/app-home-page/app-header/nav/div/ul/li[2]/a");
    protected static By firstName = By.xpath("//*[@id='form-name']");
    protected static By lastName = By.xpath("//*[@id='form-lastName']");
    protected static By contactDescription = By.xpath("//*[@id='form-about']");
    protected static By saveBtn = By.xpath("//*[@id='add-contact-form']/div[4]/button[2]");
    protected static By contactInfoPanel = By.xpath("//*[@id='ngb-nav-2-panel']");

    //methods
    public void languageDropDownClick() {
        $(languageDropDown).click();
    }

    public void languageClick(String lang) {
        $(By.xpath("//*[contains(text(),'" + lang + "')]")).click();
    }

    public void checkContactListLabelRenamed(String text) {
        $(By.xpath("//*[contains(text(),'" + text + "')]")).shouldBe();
    }

    public void addNewContactBtnClick() {
        $(addNewContactBtn).click();
    }

    public void inputContactData() {
        $(firstName).setValue(faker.name().firstName());
        $(lastName).setValue(faker.name().lastName());
        $(contactDescription).setValue(faker.internet().emailAddress());
    }

    public void saveBtnClick() {
        $(saveBtn).click();
    }

    public void iSeeContactInfoPanel() {
        $(contactInfoPanel).shouldHave(Condition.exist);
    }
}

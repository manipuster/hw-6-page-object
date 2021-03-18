package ru.manipu.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.manipu.pageobject.base.BaseView;

public class ContactsPage extends BaseView {

    @FindBy(xpath = "//a[@title='Создать контактное лицо']")
    private WebElement buttonCreateNewContact;

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public ContactsPage clickButtonCreateNewContact(){
        buttonCreateNewContact.click();
        return this;
    }
}

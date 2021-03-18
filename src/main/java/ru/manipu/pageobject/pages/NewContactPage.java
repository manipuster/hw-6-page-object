package ru.manipu.pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.manipu.pageobject.base.BaseView;

public class NewContactPage extends BaseView {

    @FindBy(css = ".customer-content h1.user-name")
    private WebElement nameNewContact;

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public NewContactPage checkNewContactName (String newContactName){
        Assertions.assertEquals(newContactName, nameNewContact.getText());
        return this;
    }
}

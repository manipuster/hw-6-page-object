package ru.manipu.pageobject.tests;

import org.junit.jupiter.api.Test;
import ru.manipu.pageobject.base.BaseForTests;
import ru.manipu.pageobject.pages.*;

import static ru.manipu.pageobject.common.Configuration.LOGIN;
import static ru.manipu.pageobject.common.Configuration.PASSWORD;

public class CreateContactTest extends BaseForTests {

    private static final String FIRST_NAME = "Мария";
    private static final String LAST_NAME = "Антонова";
    private static final String VALUE_ORG = "123";
    private static final String NAME_JOB = "менеджер";
    private static final String PREFIX = "988";
    private static final String PHONE = "2561231";
    private static final String NEW_NAME = "Антонова Мария";


    @Test
    public void openContactsPage() throws InterruptedException {
        new LoginPage(driver)
            .authorize(LOGIN, PASSWORD );
        new NavBar(driver)
            .moveToMainMenu()
            .clickContacts();
        new ContactsPage(driver)
            .clickButtonCreateNewContact();
        new CreateContactPage(driver)
            .enterLasName(LAST_NAME)
            .enterFirsName(FIRST_NAME)
            .selectOrg(VALUE_ORG)
            .enterJobTitle(NAME_JOB)
            .addContactPhone()
            .selectContactPhoneType()
            .selectContactMobileType()
            .enterPrefixCode(PREFIX)
            .enterPhoneNumber(PHONE)
            .clickSubmitButton();
        new NewContactPage(driver)
            .checkNewContactName(NEW_NAME);
    }
}

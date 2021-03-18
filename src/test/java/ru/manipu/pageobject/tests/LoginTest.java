package ru.manipu.pageobject.tests;

import org.junit.jupiter.api.Test;
import ru.manipu.pageobject.base.BaseForTests;
import ru.manipu.pageobject.pages.LoginPage;

import static ru.manipu.pageobject.common.Configuration.LOGIN;
import static ru.manipu.pageobject.common.Configuration.PASSWORD;

public class LoginTest extends BaseForTests {

    @Test
    public void loginWithBaseTests (){
        new LoginPage(driver)
                .enterLogin(LOGIN)
                .enterPassword(PASSWORD)
                .clickButtonSubmit();
    }
}

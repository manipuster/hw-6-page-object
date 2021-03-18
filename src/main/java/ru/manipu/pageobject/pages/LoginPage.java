package ru.manipu.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.manipu.pageobject.base.BaseView;

public class LoginPage extends BaseView {

    @FindBy(xpath = "//input[@name='_username']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@name='_password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@name='_submit']")
    private WebElement clickSubmit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterLogin (String login){
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginPage enterPassword (String password){
        inputPassword.sendKeys(password);
        return this;
    }

    public ContactsPage clickButtonSubmit (){
        clickSubmit.click();
        return new ContactsPage(driver);
    }

    public ContactsPage authorize (String login, String password){
        return enterLogin(login)
            .enterPassword(password)
            .clickButtonSubmit();
    }

}

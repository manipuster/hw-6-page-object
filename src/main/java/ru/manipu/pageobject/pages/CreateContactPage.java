package ru.manipu.pageobject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.manipu.pageobject.base.BaseView;

public class CreateContactPage extends BaseView {

    @FindBy(xpath = "//input[@name='crm_contact[lastName]']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@name='crm_contact[firstName]']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//span[.='Укажите организацию']")
    private WebElement inputOrganization;

    @FindBy(xpath = "//input[@name='crm_contact[jobTitle]']")
    private WebElement inputJobTitle;

    @FindBy(xpath = "//a[.='Добавить телефон']")
    private WebElement addPhone;

    @FindBy(xpath = "//select[@name='crm_contact[phones][1][type]']")
    private WebElement selectPhoneType;

    @FindBy(xpath = "//select[@name='crm_contact[phones][1][type]']/option[@value='mobile']")
    private WebElement selectMobileType;

    @FindBy(xpath = "//input[@name='crm_contact[phones][1][prefixCode]']")
    private WebElement inputPrefixCode;

    @FindBy(xpath = "//input[@name='crm_contact[phones][1][phone]']")
    private WebElement inputPhoneNumber;

    @FindBy(xpath = "//button[@type='submit' and contains(., 'Сохранить')]")
    private WebElement submitButton;

    public CreateContactPage(WebDriver driver) {
        super(driver);
    }

    public CreateContactPage enterLasName(String lastName){
        inputLastName.sendKeys(lastName);
        return this;
    }

    public CreateContactPage enterFirsName(String firstName){
        inputFirstName.sendKeys(firstName);
        return this;
    }

    public CreateContactPage selectOrg (String value){
        Actions selectOrg = new Actions(driver);
        selectOrg
                .click(inputOrganization)
                .sendKeys(value)
                .pause(2000)
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500)
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500)
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500)
                .sendKeys(Keys.ENTER)
                .pause(2000)
                .build()
                .perform();
        return this;
    }

    public CreateContactPage enterJobTitle (String jobName){
        inputJobTitle.sendKeys(jobName);
        return this;
    }

    public CreateContactPage addContactPhone (){
        addPhone.click();
        return this;
    }

    public CreateContactPage selectContactPhoneType (){
        selectPhoneType.click();
        return this;
    }

    public CreateContactPage selectContactMobileType (){
        selectMobileType.click();
        return this;
    }

    public CreateContactPage enterPrefixCode (String prefixCode){
        inputPrefixCode.sendKeys(prefixCode);
        return this;
    }

    public CreateContactPage enterPhoneNumber (String phoneNumber){
        inputPhoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public CreateContactPage clickSubmitButton() throws InterruptedException {
        submitButton.click();
        Thread.sleep(2000);
        //wait10seconds.until(ExpectedConditions.invisibilityOf(submitButton));
        return this;
    }
}

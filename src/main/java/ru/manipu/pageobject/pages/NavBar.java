package ru.manipu.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.manipu.pageobject.base.BaseView;

public class NavBar extends BaseView {

    @FindBy(css = "#main-menu .dropdown")
    private WebElement mainMenuDropdown;

    @FindBy(xpath = "//span[.='Контактные лица']/ancestor::a[1]")
    private WebElement chooseContacts;

    public NavBar(WebDriver driver) {
        super(driver);
    }

    public NavBar moveToMainMenu (){
        mainMenuDropdown.click();
        return this;
    }

    public NavBar clickContacts (){
        chooseContacts.click();
        return this;
    }
}

package ru.manipu.pageobject.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static ru.manipu.pageobject.common.Configuration.BASE_URL;
import static ru.manipu.pageobject.common.Configuration.LOGIN_PATH;

public abstract class BaseForTests {
    protected WebDriver driver;

    @BeforeAll
    public static void setUp (){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(BASE_URL + LOGIN_PATH);
    }

    @AfterEach
    public void afterTest(){ driver.quit();}
}

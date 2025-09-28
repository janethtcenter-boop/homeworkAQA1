package lesson9;

import io.restassured.internal.assertion.Assertion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsLinkTest {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.mts.by/");
    }
    @Test
    public void checkLink() {
        WebElement detailsLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        detailsLink.click();
        wait.until(ExpectedConditions.urlContains("poryadok-oplaty-i-bezopasnost-internet-platezhe"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("Переход по ссылке не выполнен или URL не содержит 'details'", currentUrl.contains("details"));
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Заголовок страницы не содержит ожидаемый текст", pageTitle.contains("Подробнее"));
    }
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class ServicesFieldTest {
    private WebDriver driver;
    private ConfirmationDialog confirmationDialog;
    private OnlineReplenishment servicesPage;
    private OnlineReplenishment homeWiFi;
    private OnlineReplenishment installmentPlan;
    private OnlineReplenishment liability;
    private WebElement fieldPhone;
    private WebElement fieldAmount;
    private WebElement fieldEmail;
    private WebElement continueButton;
    private Assertions Assert;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        Object formPage = new FormPage(driver);
        OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);
    }
    @Test
    public void testServicesFieldText() {
        String expectedText = "Услуги связи";
        expectedText = "Телефон";
        expectedText = "Сумма";
        expectedText = "Email";
        OnlineReplenishment onlineReplenishment = null;
        String actualText = onlineReplenishment.getServicesFieldText();
        actualText = onlineReplenishment.getPhone();
        actualText = onlineReplenishment.getAmount();
        actualText = onlineReplenishment.getEmail();
        Assertions Assert = null;
        Assertions.assertEquals("Надпись в поле 'Услуги связи' не соответствует ожидаемой", expectedText, actualText);
    }
    @Test
    public void testHomeWiFi() {
        String expectedText = "Домашний интернет";
        expectedText = "Номер абонента";
        expectedText = "Сумма";
        expectedText = "Email";
        OnlineReplenishment onlineReplenishment = null;
        String actualText = onlineReplenishment.getHomeWiFiText();
        actualText = onlineReplenishment.getPhone();
        actualText = onlineReplenishment.getAmount();
        actualText = onlineReplenishment.getEmail();
    }
    @Test
    public void testInstallmentPlan() {
        String expectedText = "Рассрочка";
        expectedText = "Номер счета 44";
        expectedText = "Сумма";
        expectedText = "Email";
        OnlineReplenishment onlineReplenishment = null;
        String actualText = onlineReplenishment.getInstallmentPlan();
        actualText = onlineReplenishment.getAccountNumberStartsWith44();
        actualText = onlineReplenishment.getAmount();
        actualText = onlineReplenishment.getEmail();
    }
    @Test
    public void testLiability() {
        String expectedText = "Задолженность";
        expectedText = "Номер счета 2073";
        expectedText = "Сумма";
        expectedText = "Email";
        OnlineReplenishment onlineReplenishment = null;
        String actualText = onlineReplenishment.getLiability();
        actualText = onlineReplenishment.getAccountNumberStartsWith2073();
        actualText = onlineReplenishment.getAmount();
        actualText = onlineReplenishment.getEmail();
    }
    public void fillForm() {
        WebElement servicesButton = driver.findElement(By.id("id_кнопки_услуги"));
        WebElement fieldPhone = driver.findElement(By.id("имя_поля_телефон"));
        WebElement fieldAmount = driver.findElement(By.id("имя_поля_сумма"));
        WebElement fieldEmail = driver.findElement(By.id("имя_поля_email"));

        servicesButton.sendKeys("Услуги связи");
        fieldPhone.sendKeys("297777777");
        fieldAmount.sendKeys("30");
        fieldEmail.sendKeys("abc123!!@gmail.com");

        WebElement continueButton = driver.findElement(By.id("id_кнопки_продолжить"));
        Assert.assertTrue("Кнопка 'Продолжить' неактивна", continueButton.isEnabled());

        continueButton.click();

        Instant wait = Instant.now();
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_успешного_сообщения")));
        Assert.assertTrue("Сообщение успеха не отображается", successMessage.isDisplayed());
    }
    public void clickContinue() {
        WebElement continueButton = null;
        continueButton.click();
    }
    @Test
    public void testFormSubmission() {
        fieldPhone.sendKeys("297777777");
        fieldAmount.sendKeys("30");
        fieldEmail.sendKeys("abc123!!@gmail.com");
        continueButton.click();
        confirmationDialog = new ConfirmationDialog(driver);
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


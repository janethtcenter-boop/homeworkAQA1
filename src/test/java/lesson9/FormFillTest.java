package lesson9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormFillTest {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.mts.by/");
    }
    public void fillForm() {
        WebElement servicesButton = driver.findElement(By.id("id_кнопки_услуги"));
        WebElement fieldPhone = driver.findElement(By.id("имя_поля_телефон"));
        WebElement fieldAmount = driver.findElement(By.id("имя_поля_сумма"));
        WebElement fieldEmail = driver.findElement(By.id("имя_поля_email"));

        servicesButton.sendKeys("Услуги связи");
        fieldPhone.sendKeys("297777777");
        fieldAmount.sendKeys("null");
        fieldEmail.sendKeys("null");

        WebElement continueButton = driver.findElement(By.id("id_кнопки_продолжить"));
        Assert.assertTrue("Кнопка 'Продолжить' неактивна", continueButton.isEnabled());

        continueButton.click();

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_успешного_сообщения")));
        Assert.assertTrue("Сообщение успеха не отображается", successMessage.isDisplayed());
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

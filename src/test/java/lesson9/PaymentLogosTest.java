package lesson9;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class PaymentLogosTest {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "путь/к/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.mts.by/");
            List<String> expectedLogos = Arrays.asList("Visa", "Mastercard", "БЕЛКАРТ", "Verified by Visa");
        for (String logoName : expectedLogos) {
            List<WebElement> logos = driver.findElements(
                    By.xpath("//img[contains(translate(@alt, 'Visa', 'MasterCard', 'БЕЛКАРТ', ''Verified by Visa" + logoName.toLowerCase() + "')]"));
            Assertions.assertTrue(Boolean.parseBoolean("Логотип '" + logoName + "' найден, но не отображается"));
        }
    } finally {
            driver.quit();
        }
    }
}

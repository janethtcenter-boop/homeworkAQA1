package lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBlockTitleTest {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "путь/к/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.mts.by/");
            WebElement block = driver.findElement(By.id("myBlock"));
            String blockTitle = block.getText();
            String expectedTitle = "Онлайн пополнение без комиссии";
            if (blockTitle.equals(expectedTitle)) {
                System.out.print("Тест пройден: название блока соответствует ожиданиям.");
            } else {
                System.out.print("Тест не пройден: ожидалось '" + expectedTitle + "', но найдено '" + blockTitle + "'");
            }
        } finally {
            driver.quit();
        }
    }
}

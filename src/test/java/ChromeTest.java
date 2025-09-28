import lesson3.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    WebDriver driver;
    @BeforeAll
    static void setupAll () {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setup () {
        driver = new ChromeDriver();
    }
    @AfterEach
    void teardown () {
        driver.quit();
    }
    @Test
    void test () {
    }
}

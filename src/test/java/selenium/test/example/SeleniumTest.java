package selenium.test.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void test01()
    {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com");

    }
}

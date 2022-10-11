import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWebDriver {

    @Test
    public void runGoogle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[contains(@name, 'q')]"))
                .sendKeys("Soundcloud\n");
        driver.findElement(By.xpath("//a[contains(@href, 'soundcloud.com/ukraine')]")).click();




    }
}

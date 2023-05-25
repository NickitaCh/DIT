package Tools;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {
    protected WebDriver driver;
    public static String HOME_PAGE_URL = "http://localhost/index.html";
    public static String USERNAME = "user"; // From doc;
    public static String PASSWORD = "password"; // From doc

    public void startUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
}
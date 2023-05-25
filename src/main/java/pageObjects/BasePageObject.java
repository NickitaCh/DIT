package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePageObject {
    protected final WebDriver driver;
    protected final int timeoutDuration;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        timeoutDuration = 100;
    }

    protected void loadElement(WebElement waitElement) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutDuration)).until(ExpectedConditions.visibilityOf(waitElement));
    }

    protected void timeOut(int sec) throws InterruptedException {
        TimeUnit.SECONDS.sleep(sec);
    }
}
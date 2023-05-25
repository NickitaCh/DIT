package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject extends BasePageObject {
    private final By catalogue = By.xpath("//*[@id=\"tabCatalogue\"]/a");
    private final By login = By.xpath("//*[@id=\"login\"]/a");
    private final By loginUsername = By.xpath("//*[@id=\"username-modal\"]");
    private final By loginPassword = By.xpath("//*[@id=\"password-modal\"]");
    private final By loginButton = By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/form/p/button");

    public HomePageObject(WebDriver driver) {
        super(driver);
    }

    public WebElement getCatalogue() {
        return driver.findElement(catalogue);
    }

    public WebElement getLogin() {
        return driver.findElement(login);
    }

    public WebElement getLoginUsername() {
        return driver.findElement(loginUsername);
    }

    public WebElement getLoginPassword() {
        return driver.findElement(loginPassword);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void pressLoginButton() {
        loadElement(getLogin());
        getLogin().click();
    }

    public void login(String username, String password) throws InterruptedException {
        pressLoginButton();
        loadElement(getLoginUsername());
        getLoginUsername().sendKeys(username);
        getLoginPassword().sendKeys(password);
        getLoginButton().click();
        timeOut(3);
        getCatalogue().click();
        timeOut(1);
    }
}
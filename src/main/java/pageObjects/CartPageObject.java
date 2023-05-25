package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageObject extends BasePageObject {
    private final By firstItemNameOnCart = By.xpath("//*[text()= 'Holy']");
    private final By secondItemNameOnCart = By.xpath("//*[text()= 'Colourful']");
    private final By firstItemPriceOnCart = By.xpath("//*[text()= '$99.99']");
    private final By secondItemPriceOnCart = By.xpath("//*[text()= '$18']");

    public CartPageObject(WebDriver driver) {
        super(driver);
    }

    public WebElement getFirstItemNameOnCart() {
        return driver.findElement(firstItemNameOnCart);
    }

    public WebElement getSecondItemNameOnCart() {
        return driver.findElement(secondItemNameOnCart);
    }

    public WebElement getFirstItemPriceOnCart() {
        return driver.findElement(firstItemPriceOnCart);
    }

    public WebElement getSecondItemPriceOnCart() {
        return driver.findElement(secondItemPriceOnCart);
    }
}
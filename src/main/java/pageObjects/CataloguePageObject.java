package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CataloguePageObject extends BasePageObject {
    private final By goToCart = By.xpath("//*[@id=\"basket-overview\"]/a/i");
    private final By firstItemName = By.xpath("//*[@id=\"products\"]/div[1]/div/div[2]/h3/a");
    private final By secondItemName = By.xpath("//*[@id=\"products\"]/div[2]/div/div[2]/h3/a");
    private final By firstItemPrice = By.xpath("//*[@id=\"products\"]/div[1]/div/div[2]/p[1]");
    private final By secondItemPrice = By.xpath("//*[@id=\"products\"]/div[2]/div/div[2]/p[1]");
    private final By addToCartFirstItem = By.xpath("//*[@id=\"products\"]/div[1]/div/div[2]/p[2]/a[2]");
    private final By addToCartSecondItem = By.xpath("//*[@id=\"products\"]/div[2]/div/div[2]/p[2]/a[2]");
    String firstname;
    String secondName;
    String firstPrice;
    String secondPrice;


    public CataloguePageObject(WebDriver driver) {
        super(driver);
    }

    public WebElement getCart() {
        return driver.findElement(goToCart);
    }

    public WebElement getFirstItemName() {
        return driver.findElement(firstItemName);
    }

    public WebElement getSecondItemName() {
        return driver.findElement(secondItemName);
    }

    public WebElement getFirstItemPrice() {
        return driver.findElement(firstItemPrice);
    }

    public WebElement getSecondItemPrice() {
        return driver.findElement(secondItemPrice);
    }

    public WebElement getFirstItem() {
        return driver.findElement(addToCartFirstItem);
    }

    public WebElement getSecondItem() {
        return driver.findElement(addToCartSecondItem);
    }

    public void pressCartButton() {
        loadElement(getCart());
        getCart().click();
    }

    public void pressFirstItemButton() {
        loadElement(getFirstItem());
        getFirstItem().click();
    }

    public void pressSecondItemButton() {
        loadElement(getSecondItem());
        getSecondItem().click();
    }

    public String getFirstName() {
        return firstname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstPrice() {
        return firstPrice;
    }

    public String getSecondPrice() {
        return secondPrice;
    }

    public void addToCart() throws InterruptedException {
        firstname = getFirstItemName().getText();
        firstPrice = getFirstItemPrice().getText();
        secondName = getSecondItemName().getText();
        secondPrice = getSecondItemPrice().getText();
        pressFirstItemButton();
        timeOut(1);
        pressSecondItemButton();
        timeOut(1);
        pressCartButton();
        timeOut(2);
    }
}
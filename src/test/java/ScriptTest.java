import Tools.Utils;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pageObjects.BasePageObject;
import pageObjects.CartPageObject;
import pageObjects.CataloguePageObject;
import pageObjects.HomePageObject;

import static org.junit.Assert.assertEquals;

public class ScriptTest extends Utils {
    BasePageObject base;
    HomePageObject home;
    CataloguePageObject catalogue;
    CartPageObject cart;

/*
    String username;
    String password;
    String id;
*/

    @Before
    public void setUp() {

/*
        Register user by API
        id = apiClasses.UserUtils.createUser(apiClasses.User.user()).extract().path("id");
        username = apiClasses.User.user().getUsername();
        password = apiClasses.User.user().getPassword();
*/

        startUp();
        driver.get(HOME_PAGE_URL);
        home = new HomePageObject(driver);
        catalogue = new CataloguePageObject(driver);
        cart = new CartPageObject(driver);
        base = new BasePageObject(driver);
    }

    @Test
    @DisplayName("Check e2e user script")
    public void scriptTest() throws InterruptedException {
        home.login(USERNAME, PASSWORD);
        catalogue.addToCart();
        assertEquals(catalogue.getFirstName(), cart.getFirstItemNameOnCart().getText());
        assertEquals(catalogue.getFirstPrice(), cart.getFirstItemPriceOnCart().getText());
        assertEquals(catalogue.getSecondName(), cart.getSecondItemNameOnCart().getText());
        assertEquals(catalogue.getSecondPrice(), cart.getSecondItemPriceOnCart().getText());
        driver.quit();
    }

/*
    Delete user by API
    @After
    public void cleanUp() {
        apiClasses.UserUtils.deleteUser(id);
        driver.quit();
    }
*/
}
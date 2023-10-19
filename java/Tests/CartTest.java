package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Helpers.Data.validPassword;
import static Helpers.Data.validUsername;

public class CartTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        cartPage = new CartPage();
        logIn(validUsername, validPassword);
    }

    @Test
    public void addItemToCart() {
        Assert.assertFalse(elementIsDisplayed(homePage.CartBadge));
        addAnyItemToCart();
        Assert.assertEquals(homePage.getBadgeNumber(), "1");
        homePage.clickOnCartButton();
        Assert.assertTrue(cartPage.ItemInCart.isDisplayed());
    }

}

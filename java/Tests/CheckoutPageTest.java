package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Helpers.Data.validPassword;
import static Helpers.Data.validUsername;
import static Helpers.URLs.CartURL;

public class CheckoutPageTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        logIn(validUsername, validPassword);
    }

    @Test
    public void userCancelsTheOrderOnCheckoutPage() {
        addAnyItemToCart();
        homePage.clickOnCartButton();
        cartPage.clickOnCheckoutButton();
        checkoutPage.clickOnCancelButton();
        Assert.assertEquals(driver.getCurrentUrl(), CartURL);
    }

}

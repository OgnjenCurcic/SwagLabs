package Tests;

import Base.BaseTest;
import Pages.*;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        paymentPage = new PaymentPage();
        thankYouPage = new ThankYouPage();
    }

    @Test(priority = 10)
    public void itemCanBeBought() {
        addAnyItemToCart();
        homePage.clickOnCartButton();
        cartPage.clickOnCheckoutButton();
        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.inputPostalCode();
        checkoutPage.clickOnContinueButton();
        paymentPage.clickOnFinishButton();
        Assert.assertTrue(thankYouPage.ThankYouMessage.isDisplayed());
    }

}

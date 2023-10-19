package Tests;

import Base.BaseTest;
import Helpers.Data;
import Pages.SidebarPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Helpers.Data.*;
import static Helpers.URLs.HomePageURL;
import static Helpers.URLs.LoginPageURL;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        data = new Data();
    }

    @Test (priority = 10)
    public void userCanLogIn() {
        logIn(validUsername, validPassword);
        Assert.assertEquals(driver.getCurrentUrl(), LoginPageURL);
        Assert.assertTrue(homePage.CartButton.isDisplayed());
        Assert.assertTrue(homePage.SortButton.isDisplayed());
    }

    @Test (priority = 20)
    public void userCanLogOut() throws InterruptedException {
        logIn(validUsername, validPassword);
        Assert.assertEquals(driver.getCurrentUrl(), HomePageURL);
        homePage.clickOnBurgerButton();
        sidebarPage.clickOnLogOutButton();
        Assert.assertFalse(elementIsDisplayed(homePage.CartButton));
        Assert.assertEquals(driver.getCurrentUrl(), LoginPageURL);
        Assert.assertTrue(loginPage.LoginButton.isDisplayed());
    }

    @Test (priority = 30)
    public void userCannotLogInWithInvalidUsername() {
        logIn("username", validPassword);
        Assert.assertNotEquals(driver.getCurrentUrl(), LoginPageURL);
        Assert.assertFalse(elementIsDisplayed(homePage.CartButton));
        Assert.assertFalse(elementIsDisplayed(homePage.SortButton));
        Assert.assertTrue(elementIsDisplayed(loginPage.LoginErrorMessage));
    }

    @Test (priority = 40)
    public void userCannotLoginWithInvalidPassword() {
        logIn(validUsername, "password");
        Assert.assertNotEquals(driver.getCurrentUrl(), LoginPageURL);
        Assert.assertFalse(elementIsDisplayed(homePage.CartButton));
        Assert.assertFalse(elementIsDisplayed(homePage.SortButton));
        Assert.assertTrue(elementIsDisplayed(loginPage.LoginErrorMessage));
    }

    @Test (priority = 50)
    public void userCannotLoginWithInvalidUsernameAndPassword() {
        logIn("username", "password");
        Assert.assertNotEquals(driver.getCurrentUrl(), LoginPageURL);
        Assert.assertFalse(elementIsDisplayed(homePage.CartButton));
        Assert.assertFalse(elementIsDisplayed(homePage.SortButton));
        Assert.assertTrue(elementIsDisplayed(loginPage.LoginErrorMessage));
    }


}

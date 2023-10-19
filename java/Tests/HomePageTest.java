package Tests;

import Base.BaseTest;
import Helpers.Data;
import Pages.HomePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static Helpers.Data.validPassword;
import static Helpers.Data.validUsername;

public class HomePageTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        data = new Data();

        logIn(validUsername, validPassword);
    }

    @Test
    public void sortPriceLowToHigh() throws Exception {
        Assert.assertTrue(homePage.numbersAreSortedHighToLow("lowhigh", homePage.getPrices()));
    }

    @Test
    public void sortPriceHighToLow() throws Exception {
        Assert.assertTrue(homePage.numbersAreSortedHighToLow("highlow", homePage.getPrices()));
    }

    @Test
    public void sortNameAtoZ() {
        ArrayList<String> itemNames = homePage.getAllItemNames();
        ArrayList<String> sortedNames = homePage.getSortedList(itemNames);

        Assert.assertEquals(sortedNames, itemNames);
    }

    @Test
    public void sortNameZtoA() {
        ArrayList<String> itemNames = homePage.getAllItemNames();
        ArrayList<String> sortedNames = homePage.getReversedList(itemNames);

        Assert.assertEquals(sortedNames, itemNames);
    }


}

package Base;

import Helpers.Data;
import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.time.Duration;

import static Helpers.Data.*;
import static Helpers.URLs.HomePageURL;


public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public static ExcelReader excelReader;
    public LoginPage loginPage;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public Data data;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public PaymentPage paymentPage;
    public ThankYouPage thankYouPage;

    @BeforeClass
    public void setUp() throws IOException {
        excelReader = new ExcelReader("src/test/java/TestData.xlsx");
    }

    @BeforeMethod
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        driver.navigate().to(HomePageURL);
        loginPage = new LoginPage();
    }

    public void logIn(String username, String password) {
        loginPage.insertUsername(username);
        loginPage.insertPassword(password);
        loginPage.clickOnLoginButton();
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public boolean elementIsDisplayed(WebElement element) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        boolean isDisplayed = true;
        try {
            isDisplayed = element.isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
        return isDisplayed;
    }

    public void addAnyItemToCart() {
        for (int i = 0; i < homePage.getAllItemNames().size(); i++) {
            String changedName = getRandomItem().toLowerCase().replaceAll(" ", "-");
            String locator = "add-to-cart-" + changedName;
            boolean found = false;

            try {
                found = driver.findElement(By.id(locator)).isDisplayed();
                driver.findElement(By.id(locator)).click();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            if (found) {
                break;
            }
        }
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }

}

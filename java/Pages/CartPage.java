package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseTest {

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    WebElement CheckoutButton;

    @FindBy(id = "continue-shopping")
    WebElement ContinueShoppingButton;

    @FindBy(className = "cart_item")
    public WebElement ItemInCart;

    //----------------------------------

    public void clickOnCheckoutButton() {
        CheckoutButton.click();
    }

    public void clickOnCountinueShoppingButton() {
        ContinueShoppingButton.click();
    }

}

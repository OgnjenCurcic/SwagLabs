package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends BaseTest {

    public ThankYouPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "complete-header")
    public
    WebElement ThankYouMessage;

    @FindBy(className = "back-to-products")
    WebElement BackHomeButton;

    //-------------------------------------

    public void clickOnBackHomeButton() {
        BackHomeButton.click();
    }

}

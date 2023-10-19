package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseTest {

    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "finish")
    WebElement FinishButton;

    @FindBy(id = "cancel")
    WebElement CancelButton;

    //-------------------------

    public void clickOnFinishButton() {
        FinishButton.click();
    }

    public void clickOnCancelButton() {
        CancelButton.click();
    }

}

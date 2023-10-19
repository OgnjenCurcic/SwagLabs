package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BaseTest {

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement FirstNameField;

    @FindBy(id = "last-name")
    WebElement LastNameField;

    @FindBy(id = "postal-code")
    WebElement PostalCodeField;

    @FindBy(id = "continue")
    WebElement ContinueButton;

    @FindBy(id = "cancel")
    WebElement CancelButton;

    //--------------------------------

    public void inputFirstName() {
        FirstNameField.sendKeys("ognjen");
    }

    public void inputLastName() {
        LastNameField.sendKeys("curcic");
    }

    public void inputPostalCode() {
        PostalCodeField.sendKeys("11000");
    }

    public void clickOnContinueButton() {
       ContinueButton.click();
    }

    public void clickOnCancelButton() {
        CancelButton.click();
    }

}

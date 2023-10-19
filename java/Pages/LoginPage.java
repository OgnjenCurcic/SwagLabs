package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "user-name")
    WebElement UsernameField;

    public @FindBy(id = "password")
    WebElement PasswordField;

    public @FindBy(css = ".submit-button.btn_action")
    WebElement LoginButton;

    public @FindBy(css = ".error-message-container.error")
    WebElement LoginErrorMessage;

    //-------------------------------------------------

    public void insertUsername(String username) {
        UsernameField.clear();
        UsernameField.sendKeys(username);
    }

    public void insertPassword(String password) {
        PasswordField.clear();
        PasswordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        LoginButton.click();
    }

}

package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "inventory_sidebar_link")
    WebElement AllItemsButton;

    @FindBy(id = "about_sidebar_link")
    WebElement AboutButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement LogOutButton;

    @FindBy(id = "reset_sidebar_link")
    WebElement ResetAppStateButton;

    //-----------------------------------

    public void clickOnAllItemsButton() {
        AllItemsButton.click();
    }

    public void clickOnAboutButton() {
        AboutButton.click();
    }

    public void clickOnLogOutButton() {
        LogOutButton.click();
    }

    public void clickOnResetAppStateButton() {
        ResetAppStateButton.click();
    }

}

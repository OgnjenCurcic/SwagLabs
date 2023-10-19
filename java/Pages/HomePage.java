package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;

public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "inventory_item_name")
    ArrayList<WebElement> ItemNames;

    @FindBy(className = "inventory_item_price")
    ArrayList<WebElement> ItemPrice;

    @FindBy(id = "react-burger-menu-btn")
    WebElement BurgerButton;

    @FindBy(className = "product_sort_container")
    public WebElement SortButton;

    @FindBy(className = "shopping_cart_link")
    public WebElement CartButton;

    @FindBy(className = "shopping_cart_badge")
    public WebElement CartBadge;

    //----------------------------------------

    public void clickOnBurgerButton() {
        BurgerButton.click();
    }

    public void clickOnCartButton() {
        CartButton.click();
    }

    public String getBadgeNumber() {
        return CartBadge.getText();
    }


    public ArrayList<String> getAllItemNames() {
        ArrayList<String> elements = new ArrayList<>();
        for (WebElement webElement : ItemNames) {
            elements.add(webElement.getText());
        }
        return elements;
    }

    public ArrayList<Double> getPrices() {
        ArrayList<Double> priceList = new ArrayList<>();
        for (int i = 0; i < ItemPrice.size(); i++) {

        }
        return priceList;
    }

    public ArrayList<String> getReversedList(ArrayList list) {
        list.sort(Collections.reverseOrder());
        return list;
    }

    public ArrayList<String> getSortedList(ArrayList list) {
        Collections.sort(list);
        return list;
    }

    public boolean numbersAreSortedHighToLow(String sort, ArrayList<Double> list) throws Exception {
        if (sort.equals("lowhigh")) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }
            return true;
        } else if (sort.equals("highlow")) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    return false;
                }
            }
            return true;
        } else {
            throw new Exception("Wrong sort input!");
        }

    }


}

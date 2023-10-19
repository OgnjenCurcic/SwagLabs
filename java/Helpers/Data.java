package Helpers;
import Base.BaseTest;

import java.util.ArrayList;
import java.util.Random;

public class Data extends BaseTest {

    public static final String validUsername = excelReader.getStringData("Login", 1 , 0);
    public static final String validPassword = excelReader.getStringData("Login", 1 , 1);

    public static ArrayList<String> listOfItems() {
        ArrayList<String> items = new ArrayList<>();
        items.add("Sauce Labs Backpack");
        items.add("Sauce Labs Bike Light");
        items.add("Sauce Labs Bolt T-Shirt");
        items.add("Sauce Labs Fleece Jacket");
        items.add("Sauce Labs Onesie");
        items.add("Test.allTheThings() T-Shirt (Red)");
        return items;
    }

    public static String getRandomItem() {
        return listOfItems().get(new Random().nextInt());
    }


}

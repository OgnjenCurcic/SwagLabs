package Helpers;

import static Base.BaseTest.excelReader;

public class URLs {

    public static final String LoginPageURL = excelReader.getStringData("URL", 1, 0);
    public static final String HomePageURL = excelReader.getStringData("URL", 1, 1);
    public static final String CartURL = excelReader.getStringData("URL", 1, 2);
    public static final String AboutPageURL = excelReader.getStringData("URL", 1, 3);
    public static final String CheckoutURL = excelReader.getStringData("URL", 1, 4);
    public static final String PaymentPageURL = excelReader.getStringData("URL", 1, 5);
    public static final String ThankYouPageURL = excelReader.getStringData("URL", 1, 6);


}

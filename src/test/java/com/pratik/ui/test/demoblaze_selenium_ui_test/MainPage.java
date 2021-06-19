package com.pratik.ui.test.demoblaze_selenium_ui_test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public SelenideElement laptopsLink = $x("//a[contains(text(),'Laptops')]");
    public SelenideElement sonyLink = $x("//a[contains(text(),'Sony vaio i5')]");
    public SelenideElement addToCartButton =$x("//a[contains(text(),'Add to cart')]");
    public SelenideElement dellLink = $x("//a[contains(text(),'Dell i7 8gb')]");
    public SelenideElement cartLink = $x("//a[@id='cartur']");
    public SelenideElement placeOrder = $x("//button[contains(text(),'Place Order')]");
    public SelenideElement formNameInput = $x("//input[@id='name']");
    public SelenideElement formCountryInput = $x("//input[@id='country']");
    public SelenideElement formCityInput = $x("//input[@id='city']");
    public SelenideElement formCardInput = $x("//input[@id='card']");
    public SelenideElement formMonthInput = $x("//input[@id='month']");
    public SelenideElement formYearInput = $x("//input[@id='year']");
    public SelenideElement purchaseButton = $x("//button[contains(text(),'Purchase')]");
    public SelenideElement purchaseTotal = $x("//label[@id='totalm']");
    public SelenideElement confirmationBoxText = $(".sweet-alert > p");
    public SelenideElement confirmationBoxOkBtn = $x("//button[contains(text(),'OK')]");
    public ElementsCollection tableRow =  $$("#tbodyid > tr");

    public final String URL= "https://demoblaze.com/";
    public final long WAIT_TIME = 3000;

}

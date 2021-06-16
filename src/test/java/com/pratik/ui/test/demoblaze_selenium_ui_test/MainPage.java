package com.pratik.ui.test.demoblaze_selenium_ui_test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement laptopsLink = $x("//a[contains(text(),'Laptops')]");
    public SelenideElement sonyLink = $x("//a[contains(text(),'Sony vaio i5')]");
    public SelenideElement addToCartButton =$x("//a[contains(text(),'Add to cart')]");
    public SelenideElement dellLink = $x("//a[contains(text(),'Dell i7 8gb')]");
    public SelenideElement cartLink = $x("//a[@id='cartur']");
    public final String URL= "https://demoblaze.com/";
    public final long WAIT_TIME = 3000;

}

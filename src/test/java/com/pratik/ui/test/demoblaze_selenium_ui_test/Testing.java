package com.pratik.ui.test.demoblaze_selenium_ui_test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.Selenide.*;

public class Testing {


    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void test(){
        MainPage page = new MainPage();
        open(page.URL);
        page.laptopsLink.click();
        page.sonyLink.click();
        page.addToCartButton.click();
        sleep(page.WAIT_TIME);
        getWebDriver().switchTo().alert().accept();


        open(page.URL);
        page.laptopsLink.click();
        page.dellLink.click();
        page.addToCartButton.click();
        sleep(page.WAIT_TIME);
        getWebDriver().switchTo().alert().accept();

        page.cartLink.click();
        sleep(page.WAIT_TIME);
        SelenideElement deleteRow = $$("#tbodyid > tr").find(Condition.text("Dell i7 8gb"));
        deleteRow.findElement(By.linkText("Delete")).click();
        sleep(page.WAIT_TIME);
    }
}

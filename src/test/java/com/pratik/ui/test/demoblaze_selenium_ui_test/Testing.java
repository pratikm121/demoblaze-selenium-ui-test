package com.pratik.ui.test.demoblaze_selenium_ui_test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.Selenide.*;

public class Testing {

    MainPage page = new MainPage();
    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Order(1)
    @Test()
    void whenItemIsSelected_ThenItShouldShowInCart(){
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
        $$("#tbodyid > tr").shouldHave(CollectionCondition.size(2));
        SelenideElement deleteRow = page.tableRow.find(Condition.text("Dell i7 8gb"));
        deleteRow.findElement(By.linkText("Delete")).click();
        sleep(page.WAIT_TIME);
        $$("#tbodyid > tr").shouldHave(CollectionCondition.size(1));
        SelenideElement selectedRow = page.tableRow.find(Condition.text("Sony vaio i5"));
        selectedRow.shouldBe(Condition.exist);

    }

    @Order(2)
    @Test()
    void whenItemIsProcessed_ThenItShouldBePurchased(){
        page.placeOrder.click();
        page.purchaseTotal.shouldHave(Condition.text("790"));
        page.formNameInput.setValue("Pratik");
        page.formCountryInput.setValue("India");
        page.formCityInput.setValue("Kolkata");
        page.formCardInput.setValue("21323 454356 456456");
        page.formMonthInput.setValue("05");
        page.formYearInput.setValue("2021");
        page.purchaseButton.click();

        sleep(2000);

        page.confirmationBoxText.shouldHave(Condition.matchText("Amount: 790 USD"))
                .shouldHave(Condition.matchText("Card Number: 21323 454356 456456"))
                .shouldHave(Condition.matchText("Name: Pratik"));

        page.confirmationBoxOkBtn.click();


    }
}

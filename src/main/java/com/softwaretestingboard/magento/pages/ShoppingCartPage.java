package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    // Verify the text ‘Shopping Cart.'
    By verifyText = By.xpath("//span[@class='base']");

    // Verify the product name ‘Cronus Yoga Pant’
    By verifyName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    // Verify the product size ‘32’
    By verifySize = By.xpath("//dd[contains(text(),'32')]");

    // Verify the product colour ‘Black’
    By verifyColour = By.xpath("//dd[contains(text(),'Black')]");

    //Verify the product name ‘Overnight Duffle’
    By verifyBagName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    //Verify the Qty is ‘3’
    By verifyQty = By.xpath("//input[@title='Qty']");


    //Verify the product price ‘$135.00’
    By verifyThePrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    //Change Qty to ‘5’
    By changeQty = By.xpath("//input[@title='Qty']");
    // Click on ‘Update Shopping Cart’ button
    By clickUpdate = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    // Verify the product price ‘$225.00’
    By verifyLastPrice = By.xpath("(//span[@class='cart-price']//span)[2]");

    // Verify the text ‘Shopping Cart.'
    public String verifyTextMessage() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyText);
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public String verifyProductName() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyName);
    }

    // Verify the product size ‘32’
    public String verifyProductSize() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifySize);
    }

    // Verify the product colour ‘Black’
    public String verifyProductColour() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyColour);
    }

    //Verify the product name ‘Overnight Duffle’
    public String verifyTheBagName() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyBagName);
    }

    //Verify the Qty is ‘3’
    public String verifyTheQuantityNumber() throws InterruptedException {
        Thread.sleep(3000);
        return getAttributeValueFromElement(verifyQty);
    }

    //Verify the product price ‘$135.00’
    public String verifyTheProductPriceInCart() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyThePrice);
    }

    // Change Qty to '5'
    public void changeQuantity5() throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(changeQty, "5");
    }

    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(clickUpdate);
    }

    // Verify the product price ‘$225.00’
    public String verifyTheUpdateCartPrice() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyLastPrice);

    }


}

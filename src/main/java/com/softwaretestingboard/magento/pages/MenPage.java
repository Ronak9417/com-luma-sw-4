package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By hooverPantSize = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By pantSize = By.xpath("//div[@id='option-label-size-143-item-175']");

    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By hooverPantColour = By.xpath("(//div[@class='swatch-option color'])[1]");
    By pantColour = By.xpath("//div[@id='option-label-color-93-item-49']");

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    By mouseHooverToBoth = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addToCart = By.xpath("//span[normalize-space()='Add to Cart']");

    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    By verifyShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    // Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void clickOnPantSize() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(hooverPantSize);
        mouseHoverToElementAndClick(pantSize);
    }

    public void clickOnPantColour() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(hooverPantColour);
        mouseHoverToElementAndClick(pantColour);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(mouseHooverToBoth);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyShoppingCart);
    }
    public void shoppingCartLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(shoppingCart);
    }

}



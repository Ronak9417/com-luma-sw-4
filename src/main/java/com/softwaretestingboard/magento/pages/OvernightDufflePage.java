package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {


    By verifyName = By.xpath("//span[@class='base']");
    //Change Qty 3
    By changeNumber = By.xpath("//input[@id='qty']");

    //Click on ‘Add to Cart’ Button.
    By clickOnButton = By.xpath("//button[@id='product-addtocart-button']");
    //Verify the text‘You added Overnight Duffle to your shopping cart.’
    By verifyTextOnPage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    // Click on ‘shopping cart’ Link into message
    By cartLink = By.xpath("//a[normalize-space()='shopping cart']");


    // Verify the text ‘Overnight Duffle’
    public String verifyProduceName() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyName);
    }

    //Change Qty 3
    public void changeQuantity(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(changeNumber, quantity);
    }

    //Click on ‘Add to Cart’ Button.
    public void clickOnAddCartButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(clickOnButton);
    }

    //Verify the text‘You added Overnight Duffle to your shopping cart.’
    public String verifyTheBagShoppingCartText() throws InterruptedException {
        Thread.sleep(200);
        return getTextFromElement(verifyTextOnPage);
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnBagShoppingCartLink() {
        clickOnElement(cartLink);
    }

}

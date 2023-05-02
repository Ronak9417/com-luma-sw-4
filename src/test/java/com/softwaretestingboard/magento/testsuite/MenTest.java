package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Men Menu
        homePage.mouseHooverToMenMenu();
        // Mouse Hover on Bottoms
        homePage.mouseHooverToBottomsMenu();
        // Click on Pants
        homePage.clickOnPants();
        // Mouse Hoover to click on product size and click
        menPage.clickOnPantSize();
        // Mouse Hoover to select the colour and click
        menPage.clickOnPantColour();
        //Mouse Hoover to add to cart and click
        menPage.clickOnAddToCart();
        Assert.assertEquals(menPage.verifyAddedItemToTheShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.");
        // Click on ‘shopping cart’ Link into message
        menPage.shoppingCartLink();
        // Verify the text ‘Shopping Cart.','Cronus Yoga Pant','32','Black'
        Assert.assertEquals(shoppingCartPage.verifyTextMessage(),"Shopping Cart");
        Assert.assertEquals(shoppingCartPage.verifyProductName(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.verifyProductSize(),"32");
        Assert.assertEquals(shoppingCartPage.verifyProductColour(),"Black");

    }

}

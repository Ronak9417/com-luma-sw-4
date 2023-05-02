package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearBagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearBagsPage gearBagsPage = new GearBagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test

    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Hoover on gear menu
        homePage.mouseHooverToGearMenu();
        // Hoover on gear menu and click on bags
        homePage.clickOnBags();
        // Click on overnight Duffle Bag
        gearBagsPage.clickOnProductNameOvernightDuffle();
        // Verify the text name of overnight Duffle
        Assert.assertEquals(overnightDufflePage.verifyProduceName(), "Overnight Duffle");
        //Change Qty 3
        overnightDufflePage.changeQuantity("3");
        // Click on ‘Add to Cart’ Button.
        overnightDufflePage.clickOnAddCartButton();
        //Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overnightDufflePage.verifyTheBagShoppingCartText(), "You added Overnight Duffle to your shopping cart.");
        // Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnBagShoppingCartLink();
        //Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.verifyTheBagName(), "Overnight Duffle");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.verifyTheQuantityNumber(), "3");
        //Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.verifyTheProductPriceInCart(), "$135.00");
        // Change Qty to '5'
        shoppingCartPage.changeQuantity5();
        //Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        // Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.verifyTheUpdateCartPrice(), "$225.00");


    }


}

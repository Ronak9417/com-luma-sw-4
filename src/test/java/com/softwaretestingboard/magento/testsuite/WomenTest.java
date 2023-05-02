package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test

    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouserHooverToWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHooverToTopMenu();
        //Click on Jackets
        homePage.clickOnJacket();

        Assert.assertEquals(womenPage.productListAfterSorting(),womenPage.productListAfterSorting());
        }
@Test
        public void verifyTheSortByPriceFilter() throws InterruptedException {
            //Mouse Hover on Women Menu
            homePage.mouserHooverToWomenMenu();
            //Mouse Hover on Tops
            homePage.mouseHooverToTopMenu();
            //Click on Jackets
            homePage.clickOnJacket();

            Assert.assertEquals(womenPage.priceListAfterSorting(),womenPage.priceListBeforeSorting());

        }


    }




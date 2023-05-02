package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearBagsPage extends Utility {

    // Click on Product Name ‘Overnight Duffle’
    By overNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");






    // Click on Product Name ‘Overnight Duffle’
    public void clickOnProductNameOvernightDuffle() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(overNightDuffle);
    }



}

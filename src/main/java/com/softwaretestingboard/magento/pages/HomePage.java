package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Mouse Hoover on WomenLink
    By womenLink = By.xpath("//span[normalize-space()='Women']");

    // Mouse Hover on Tops
    By topLink = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    //click on jacket menu
    By jacketLink = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    //Mouse Hoover on MenLink
    By menLink = By.xpath("//span[normalize-space()='Men']");

    // Mouse hoover Bottoms
    By bottomLink = By.xpath("//a[@id='ui-id-18']");

    //click on pants
    By pantsLink = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    // Mouse Hoover on GearLink
    By gearLink = By.xpath("//span[normalize-space()='Gear']");

    // Click on Bags
    By bags = By.xpath("//span[normalize-space()='Bags']");





    public void mouserHooverToWomenMenu() throws InterruptedException {
        Thread.sleep(3000);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(womenLink)).build().perform();
        mouseHoverToElement(womenLink);
    }

    public void mouseHooverToTopMenu() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(topLink);
    }
    public void clickOnJacket() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElementAndClick(jacketLink);
    }

        public void mouseHooverToMenMenu() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(menLink);
    }

    public void mouseHooverToBottomsMenu() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(bottomLink);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElementAndClick(pantsLink);
    }

    public void mouseHooverToGearMenu() throws InterruptedException {
        Thread.sleep(3000);
        mouseHoverToElement(gearLink);
    }
    // Click on Bags
    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(bags);
    }





}

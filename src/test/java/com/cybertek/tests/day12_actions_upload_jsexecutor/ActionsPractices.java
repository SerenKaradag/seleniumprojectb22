package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover(){

        // TC #15: Hover Test
        //1.Go to http://practice.cybertekschool.com/hovers
        // 2.Hover over to first image
        // 3.Assert:
        // a.“name: user1” is displayed
        // 4.Hover over to second image
        // 5.Assert:
        // a.“name: user2” is displayed
        // 6.Hover over to third image
        // 7.Confirm:
        // a.“name: user3” is displayed

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(3);


        Actions actions = new Actions(Driver.getDriver()); //if we want to use method we need a create object


        actions.moveToElement(image1).perform();
         Assert.assertTrue(user1.isDisplayed());


        actions.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());


        actions.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());






















    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");


        Actions actions = new Actions(Driver.getDriver());

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        BrowserUtils.sleep(10);
        actions.moveToElement(cybertekSchoolLink).perform();

        BrowserUtils.sleep(10);
        actions.sendKeys(Keys.PAGE_UP).perform();

        BrowserUtils.sleep(10);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
}

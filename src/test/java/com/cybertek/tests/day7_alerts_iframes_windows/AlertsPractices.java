package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");


    }



    @Test
    public void information_alert_test(){

        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //3. Click to “Click for JS Alert” button
        informationAlertButton.click();
        Alert alert = driver.switchTo().alert(); // switching driver focus to alert  so we can haandle it
        alert.accept(); // click ok button alert  //4. Click to OK button from the alert

         //5. Verify “You successfuly clicked an alert” text is displayed.
         WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

         String expectedText = "You successfuly clicked an alert";
         String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed on the page.");

        Assert.assertEquals(expectedText, actualText, "Actual text is not as expected.");

    }










    ////TC #2: Confirmation alert practice
    //    //1. Open browser
    //    //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //    //3. Click to “Click for JS Confirm” button
    //    //4. Click to OK button from the alert
    //    //5. Verify “You clicked: Ok” text is displayed.
    //    //TC #3: Information alert practice
    //    //1. Open browser
    //    //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
    //    //3. Click to “Click for JS Prompt” button
    //    //4. Send “hello” text to alert
    //    //5. Click to OK button from the alert
    //    //6. Verify “You entered: hello” text is displayed.
}

package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        //SCROLL DOWN 250 PIXELS
        for (int i = 0; i <10 ; i++) {

            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,250)");
        }



    }

    @Test
    public void scroll_using_jsExecutor_test2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);
    }
}

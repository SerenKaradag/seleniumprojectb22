package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxPractice {
     WebDriver driver;


     @BeforeClass

    public void setUpClass() {
         driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

     }

     @Test

    public void CheckBoxNotSelected() {
         WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

         if(!checkBox.isSelected()){
             System.out.println("CheckBox is NOT selected. Verification PASSED.");
         }else{
             System.out.println("CheckBox is SELECTED. Verification FAILED.");
         }

     }

     @Test

    public void CheckBoxSelected() {
         WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

         checkBox.click();

         if(checkBox.isSelected()){
             System.out.println("CheckBox is selected. Verification PASSED.");
         }else{
             System.out.println("CheckBox is NOT SELECTED. Verification FAILED.");
         }

    }


    @Test

    public void CheckAll() {

         //Verify “Check All” button text is “Check All”
        // 4.Click to “Check All” button
        // 5.Verify all check boxes are checked
        // 6.Verify button text changed to “Uncheck All”

        WebElement checkAllButton = driver.findElement(By.xpath("//input[@value='Check All']"));


     if(!checkAllButton.isSelected()){
         System.out.println("CheckBox all is SELECTED.Verification PASS");
     }else{
         System.out.println("CheckBox all IS Not Selected. Verification FAILED.");
     }


    }


}

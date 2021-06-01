package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {

    WebDriver driver;
    //String str1;

    /*
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/dropdown
     */
    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        //str1 = "something";
    }



    @Test
    public void tc1_simple_dropdown_test(){
        ///str1.substring(1,5);

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));


        //Doing everything in one line: get currently selected option, get the text and compare against expected
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(), "Please select an option");




        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”



        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        // We need to convert Web element  to string
        String actualStateDropdownText = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateDropDown = "Select a State";

        Assert.assertEquals(actualStateDropdownText, expectedStateDropDown); // GIVEN TRUE FALSE


    }


    @Test
    public void tc2_state_dropdown_test(){

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));  // LOCATE STATE DROPDOWN
        //3. Select Illinois
          stateDropDown.selectByVisibleText("Illinois");
         // stateDropDown.selectByValue("IL"); //SECOND OPTION

        //4. Select Virginia
          stateDropDown.selectByValue("VA");
         // stateDropDown.selectByVisibleText("Virginia"); //SECOND OPTION

        //5. Select California
        stateDropDown.selectByIndex(5); //how many line locator 5th
       // stateDropDown.selectByValue("California");  //SECOND OPTION
       // stateDropDown.selectByValue("CA");   //THIRD OPTION


        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

        String exceptedOptionText = "California";
        String actualOptionText = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, exceptedOptionText);
    }



    @AfterClass
    public void teardownClass(){

        driver.close();
    }




}
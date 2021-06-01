package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice3 {
      WebDriver driver;
    /**
     Open Chrome browser
     2.Go to http://practice.cybertekschool.com/dropdown
     3.Select “December 1st, 1922” and verify it is selected.
     Select year using: visible text
     Select month using : value attribute
     Select day using: index number
     */

    @BeforeClass
    public void setupClass() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
     public void year_selected(){
    Select yearSelected = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    yearSelected.selectByVisibleText("1922");

        Assert.assertEquals(yearSelected.getFirstSelectedOption().getText(), "1922");

    }


    @Test
    public void month_selected(){
        Select monthSelected = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthSelected.selectByValue("11");

        Assert.assertEquals(monthSelected.getFirstSelectedOption().getText(), "December");
    }

    @Test
    public void day_selected(){
        Select daySelected = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        daySelected.selectByIndex(0);

        Assert.assertEquals(daySelected.getFirstSelectedOption().getText(), "1");
    }

    @Test
    public void languages(){
        Select program = new Select(driver.findElement(By.xpath("//selected[@id='Languages']")));
    }

    @AfterClass
    public void teardownClass(){

        driver.close();
    }






































}

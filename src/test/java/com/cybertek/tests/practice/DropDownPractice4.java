package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DropDownPractice4 {


    WebDriver driver;
    ArrayList<String> all = new ArrayList<String>();

    @BeforeClass

    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test

    public void select_simpleDropdown(){
          Select allOptions = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
          all.add(allOptions.getFirstSelectedOption().getText());

    }

    @Test
    public void selectDate(){
        Select yearSelected = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthSelected = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select daySelected = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        all.add(yearSelected.getFirstSelectedOption().getText());
        all.add(monthSelected.getFirstSelectedOption().getText());
        all.add(daySelected.getFirstSelectedOption().getText());
    }

    @Test
    public void selectState() {
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        // stateDropDown.selectByVisibleText("Alabama");
        all.add(stateDropDown.getFirstSelectedOption().getText());

    }




    @AfterClass
    public void teardownClass(){

        System.out.println(all);
    }


}

package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {
       // 1. Open Chrome browser
       // 2. Go to http://practice.cybertekschool.com/forgot_password
       // 3. Print out the texts of all links
       // 4. Print out how many total link

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // Like Thread.sleep(500); Wait TIme
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //WE NEED TO CREATE A LOCATOR THAT RETURNS US ALL LINKS ON THE PAGE
        //ALL LINKS RETURNS
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for(WebElement each : listOfLinks){

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }

        int numberOfLinks = listOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);







    }
}

package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:/www.google.com");
       // LOCATING THE WEB ELEMENT --->CLICK
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();



        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


       driver.navigate().back();


    String expectedGoogleTitle = "Google";
    String actualGoogleTitle =driver.getTitle();


        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google Title verification PASSED");
        }else{
            System.out.println("Google Title verification FAILED");
        }



















    }
    }


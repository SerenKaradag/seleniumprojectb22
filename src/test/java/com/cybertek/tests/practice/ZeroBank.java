package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

       // driver.findElement(By.className("brand"));

        String actualHref = driver.findElement(By.className("brand")).getAttribute("href");
        String expectedHref = "index.html";

        if(actualHref.contains(expectedHref)){
            System.out.println("Test is PASSED!");
        }else{
            System.out.println("Test is FAILED");
        }


    }
}

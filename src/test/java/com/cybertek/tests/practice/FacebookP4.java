package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("seren@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.name("pass")).sendKeys("54321" + Keys.ENTER);

        driver.findElement(By.id("pageTitle"));
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("============PASSED============");
        }else{
            System.out.println("============FAILED============");
        }



    }
}

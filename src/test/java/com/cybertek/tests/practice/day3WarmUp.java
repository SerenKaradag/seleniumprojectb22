package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3WarmUp {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.findElement(By.className("txt")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.className("button")).click();

        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();

        if(expectedTitle2.equals(actualTitle2)){
            System.out.println("Second Title Verification PASSED");
        }else{
            System.out.println("Second Title Verification FAILED");
        }











    }
}

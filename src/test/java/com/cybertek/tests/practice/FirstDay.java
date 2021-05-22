package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http:/www.amazon.com");

        Thread.sleep(4000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women dresses" + Keys.ENTER);

        driver.findElement(By.className("nav-line-1-container")).click();

        WebElement amazonSignIn = driver.findElement(By.className("nav-line-1-container"));

        String expectedLinkText = "Amazon Sign-In";
        String actualLinkText = amazonSignIn.getText();

        if(expectedLinkText.equals(actualLinkText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }



    }

}

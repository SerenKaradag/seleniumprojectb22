package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("seren@gmail.com");

        WebElement inputUserName =  driver.findElement(By.name("email"));


        inputUserName.sendKeys("seren@gmail.com");


        WebElement inputPassWord = driver.findElement(By.name("pass"));


        inputPassWord.sendKeys("12345" + Keys.ENTER);

        Thread.sleep(5000);
         //FREEZING THE CODE FOR 1 SECOND AND CHROME CAN CATCH UP WITH LOADING THE PAGE
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED");
        }
    }
}

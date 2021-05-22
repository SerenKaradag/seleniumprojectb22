package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test verification PASSED!");
        }else{
            System.out.println("Test verification FAILED!");
        }
    }
}

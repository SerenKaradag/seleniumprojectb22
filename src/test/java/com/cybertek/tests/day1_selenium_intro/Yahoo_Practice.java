package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();// OPENING EMPTY BROWSER

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        //3. verify title:
        //Expected Yahoo
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);

        //actual title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //creating our verification
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification Passed!");
        }else{
            System.out.println("Title is not as expected.Verification FAILED!!!");
        }
        //Closing Browser
        driver.close();


    }
}

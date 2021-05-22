package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        // this line opens a browser with nothing
        WebDriver driver = new ChromeDriver();


        // browser size is max size with that method
        driver.manage().window().maximize();

        // FULLSCREEN
       // driver.manage().window().fullscreen();


        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current title:" + driver.getTitle());

       String currentUrl = driver.getCurrentUrl();


        System.out.println("currentUrl = " + currentUrl);

        //putting 3 seconds of wait / stops the code 3 seconds
        //hover over add exception to method signature
        Thread.sleep(3000);

         //going back using navigations
          driver.navigate().back();

          // Going forward using navigations
         driver.navigate().forward();


         // refreshing page with refresh method
         driver.navigate().refresh();

         //Same as  get method but that one more than fast from get
         driver.navigate().to("https://www.google.com");

        System.out.println("Current title:" + driver.getTitle());

         currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);


       // closing the currently focused page or tab
        // 1 BROWSER 1 TAB
       driver.close();

       // close all of the opened browsers or tabs SAME SESSION

        driver.quit();



    }
}

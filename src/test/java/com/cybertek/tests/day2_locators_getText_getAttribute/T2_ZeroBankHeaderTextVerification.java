package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankHeaderTextVerification {

    public static void main(String[] args) {

        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html 3. Verify link text from top left:
        //Expected: “Zero Bank”
        //4. Verify link href attribute value contains:
        //Expected: “index.html”


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

         //LOCATE THE LINK AND STORE OF WEB ELEMENT
          WebElement zeroBankLink = driver.findElement(By.className("brand"));

        //Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();


        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification PASSED!");
        }else{
            System.out.println("Link text verification FAILED!");
        }

       // String actualHrefValue = driver.findElement(By.className("brand")).getAttribute("href");
       //  this way its hard
       String expectedInHrefValue = "index.html";

        String actualHrefValue = zeroBankLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href attribute value verification PASSED!");
        }else{
            System.out.println("Href attribute value verification FAILED!");
        }






    }
}

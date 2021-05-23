package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class asasasasasas {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");

        /**
         * Given a truck driver is on Vytrak Login page
         * When user enters a valid truck driver username
         * And enters a valid truck driver password
         * And clicks a login button
         * Then user should see truck driver Quick Launchpad
         */

        /**
         * enter valid Truck Driver credentials - positive
         */
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));

        usernameInput.sendKeys("user22");
        passwordInput.sendKeys("UserUser123");
        loginButton.click();

        /**
         *  Look for "Quick Launchpad" on the user's account page
         */
        WebElement quickLaunchpad = driver.findElement(By.xpath("//h1[.='Quick Launchpad']"));
        String actualHeader = quickLaunchpad.getText();
        String expectedHeader = "Quick Launchpad";
         Thread.sleep(2000);
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Scenario 1 - positive: Truck driver login with valid credentials\n" +
                    "Header verification PASS");
        } else {
            System.out.println("Scenario 1 - positive: Truck driver login with valid credentials\n" +
                    "Header verification FAIL");
        }
    }
}

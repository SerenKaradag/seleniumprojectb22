package com.cybertek.tests.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Group {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");

        /**
         * Given sales manager is on Vytrack Login page
         * When user enters a VALID username
         * And enters an INVALID password
         * And clicks a login button
         * Then user should see a message “Invalid username or password” between the Login header and username field
         */


        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));

        usernameInput.sendKeys("salesmanager122");
        passwordInput.sendKeys("somepw");
        loginButton.click();

        WebElement errorField = driver.findElement(By.xpath("//div[.='Invalid user name or password.']"));

        String actualErrorFieldText = errorField.getText();
        String expectedErrorFieldText = "Invalid user name or password.";

        if(actualErrorFieldText.equals(expectedErrorFieldText)) {
            System.out.println("Scenario 2 - negative: Sales manager login with INVALID credentials\n" +
                    "Error text verification PASS");
        } else {
            System.out.println("Scenario 2 - negative: Sales manager login with INVALID credentials\n" +
                    "Error text verification FAIL");
        }
    }
}

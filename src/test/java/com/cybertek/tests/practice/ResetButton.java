package com.cybertek.tests.practice;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ResetButton {




    @Test

      public void reset_button_clickable() {
        Driver.getDriver().get("https://qa3.vytrack.com/entity/Extend_Entity_Carreservation");
        WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        userNameInput.sendKeys("user22");
        passwordInput.sendKeys("UserUser123");
        loginButton.click();

        List<WebElement>filterOfGrid = Driver.getDriver().findElements(By.xpath("//a[contains(@class, 'grid')]"));
        WebElement resetButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-refresh']"));

        for(WebElement each : filterOfGrid){
            each.click();
            BrowserUtils.sleep(20);
            resetButton.click();
            BrowserUtils.sleep(20);
        }

    }
}

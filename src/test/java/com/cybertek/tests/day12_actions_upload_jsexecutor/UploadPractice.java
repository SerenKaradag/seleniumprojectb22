package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    /**
     * TC #14: UploadTest
     * 1.Go to http://practice.cybertekschool.com/upload
     * 2.Find some small file from your computer, and get the path of it.
     * 3.Upload the file.
     * 4.Assert: - Fileuploaded text is displayed on the page
     */

    @Test
    public void upload_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path = "C:\\Users\\abasp\\Pictures\\SnowandZilli.jpg";  //WE ARE GETTING PICTURE FROM COMPUTER

        WebElement  chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(5);

        chooseFile.sendKeys(path); // we are sending our photo to choose file

        uploadButton.click();  //we clicked

        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();






    }
}

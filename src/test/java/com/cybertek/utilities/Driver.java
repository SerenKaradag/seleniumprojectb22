package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /**
     * Creating the private  constructor so this class object is not reachable from outside
     */

    private Driver(){

    }

    /**
     * WE MAKE IT STATIC BECAUSE WE WANT IT TO RUN BEFORE EVERTHING ELSE,
     * AND ALSO WE WILL USE IT IN A STATIC METHOD
     */
    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){

            String browserType = ConfigurationReader.getProperty("browser");
            /**
             * we created alredy ConfigurationReader file we are getting from there.
             */

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }

        return driver;
    }

}

package com.cybertek.practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class SimpleDropdown {
    //1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
    // 4.Verify“State selection” default selected value is correctExpected: “Select a State”

    WebDriver driver = WebDriverFactory.getDriver("chrome");
}

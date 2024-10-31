package com.example.pages;

import com.example.utils.WaitUtils;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected WaitUtils waitUtils;

   public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    // Common methods for all pages can be added here
}
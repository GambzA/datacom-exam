package com.example.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementUtils {
    private final WebDriverWait wait;

    public WebElementUtils(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickElement(WebElement element) {
        waitForElementToBeClickable(getElementLocator(element));
        element.click();
    }

    public String getElementText(WebElement element) {
        waitForElementToBeVisible(getElementLocator(element));
        return element.getText();
    }

    public boolean isElementVisible(WebElement element) {
        try {
            waitForElementToBeVisible(getElementLocator(element));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    private By getElementLocator(WebElement element) {
        return null;
    }
}

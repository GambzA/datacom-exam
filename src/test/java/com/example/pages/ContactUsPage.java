package com.example.pages;

import com.example.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage{

    private static String BASE_CONTACT_US_FORM = "//div[@class='cmp-mrkto-modal__content__grid__outer']";

    // Locators
    private static By PAGE_HEADER = By.xpath("//h2[@class='cmp-title__text ']");
    private static By CONTACT_US_BUTTON = By.xpath("//div[@id='cmp-mrkto-modal-thank-you']");
    private static By CONTACT_US_FORM = By.xpath(BASE_CONTACT_US_FORM);
    private static By CONTACT_US_FORM_SUBMIT = By.xpath(BASE_CONTACT_US_FORM + "//button[@type='submit']");
    private static By CONTACT_US_FORM_THANKYOU = By.xpath("//div[@id='thank-you']//h3[.='Thank you for getting in touch with us']");

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public String getPageHeaderText() {
        return driver.findElement(PAGE_HEADER).getText();
    }

    // Method to click on the location tab based on inner text
    public void clickLocationTabElement(String location) {
        // Update the locator dynamically based on the location
        By locationTab = By.xpath("//li[normalize-space(text())='" + location + "']");
        WebElement element = driver.findElement(locationTab);
        element.click();
    }

    public void clickContactUsButton() {
        waitUtils.waitForElementToBeClickable(CONTACT_US_BUTTON, 5);
        driver.findElement(CONTACT_US_BUTTON).click();
    }

    public void clickSubmitButton() {
        waitUtils.waitForElementToBeClickable(CONTACT_US_FORM_SUBMIT, 5);
        driver.findElement(CONTACT_US_FORM_SUBMIT).click();
    }

    public boolean checkContactUsForm() {
        return driver.findElement(CONTACT_US_FORM).isDisplayed();
    }

    public boolean thankYouModalDisplay() {
        return driver.findElement(CONTACT_US_FORM_THANKYOU).isDisplayed();
    }

    public void inputText(String text, String field) {
        driver.findElement(By.xpath(BASE_CONTACT_US_FORM + "//input[@id='" + field + "']")).sendKeys(text);
    }

    public void selectDropdown(String text, String field){
        WebElement dropdownElement = driver.findElement(By.xpath(BASE_CONTACT_US_FORM + "//select[@id='" + field + "']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(text);
    }
}

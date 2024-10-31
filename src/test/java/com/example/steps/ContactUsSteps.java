package com.example.steps;

import com.example.Hooks;
import com.example.pages.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.junit.Assert.*;

public class ContactUsSteps {
    ContactUsPage contactUsPage;
    private String selectedLocation;
    WebDriver driver = Hooks.getDriver();


    @Given("I visit contact us page of Datacom Website")
    public void visitIntendedPage() {
        WebDriver driver = Hooks.getDriver();
        contactUsPage = new ContactUsPage(driver);
        driver.get("https://datacom.com/nz/en/contact-us");
    }

    @Then("I check if header with text {string} is visible")
    public void ValidateTitleLoadAndValue(String expectedTitle) {
        String actualTitle = contactUsPage.getPageHeaderText();
        assertEquals(expectedTitle, actualTitle);
    }

    @When("I click {string} in Our locations section")
    public void clickLocationTab(String location) {
        contactUsPage.clickLocationTabElement(location);
        selectedLocation = location;
    }

    @Then("^I verify that the following sub-locations are present")
    public void verifySubLocations(List<String> subLocations) {
        for (String subLocation : subLocations) {
            By subLocationLocator = By.xpath(" //div[@region='" + selectedLocation + "']" +
                    "//div[normalize-space(text())='" + subLocation + "']");
            boolean isPresent = !driver.findElements(subLocationLocator).isEmpty();
            assertTrue("Sub-location '" + subLocation + "' is not present.", isPresent);
        }
    }

    @When("I click Contact Us button")
    public void clickContactUs() {
        contactUsPage.clickContactUsButton();
    }

    @Then("I verify that Contact Us form is visible")
    public void verifyContactUsFormVisibility() {
        assertTrue(contactUsPage.checkContactUsForm());
    }

    @When("I input {string} on {string} field")
    public void inputToField(String text, String field) {
        contactUsPage.inputText(text, field);
    }

    @And("I select {string} in {string} dropdown")
    public void selectDropdownField(String value, String fieldDropdown) {
        contactUsPage.selectDropdown(value, fieldDropdown);
    }

    @And("I click Submit button in Contact Us Form")
    public void clickSubmitButtonInContactUs() {
        contactUsPage.clickSubmitButton();
    }

    @Then("Thank you modal should be display")
    public void thankYouModalShouldBeDisplay() {
        assertTrue(contactUsPage.thankYouModalDisplay());
    }
}

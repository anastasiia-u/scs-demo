package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the "Solutions" dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for the dropdown options
    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(@href, '/automotive')]")
    private WebElement automotiveOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//span[text()='Lifestyle']")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(@href, '/lifestyle')]")
    private WebElement consumerOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(@href, 'https://pro.harman.com')]")
    private WebElement professionalOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(@href, 'https://services.harman.com')]")
    private WebElement digitalTransformationOption;

    // Method to open the main page
    public void open() {
        driver.get(url);
    }

    // Method to get the dropdown menu
    public WebElement getDropdownMenu(String dropdownName) {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        return solutionsDropdown;
    }

    // Method to get all dropdown options
    public List<WebElement> getDropdownOptions() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@aria-labelledby='navlink-_l2']//a | //ul[@aria-labelledby='navlink-_l2']//span")));
        return driver.findElements(By.xpath("//ul[@aria-labelledby='navlink-_l2']//a | //ul[@aria-labelledby='navlink-_l2']//span"));
    }

    // Method to check if the dropdown is open
    public boolean isDropdownOpen(String dropdownName) {
        return solutionsDropdown.getAttribute("aria-expanded").equals("true");
    }

    // Method to get a specific dropdown option
    public WebElement getDropdownOption(String optionName) {
        switch (optionName.toLowerCase()) {
            case "automotive":
                return automotiveOption;
            case "lifestyle":
                return lifestyleOption;
            case "consumer":
                return consumerOption;
            case "professional":
                return professionalOption;
            case "digital transformation solutions":
                return digitalTransformationOption;
            default:
                throw new IllegalArgumentException("Invalid option name: " + optionName);
        }
    }

    // Method to click outside the dropdown
    public void clickOutsideDropdown() {
        // Assuming there's a method to click outside, like clicking on the body
        driver.findElement(By.tagName("body")).click();
    }

    // Method to click on a disabled area of the dropdown
    public void clickOnDisabledAreaOfDropdown(String dropdownName) {
        // Assuming there's a specific disabled area to click
        // This is a placeholder as the actual implementation depends on the HTML structure
    }
}
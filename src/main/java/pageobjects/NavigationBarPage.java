package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class NavigationBarPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the "Solutions" dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for the options within the "Solutions" dropdown menu
    @FindBy(xpath = "//a[@id='tabnav-_l11']")
    private WebElement automotiveOption;

    @FindBy(xpath = "//span[@id='tabnav-_l38']")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//a[@id='tabnav-_l17']")
    private WebElement consumerOption;

    @FindBy(xpath = "//a[@id='tabnav-_l39']")
    private WebElement professionalOption;

    @FindBy(xpath = "//a[@id='tabnav-_l40']")
    private WebElement digitalTransformationOption;

    // Locator for clicking outside the dropdown
    @FindBy(css = "body")
    private WebElement outsideDropdown;

    // Locator for error message
    @FindBy(xpath = "//div[contains(@class, 'error-message')]")
    private WebElement errorMessage;

    public NavigationBarPage() {
        // Default constructor
    }

    // Opens the Harman website
    public void open() {
        open(url);
    }

    // Clicks on the specified dropdown menu
    public void clickDropdownMenu(String dropdownName) {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Ensures the dropdown menu is visible
    public void ensureDropdownMenuVisible(String dropdownName) {
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdown));
    }

    // Clicks on a specified option within the dropdown
    public void clickOption(String optionName) {
        WebElement option = getOptionElement(optionName);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }

    // Checks if a specified option is visible
    public boolean isOptionVisible(String optionName) {
        WebElement option = getOptionElement(optionName);
        wait.until(ExpectedConditions.visibilityOf(option));
        return option.isDisplayed();
    }

    // Clicks outside the dropdown to close it
    public void clickOutsideDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(outsideDropdown));
        outsideDropdown.click();
    }

    // Checks if the dropdown menu is visible
    public boolean isDropdownMenuVisible() {
        return solutionsDropdown.isDisplayed();
    }

    // Clicks on an invalid option
    public void clickInvalidOption(String invalidOption) {
        // Simulate clicking an invalid option
    }

    // Checks if any section is navigated
    public boolean isAnySectionNavigated() {
        // Implement logic to check if any section is navigated
        return false;
    }

    // Gets the error message displayed
    public String getErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

    // Helper method to get the WebElement for an option
    private WebElement getOptionElement(String optionName) {
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
}

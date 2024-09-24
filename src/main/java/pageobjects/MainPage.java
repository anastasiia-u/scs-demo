package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the Solutions dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for the dropdown options
    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Automotive')]")
    private WebElement automotiveOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//span[contains(text(), 'Lifestyle')]")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Consumer')]")
    private WebElement consumerOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Professional')]")
    private WebElement professionalOption;

    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a[contains(text(), 'Digital Transformation Solutions')]")
    private WebElement digitalTransformationOption;

    // Constructor
    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to open the main page
    public void open() {
        driver.get(url);
    }

    // Method to navigate to the main navigation bar
    public void navigateToMainBar() {
        open();
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdown));
    }

    // Method to click on the Solutions dropdown menu
    public void clickOnDropdown(String dropdownMenu) {
        if ("Solutions".equalsIgnoreCase(dropdownMenu)) {
            wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
            solutionsDropdown.click();
        }
    }

    // Method to verify dropdown options
    public boolean verifyDropdownOptions(String... options) {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        return automotiveOption.getText().equals(options[0]) &&
               lifestyleOption.getText().equals(options[1]) &&
               consumerOption.getText().equals(options[2]) &&
               professionalOption.getText().equals(options[3]) &&
               digitalTransformationOption.getText().equals(options[4]);
    }

    // Method to verify if the dropdown is open
    public void verifyDropdownIsOpen(String dropdownMenu) {
        if ("Solutions".equalsIgnoreCase(dropdownMenu)) {
            wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        }
    }

    // Method to click on a specific option
    public void clickOnOption(String option) {
        switch (option) {
            case "Automotive":
                wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
                automotiveOption.click();
                break;
            // Add cases for other options as needed
        }
    }

    // Method to click outside the dropdown
    public void clickOutsideDropdown() {
        // Assuming there's a specific element to click outside
        // Implement this based on the actual page structure
    }

    // Method to check if the dropdown is open
    public boolean isDropdownOpen() {
        return automotiveOption.isDisplayed();
    }

    // Overloaded method to check if a specific dropdown is open
    public boolean isDropdownOpen(String dropdownMenu) {
        return "Solutions".equalsIgnoreCase(dropdownMenu) && automotiveOption.isDisplayed();
    }

    // Method to click on a non-dropdown area
    public void clickOnNonDropdownArea() {
        // Implement this based on the actual page structure
    }
}

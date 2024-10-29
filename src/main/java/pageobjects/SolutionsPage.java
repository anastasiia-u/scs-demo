package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

// Extending BasePage to inherit driver and wait functionalities
public class SolutionsPage extends BasePage {

    // URL of the page
    private String url = "https://www.harman.com";

    // Locator for the "Solutions" dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for dropdown options
    @FindBy(xpath = "//a[@href='/automotive']")
    private WebElement automotiveOption;

    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement consumerOption;

    @FindBy(xpath = "//a[@href='https://pro.harman.com']")
    private WebElement professionalOption;

    @FindBy(xpath = "//a[@href='https://services.harman.com']")
    private WebElement digitalTransformationOption;

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click on the "Solutions" dropdown menu
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to check if dropdown options are visible
    public boolean areDropdownOptionsVisible() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click on a specific dropdown option
    public void clickDropdownOption(String option) {
        switch (option.toLowerCase()) {
            case "automotive":
                wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
                automotiveOption.click();
                break;
            case "lifestyle":
                wait.until(ExpectedConditions.elementToBeClickable(lifestyleOption));
                lifestyleOption.click();
                break;
            case "consumer":
                wait.until(ExpectedConditions.elementToBeClickable(consumerOption));
                consumerOption.click();
                break;
            case "professional":
                wait.until(ExpectedConditions.elementToBeClickable(professionalOption));
                professionalOption.click();
                break;
            case "digital transformation":
                wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationOption));
                digitalTransformationOption.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid option: " + option);
        }
    }

    // Method to close the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Assuming clicking the logo will close the dropdown
        WebElement logo = driver.findElement(By.cssSelector(".logo"));
        wait.until(ExpectedConditions.elementToBeClickable(logo));
        logo.click();
    }

    // Method to check if the dropdown is not visible
    public boolean isDropdownNotVisible() {
        return !solutionsDropdown.isDisplayed();
    }
}
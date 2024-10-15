package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

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

    // Constructor
    public SolutionsPage() {
        super();
    }

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click the "Solutions" dropdown
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to click the "Automotive" option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to check if the dropdown options are visible
    public boolean areDropdownOptionsVisible() {
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click outside the dropdown to dismiss it
    public void clickOutsideDropdown() {
        // Assuming there's a method to click outside, e.g., clicking on the logo
        WebElement logo = driver.findElement(By.cssSelector(".logo"));
        logo.click();
    }

    // Method to check if the dropdown is not visible
    public boolean isDropdownNotVisible() {
        return !solutionsDropdown.isDisplayed();
    }
}
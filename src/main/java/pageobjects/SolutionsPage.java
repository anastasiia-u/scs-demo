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

    // Locators for the options under the "Solutions" dropdown menu
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

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click on the "Solutions" dropdown menu
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to get the text of the "Automotive" option
    public String getAutomotiveOptionText() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        return automotiveOption.getText();
    }

    // Method to click on the "Automotive" option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to click outside the dropdown menu to dismiss it
    public void clickOutsideDropdown() {
        // Assuming there's a known element outside the dropdown to click on
        WebElement outsideElement = driver.findElement(By.tagName("body"));
        outsideElement.click();
    }

    // Method to click on another navigation item to dismiss the dropdown
    public void clickAnotherNavigationItem() {
        WebElement anotherNavItem = driver.findElement(By.id("navlink-_l1")); // Example: Responsibility
        anotherNavItem.click();
    }

    // Method to attempt selecting an invalid option
    public void selectInvalidOption(String option) {
        // Logic to handle invalid option selection
        // This could involve checking for an error message or handling exceptions
    }
}

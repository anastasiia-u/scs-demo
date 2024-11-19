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

    // Method to check if the "Automotive" option is visible
    public boolean isAutomotiveOptionVisible() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        return automotiveOption.isDisplayed();
    }

    // Method to navigate to the "Automotive" section
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to dismiss the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Assuming there's an element to click outside, e.g., the body
        WebElement body = driver.findElement(By.tagName("body"));
        body.click();
    }

    // Method to dismiss the dropdown by clicking another navigation item
    public void clickAnotherNavigationItem() {
        // Assuming there's another navigation item, e.g., "Company"
        WebElement companyNavItem = driver.findElement(By.id("navlink-_l3"));
        companyNavItem.click();
    }

    // Method to check if the "No options available" message is displayed
    public boolean isNoOptionsMessageDisplayed() {
        // Assuming there's a specific element or message for this scenario
        WebElement noOptionsMessage = driver.findElement(By.xpath("//div[contains(text(),'No options available')]"));
        return noOptionsMessage.isDisplayed();
    }
}
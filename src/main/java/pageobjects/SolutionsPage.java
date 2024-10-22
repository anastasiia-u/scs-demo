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

    // Method to click on the "Automotive" option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to check if the dropdown options are visible
    public boolean areDropdownOptionsVisible() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        wait.until(ExpectedConditions.visibilityOf(lifestyleOption));
        wait.until(ExpectedConditions.visibilityOf(consumerOption));
        wait.until(ExpectedConditions.visibilityOf(professionalOption));
        wait.until(ExpectedConditions.visibilityOf(digitalTransformationOption));
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click outside the dropdown menu
    public void clickOutsideDropdown() {
        // Assuming there's a common area to click outside, like the body
        WebElement body = driver.findElement(By.tagName("body"));
        body.click();
    }

    // Method to attempt to click on a non-existent option
    public boolean attemptInvalidOptionClick(String option) {
        try {
            WebElement invalidOption = driver.findElement(By.xpath("//a[text()='" + option + "']"));
            invalidOption.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
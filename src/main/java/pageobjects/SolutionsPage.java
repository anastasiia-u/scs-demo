package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the Solutions dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for the options within the Solutions dropdown
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

    // Method to click on the Solutions dropdown
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to check if the dropdown options are visible
    public boolean areDropdownOptionsVisible() {
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click on the Automotive option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to click outside the dropdown to close it
    public void clickOutsideDropdown() {
        // Assuming there is a known element outside the dropdown to click
        // This should be replaced with an actual locator for an element outside the dropdown
        WebElement outsideElement = driver.findElement(By.cssSelector("body"));
        outsideElement.click();
    }
}
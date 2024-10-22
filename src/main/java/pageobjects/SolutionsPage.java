package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the Solutions dropdown toggle
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdownToggle;

    // Locators for the options within the Solutions dropdown
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

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click on the Solutions dropdown
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdownToggle));
        solutionsDropdownToggle.click();
    }

    // Method to verify visibility of options
    public boolean areOptionsVisible() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        return automotiveOption.isDisplayed() && lifestyleOption.isDisplayed() &&
               consumerOption.isDisplayed() && professionalOption.isDisplayed() &&
               digitalTransformationOption.isDisplayed();
    }

    // Method to click on the Automotive option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to click outside the dropdown
    public void clickOutsideDropdown() {
        // Assuming there's a specific element to click outside, like the logo
        WebElement outsideElement = driver.findElement(By.id("ctl00_onetidProjectPropertyTitleGraphic"));
        wait.until(ExpectedConditions.elementToBeClickable(outsideElement));
        outsideElement.click();
    }

    // Method to handle invalid option selection
    public boolean isDropdownStillOpen() {
        return solutionsDropdownToggle.getAttribute("aria-expanded").equals("true");
    }
}
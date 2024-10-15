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
    public SolutionsPage() {
        super();
    }

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click on the "Solutions" dropdown
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to click on the "Automotive" option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to click on the "Lifestyle" option
    public void clickLifestyleOption() {
        wait.until(ExpectedConditions.elementToBeClickable(lifestyleOption));
        lifestyleOption.click();
    }

    // Method to click on the "Consumer" option
    public void clickConsumerOption() {
        wait.until(ExpectedConditions.elementToBeClickable(consumerOption));
        consumerOption.click();
    }

    // Method to click on the "Professional" option
    public void clickProfessionalOption() {
        wait.until(ExpectedConditions.elementToBeClickable(professionalOption));
        professionalOption.click();
    }

    // Method to click on the "Digital Transformation Solutions" option
    public void clickDigitalTransformationOption() {
        wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationOption));
        digitalTransformationOption.click();
    }

    // Method to check if the dropdown is visible
    public boolean isDropdownVisible() {
        return solutionsDropdown.isDisplayed();
    }
}
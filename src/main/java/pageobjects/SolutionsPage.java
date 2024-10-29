package src.main.java.pageobjects;

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

    // Constructor
    public SolutionsPage() {
        // Initialize elements
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

    // Method to click on each dropdown option
    public void clickAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    public void clickLifestyleOption() {
        wait.until(ExpectedConditions.elementToBeClickable(lifestyleOption));
        lifestyleOption.click();
    }

    public void clickConsumerOption() {
        wait.until(ExpectedConditions.elementToBeClickable(consumerOption));
        consumerOption.click();
    }

    public void clickProfessionalOption() {
        wait.until(ExpectedConditions.elementToBeClickable(professionalOption));
        professionalOption.click();
    }

    public void clickDigitalTransformationOption() {
        wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationOption));
        digitalTransformationOption.click();
    }

    // Method to close the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Implement logic to click outside the dropdown
    }
}
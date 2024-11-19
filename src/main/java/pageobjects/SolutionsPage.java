package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import org.openqa.selenium.By;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the "Solutions" dropdown menu
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for options within the "Solutions" dropdown
    @FindBy(xpath = "//a[@href='/automotive']")
    private WebElement automotiveOption;

    @FindBy(xpath = "//span[@id='tabnav-_l38']")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement consumerOption;

    @FindBy(xpath = "//a[@href='https://pro.harman.com']")
    private WebElement professionalOption;

    @FindBy(xpath = "//a[@href='https://services.harman.com']")
    private WebElement digitalTransformationOption;

    // Constructor
    public SolutionsPage() {
        super();
    }

    // Method to open the Solutions page
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

    // Method to dismiss the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Assuming there's a common area to click outside, we can use the body tag
        WebElement body = driver.findElement(By.tagName("body"));
        body.click();
    }

    // Method to handle invalid option selection
    public void selectInvalidOption(String option) {
        // This method would handle the logic for invalid option selection
        // For now, it can throw an exception or log an error
        throw new IllegalArgumentException("Invalid option: " + option);
    }
}
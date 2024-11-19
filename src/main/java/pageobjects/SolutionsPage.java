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

    // Locators for the dropdown options
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

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click on the Solutions dropdown
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to select an option from the dropdown
    public void selectOption(String option) {
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
            case "digital transformation solutions":
                wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationOption));
                digitalTransformationOption.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid option: " + option);
        }
    }

    // Method to close the dropdown by clicking outside
    public void clickOutside() {
        // Assuming there's a known element to click outside
        // This can be any element that is not part of the dropdown
        WebElement outsideElement = driver.findElement(By.tagName("body"));
        outsideElement.click();
    }
}
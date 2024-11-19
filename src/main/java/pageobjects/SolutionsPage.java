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
    @FindBy(id = "tabnav-_l11")
    private WebElement automotiveOption;

    @FindBy(id = "tabnav-_l38")
    private WebElement lifestyleOption;

    @FindBy(id = "tabnav-_l17")
    private WebElement consumerOption;

    @FindBy(id = "tabnav-_l39")
    private WebElement professionalOption;

    @FindBy(id = "tabnav-_l40")
    private WebElement digitalTransformationOption;

    // Locator for the Home navigation item
    @FindBy(xpath = "//a[@href='/']")
    private WebElement homeNavItem;

    // Method to open the Solutions page
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
        WebElement optionElement = null;
        switch (option.toLowerCase()) {
            case "automotive":
                optionElement = automotiveOption;
                break;
            case "lifestyle":
                optionElement = lifestyleOption;
                break;
            case "consumer":
                optionElement = consumerOption;
                break;
            case "professional":
                optionElement = professionalOption;
                break;
            case "digital transformation solutions":
                optionElement = digitalTransformationOption;
                break;
            default:
                throw new IllegalArgumentException("Invalid option: " + option);
        }
        wait.until(ExpectedConditions.elementToBeClickable(optionElement));
        optionElement.click();
    }

    // Method to click on the Home navigation item
    public void clickHomeNavItem() {
        wait.until(ExpectedConditions.elementToBeClickable(homeNavItem));
        homeNavItem.click();
    }

    // Method to close the dropdown by clicking outside
    public void clickOutsideDropdown() {
        // Assuming clicking on the body will close the dropdown
        WebElement body = driver.findElement(By.tagName("body"));
        body.click();
    }
}
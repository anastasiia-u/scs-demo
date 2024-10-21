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
    @FindBy(xpath = "//ul[@aria-labelledby='navlink-_l2']//a")
    private List<WebElement> dropdownOptions;

    // Locator for the page body to click outside the dropdown
    @FindBy(tagName = "body")
    private WebElement pageBody;

    public SolutionsPage() {
        // Default constructor
    }

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click the "Solutions" dropdown
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to get all options under the "Solutions" dropdown
    public List<WebElement> getDropdownOptions() {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        return dropdownOptions;
    }

    // Method to select a specific option from the dropdown
    public void selectOption(String option) {
        for (WebElement e : dropdownOptions) {
            if (option.equalsIgnoreCase(e.getText())) {
                e.click();
                break;
            }
        }
    }

    // Method to click outside the dropdown to close it
    public void clickOutside() {
        pageBody.click();
    }

    // Method to check if the dropdown is open
    public boolean isDropdownOpen() {
        return solutionsDropdown.getAttribute("aria-expanded").equals("true");
    }
}
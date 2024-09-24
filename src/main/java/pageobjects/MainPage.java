package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the Solutions dropdown menu
    @FindBy(css = "a#navlink-_l2")
    private WebElement solutionsDropdown;

    // Locators for dropdown options
    @FindBy(css = "ul[aria-labelledby='navlink-_l2'] a.nav-link-sub")
    private List<WebElement> dropdownOptions;

    // Method to open the main page
    public void open() {
        open(url);
    }

    // Method to get the dropdown WebElement
    public WebElement getDropdown(String dropdownName) {
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdown));
        return solutionsDropdown;
    }

    // Method to get all dropdown options
    public List<String> getDropdownOptions() {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        return dropdownOptions.stream().map(WebElement::getText).toList();
    }

    // Method to get a specific dropdown option
    public WebElement getDropdownOption(String option) {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        return dropdownOptions.stream()
                .filter(e -> e.getText().equalsIgnoreCase(option))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Option not found: " + option));
    }

    // Method to check if the dropdown is open
    public boolean isDropdownOpen(String dropdownName) {
        return solutionsDropdown.getAttribute("aria-expanded").equals("true");
    }

    // Method to click outside the dropdown
    public void clickOutsideDropdown() {
        // Assuming there's a specific element to click outside
        WebElement outsideElement = driver.findElement(By.cssSelector("body"));
        outsideElement.click();
    }

    // Method to click on another navigation item
    public void clickOnAnotherNavItem() {
        WebElement anotherNavItem = driver.findElement(By.cssSelector("a[href='/innovation']"));
        anotherNavItem.click();
    }
}
package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the Solutions dropdown menu
    @FindBy(css = "a.nav-link.dropdown-toggle[href='#'][id='navlink-_l2']")
    private WebElement solutionsDropdown;

    // Locators for dropdown options
    @FindBy(css = "ul.dropdown-menu[aria-labelledby='navlink-_l2'] a.nav-link-sub")
    private List<WebElement> dropdownOptions;

    // Locator for navigation items
    @FindBy(css = "ul#mnMain a.nav-link")
    private List<WebElement> navigationItems;

    // Method to open the homepage
    public void open() {
        open(url);
    }

    // Method to get a specific dropdown menu
    public WebElement getDropdownMenu(String menuName) {
        if (menuName.equalsIgnoreCase("Solutions")) {
            return solutionsDropdown;
        }
        return null; // Add more conditions if there are other dropdowns
    }

    // Method to get dropdown options
    public List<String> getDropdownOptions() {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        return dropdownOptions.stream().map(WebElement::getText).toList();
    }

    // Method to get a specific option from the dropdown
    public WebElement getOption(String option) {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        return dropdownOptions.stream()
                .filter(e -> e.getText().equalsIgnoreCase(option))
                .findFirst()
                .orElse(null);
    }

    // Method to check if a dropdown is open
    public boolean isDropdownOpen(String dropdownName) {
        if (dropdownName.equalsIgnoreCase("Solutions")) {
            return solutionsDropdown.getAttribute("aria-expanded").equals("true");
        }
        return false;
    }

    // Method to click outside the dropdown
    public void clickOutsideDropdown() {
        // Assuming there's a way to click outside, like clicking on the body
        driver.findElement(By.tagName("body")).click();
    }

    // Method to get a specific navigation item
    public WebElement getNavigationItem(String itemName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(navigationItems));
        return navigationItems.stream()
                .filter(e -> e.getText().equalsIgnoreCase(itemName))
                .findFirst()
                .orElse(null);
    }

    // Method to check if on homepage
    public boolean isOnHomepage() {
        return driver.getCurrentUrl().equals(url);
    }
}
package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locators for navigation bar and dropdown menus
    @FindBy(css = "nav.navbar")
    private WebElement navigationBar;

    @FindBy(css = "ul.navbar-nav > li.nav-item.dropdown")
    private List<WebElement> dropdownMenus;

    @FindBy(css = "ul.dropdown-menu > li > a.nav-link-sub")
    private List<WebElement> dropdownOptions;

    @FindBy(css = "body")
    private WebElement body;

    // Method to open the main page
    public void open() {
        open(url);
    }

    // Method to get a specific dropdown menu by its visible text
    public WebElement getDropdownMenu(String dropdownMenu) {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownMenus));
        for (WebElement menu : dropdownMenus) {
            if (menu.getText().equalsIgnoreCase(dropdownMenu)) {
                return menu;
            }
        }
        return null;
    }

    // Method to get all dropdown options
    public List<String> getDropdownOptions() {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        return dropdownOptions.stream().map(WebElement::getText).toList();
    }

    // Method to get a specific option by its visible text
    public WebElement getOption(String option) {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        for (WebElement opt : dropdownOptions) {
            if (opt.getText().equalsIgnoreCase(option)) {
                return opt;
            }
        }
        return null;
    }

    // Method to click outside the dropdown menu
    public void clickOutsideDropdown() {
        wait.until(ExpectedConditions.visibilityOf(body));
        body.click();
    }

    // Method to check if a dropdown is open
    public boolean isDropdownOpen() {
        return dropdownOptions.stream().anyMatch(WebElement::isDisplayed);
    }

    // Method to click another navigation item
    public void clickAnotherNavItem() {
        // Assuming there's a specific nav item to click, this should be replaced with the actual locator
        WebElement anotherNavItem = dropdownMenus.get(0); // Example: first nav item
        wait.until(ExpectedConditions.elementToBeClickable(anotherNavItem));
        anotherNavItem.click();
    }

    // Method to get the current URL
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // Method to get the section URL based on the section name
    public String getSectionUrl(String section) {
        // This method should map section names to URLs
        switch (section.toLowerCase()) {
            case "company":
                return url + "/company";
            case "solutions":
                return url + "/solutions";
            // Add more cases as needed
            default:
                return url;
        }
    }
}

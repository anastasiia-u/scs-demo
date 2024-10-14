package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locators for dropdown menus
    @FindBy(css = "a.nav-link.dropdown-toggle")
    private List<WebElement> dropdownMenus;

    // Locators for dropdown options
    @FindBy(css = "ul.dropdown-menu a.nav-link-sub")
    private List<WebElement> dropdownOptions;

    // Locator for error message
    @FindBy(css = "div.error-message")
    private WebElement errorMessage;

    public MainPage() {
        // Default constructor
    }

    // Method to open the main page
    public void open() {
        open(url);
    }

    // Method to get a specific dropdown menu by name
    public WebElement getDropdownMenu(String dropdownMenuName) {
        for (WebElement menu : dropdownMenus) {
            if (menu.getText().equalsIgnoreCase(dropdownMenuName)) {
                return menu;
            }
        }
        return null;
    }

    // Method to check if a dropdown menu is visible
    public boolean isDropdownMenuVisible(String dropdownMenuName) {
        WebElement menu = getDropdownMenu(dropdownMenuName);
        return menu != null && menu.isDisplayed();
    }

    // Method to get a specific option by name
    public WebElement getOption(String optionName) {
        for (WebElement option : dropdownOptions) {
            if (option.getText().equalsIgnoreCase(optionName)) {
                return option;
            }
        }
        return null;
    }

    // Method to check if an option is visible
    public boolean isOptionVisible(String optionName) {
        WebElement option = getOption(optionName);
        return option != null && option.isDisplayed();
    }

    // Method to click outside the dropdown menu
    public void clickOutsideDropdownMenu() {
        // Assuming there's a specific area to click outside
        // This needs to be implemented based on the actual HTML structure
    }

    // Method to check if the dropdown menu is closed
    public boolean isDropdownMenuVisible() {
        // Logic to determine if the dropdown menu is closed
        // This needs to be implemented based on the actual HTML structure
        return false;
    }

    // Method to check if an error message is visible
    public boolean isErrorMessageVisible() {
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.isDisplayed();
    }
}
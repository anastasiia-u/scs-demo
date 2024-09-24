package pageobjects;
 
    import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    
public class MainPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locators for dropdown menus
    @FindBy(css = "ul#mnMain > li.nav-item.dropdown > a.nav-link.dropdown-toggle")
    private List<WebElement> dropdownMenus;

    // Locators for dropdown options
    @FindBy(css = "ul.dropdown-menu > li > div > div > a.nav-link-sub")
    private List<WebElement> dropdownOptions;

    public MainPage() {
        // Default constructor
    }

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
        throw new RuntimeException("Dropdown menu not found: " + dropdownMenu);
    }

    // Method to verify dropdown options
    public boolean verifyDropdownOptions(String... options) {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        for (String option : options) {
            boolean found = dropdownOptions.stream()
                    .anyMatch(e -> e.getText().equalsIgnoreCase(option));
            if (!found) {
                return false;
            }
        }
        return true;
    }

    // Method to get a specific dropdown option by its visible text
    public WebElement getDropdownOption(String option) {
        wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
        for (WebElement opt : dropdownOptions) {
            if (opt.getText().equalsIgnoreCase(option)) {
                return opt;
            }
        }
        throw new RuntimeException("Dropdown option not found: " + option);
    }

    // Method to check if a dropdown is open
    public boolean isDropdownOpen(String dropdownMenu) {
        WebElement menu = getDropdownMenu(dropdownMenu);
        return menu.getAttribute("aria-expanded").equals("true");
    }

    // Method to click outside the dropdown to close it
    public void clickOutsideDropdown() {
        // Assuming there's an element to click outside
        WebElement outsideElement = driver.findElement(By.cssSelector("body"));
        outsideElement.click();
    }

    // Method to check if any dropdown is open
    public boolean isDropdownOpen() {
        return dropdownMenus.stream()
                .anyMatch(menu -> menu.getAttribute("aria-expanded").equals("true"));
    }

    // Method to click a non-existent option
    public void clickNonExistentOption() {
        // This method is intentionally left empty to simulate no action
    }

    // Method to get the current page URL
    public String getCurrentPage() {
        return driver.getCurrentUrl();
    }

    // Method to get the previous page URL
    public String getPreviousPage() {
        // Implement logic to track previous page if needed
        return "";
    }
}
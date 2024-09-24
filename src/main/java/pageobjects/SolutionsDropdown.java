package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsDropdown extends BasePage {

    // Locator for dropdown options
    @FindBy(css = "ul.dropdown-menu > li > a.nav-link-sub")
    private List<WebElement> options;

    public SolutionsDropdown() {
        // Default constructor
    }

    public List<WebElement> getOptions() {
        // Returns the list of options in the dropdown
        wait.until(ExpectedConditions.visibilityOfAllElements(options));
        return options;
    }

    public WebElement getOption(String optionName) {
        // Returns a specific option based on the name
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(optionName)) {
                return option;
            }
        }
        return null;
    }

    public boolean isOpen() {
        // Checks if the dropdown is open
        return options.get(0).isDisplayed();
    }
}

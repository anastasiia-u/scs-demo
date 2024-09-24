package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsDropdown extends BasePage {

    // Locator for options in the Solutions dropdown
    @FindBy(css = "ul[aria-labelledby='navlink-_l2'] .nav-link-sub")
    private List<WebElement> dropdownOptions;

    public SolutionsDropdown() {
        // Default constructor
    }

    // Returns the option WebElement based on its name
    public WebElement getOption(String optionName) {
        for (WebElement option : dropdownOptions) {
            if (option.getText().equalsIgnoreCase(optionName)) {
                return option;
            }
        }
        return null;
    }

    // Checks if the dropdown is displayed
    public boolean isDisplayed() {
        return dropdownOptions.get(0).isDisplayed();
    }

    // Selects an invalid option to trigger an error
    public void selectInvalidOption() {
        // Implement logic to select an invalid option
    }
}

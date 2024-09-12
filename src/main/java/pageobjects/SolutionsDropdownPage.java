package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class SolutionsDropdownPage extends BasePage {

    @FindBy(id = "solutions-dropdown")
    private WebElement solutionsDropdown;

    @FindBy(id = "option-automotive")
    private WebElement automotiveOption;

    // Other elements and options can be added here

    public SolutionsDropdownPage() {
        PageFactory.initElements(driver, this);
    }

    public void openSolutionsDropdown() {
        solutionsDropdown.click();
    }

    public void selectAutomotiveOption() {
        automotiveOption.click();
    }

    public void clickOutsideDropdown() {
        // Logic to click outside the dropdown
    }

    public void clickAnotherNavItem() {
        // Logic to click on another navigation item
    }

    public boolean isSolutionsDropdownOpen() {
        // Logic to determine if the dropdown is open
    }

    // Additional methods for other scenarios can be added here
}

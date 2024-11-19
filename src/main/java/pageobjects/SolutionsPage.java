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

    // Locators for the options under the "Solutions" dropdown
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

    // Locator for the "Home" navigation item
    @FindBy(xpath = "//a[@href='/' and contains(@class, 'nav-link')]")
    private WebElement homeNavigationItem;

    public SolutionsPage() {
        // Default constructor
    }

    // Method to open the Solutions page
    public void open() {
        open(url);
    }

    // Method to click on the "Solutions" dropdown menu
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    // Method to select the "Automotive" option
    public void selectAutomotiveOption() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
        automotiveOption.click();
    }

    // Method to click on the "Home" navigation item
    public void clickHomeNavigationItem() {
        wait.until(ExpectedConditions.elementToBeClickable(homeNavigationItem));
        homeNavigationItem.click();
    }

    // Method to check if the dropdown is visible
    public boolean isDropdownVisible() {
        return solutionsDropdown.isDisplayed();
    }

    // Method to check if the dropdown is not visible
    public boolean isDropdownNotVisible() {
        return !solutionsDropdown.isDisplayed();
    }
}
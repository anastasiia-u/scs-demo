package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class NavigationBarPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the "Solutions" dropdown menu
    @FindBy(css = "a#navlink-_l2")
    private WebElement solutionsDropdownMenu;

    // Locators for the options under the "Solutions" dropdown menu
    @FindBy(css = "a#tabnav-_l11")
    private WebElement automotiveOption;

    @FindBy(css = "span#tabnav-_l38")
    private WebElement lifestyleOption;

    @FindBy(css = "a#tabnav-_l17")
    private WebElement consumerOption;

    @FindBy(css = "a#tabnav-_l39")
    private WebElement professionalOption;

    @FindBy(css = "a#tabnav-_l40")
    private WebElement digitalTransformationOption;

    // Locator for clicking outside the dropdown
    @FindBy(css = "body")
    private WebElement outsideDropdown;

    // Locator for another navigation item
    @FindBy(css = "a[href='/innovation']")
    private WebElement anotherNavigationItem;

    public NavigationBarPage() {
        super();
    }

    public void open() {
        open(url);
    }

    public void clickDropdownMenu(String dropdownName) {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdownMenu));
        solutionsDropdownMenu.click();
    }

    public boolean isOptionVisible(String optionName) {
        WebElement option = getOptionElement(optionName);
        wait.until(ExpectedConditions.visibilityOf(option));
        return option.isDisplayed();
    }

    public boolean isDropdownVisible(String dropdownName) {
        return solutionsDropdownMenu.getAttribute("aria-expanded").equals("true");
    }

    public void clickOption(String optionName) {
        WebElement option = getOptionElement(optionName);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }

    public boolean isSectionDisplayed(String sectionName) {
        // Implement logic to verify if the section is displayed based on the section name
        // This might involve checking the URL or a specific element on the section page
        return true; // Placeholder
    }

    public void clickOutsideDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(outsideDropdown));
        outsideDropdown.click();
    }

    public void clickAnotherNavigationItem() {
        wait.until(ExpectedConditions.elementToBeClickable(anotherNavigationItem));
        anotherNavigationItem.click();
    }

    public void clickInvalidOption(String invalidOption) {
        // Attempt to click a non-existent option, which should not navigate away
        // This can be a no-op or log a warning
    }

    public boolean isCurrentPageIntact() {
        // Implement logic to verify the current page is intact
        // This might involve checking the URL or a specific element on the current page
        return true; // Placeholder
    }

    private WebElement getOptionElement(String optionName) {
        switch (optionName.toLowerCase()) {
            case "automotive":
                return automotiveOption;
            case "lifestyle":
                return lifestyleOption;
            case "consumer":
                return consumerOption;
            case "professional":
                return professionalOption;
            case "digital transformation solutions":
                return digitalTransformationOption;
            default:
                throw new IllegalArgumentException("Invalid option name: " + optionName);
        }
    }
}

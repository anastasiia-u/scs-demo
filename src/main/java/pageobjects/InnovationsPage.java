package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InnovationsPage extends BasePage {

    private By dropdownToggle = By.id("innovations-dropdown-toggle");
    private By dropdownMenu = By.id("innovations-dropdown-menu");
    private By dropdownOptions = By.cssSelector("#innovations-dropdown-menu > li");

    public InnovationsPage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        driver.get("https://www.harman.com");
    }

    public void clickOnDropdownMenu(String menuName) {
        WebElement menu = driver.findElement(dropdownToggle);
        if(menu.getText().equals(menuName)) {
            menu.click();
        }
    }

    public boolean verifyDropdownOptions(List<String> expectedOptions) {
        List<WebElement> options = driver.findElements(dropdownOptions);
        return options.stream().allMatch(option -> expectedOptions.contains(option.getText()));
    }

    public void selectDropdownOption(String optionName) {
        List<WebElement> options = driver.findElements(dropdownOptions);
        options.stream().filter(option -> option.getText().equals(optionName)).findFirst().ifPresent(WebElement::click);
    }

    public boolean isOnSectionPage(String sectionName) {
        return driver.getCurrentUrl().contains(sectionName.toLowerCase());
    }

    public void clickOutsideDropdown() {
        driver.findElement(By.tagName("body")).click();
    }

    public boolean isDropdownOpen() {
        return driver.findElement(dropdownMenu).isDisplayed();
    }

    public void hoverOverDropdownMenu(String menuName) {
        // This method needs to be implemented based on the page's behavior
    }

    public boolean isDropdownOptionsVisible() {
        // This method needs to be implemented based on the page's behavior
        return false;
    }
}
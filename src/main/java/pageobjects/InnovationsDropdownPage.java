package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InnovationsDropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("innovations-dropdown");
    private By options = By.className("dropdown-option");

    public InnovationsDropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDropdown() {
        driver.findElement(dropdown).click();
    }

    public void closeDropdown() {
        driver.findElement(dropdown).click(); // Assuming clicking the dropdown again closes it
    }

    public List<WebElement> getOptions() {
        return driver.findElements(options);
    }

    public void selectOption(String optionName) {
        List<WebElement> optionsList = getOptions();
        for (WebElement option : optionsList) {
            if (option.getText().equals(optionName)) {
                option.click();
                break;
            }
        }
    }

    public boolean isDropdownVisible() {
        return driver.findElement(dropdown).isDisplayed();
    }

    public boolean isOptionVisible(String optionName) {
        List<WebElement> optionsList = getOptions();
        for (WebElement option : optionsList) {
            if (option.getText().equals(optionName)) {
                return true;
            }
        }
        return false;
    }
}
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By innovationsDropdownLocator = By.id("innovations-dropdown");
    private By outsideAreaLocator = By.id("outside-area");
    private By navigationBarLocator = By.id("nav-bar");
    private By automotiveOptionLocator = By.xpath("//a[text()='Automotive']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("BASE_URL"); // BASE_URL needs to be replaced with the actual URL
    }

    public void clickInnovationsDropdown() {
        driver.findElement(innovationsDropdownLocator).click();
    }

    public void clickOutsideDropdownArea() {
        driver.findElement(outsideAreaLocator).click();
    }

    public void clickOnAnotherItemInNavigationBar() {
        driver.findElement(navigationBarLocator).click(); // This might need adjustments to target a specific item
    }

    public void clickOnOptionAutomotive() {
        driver.findElement(automotiveOptionLocator).click();
    }

    public boolean isOptionVisible(String option) {
        By optionLocator = By.xpath("//a[text()='" + option + "']");
        return driver.findElement(optionLocator).isDisplayed();
    }
}

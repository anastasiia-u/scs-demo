package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationDropdownPageObject {
    WebDriver driver;
    
    @FindBy(id = "navigationDropdown")
    WebElement navigationDropdown;
    
    public NavigationDropdownPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void hoverOverNavigationDropdown() {
        // Code to hover over the navigation dropdown
    }
    
    public void clickItemInNavigationDropdown() {
        // Code to click an item in the navigation dropdown
    }
}
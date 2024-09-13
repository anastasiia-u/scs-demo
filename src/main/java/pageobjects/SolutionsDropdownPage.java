package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SolutionsDropdownPage extends BasePage {

    private final String url = "https://www.harman.com";
    
    @FindBy(css = "a#navlink-_l2")
    private WebElement solutionsDropdown;
    
    @FindBy(css = "div#navbarNav ul.dropdown-menu a.nav-link-sub")
    private List<WebElement> dropdownOptions;
    
    // Constructor initializes the WebDriver and PageFactory elements.
    public SolutionsDropdownPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    public void open() {
        getDriver().get(url);
    }
    
    public void clickSolutionsDropdown() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }
    
    // Method to check if all options are visible and return their visibility status.
    public boolean areAllOptionsVisible() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        try {
            for (WebElement option : dropdownOptions) {
                wait.until(ExpectedConditions.visibilityOf(option));
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    // Method to click on a dropdown option by its visible text.
    public void clickDropdownOption(String optionText) {
        for (WebElement option : dropdownOptions) {
            if (option.getText().equalsIgnoreCase(optionText)) {
                option.click();
                break;
            }
        }
    }
    
    // Method to validate the URL after navigation.
    public boolean isUrlAsExpected(String expectedUrl) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        return getDriver().getCurrentUrl().equalsIgnoreCase(expectedUrl);
    }
}
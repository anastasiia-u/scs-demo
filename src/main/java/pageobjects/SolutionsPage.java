package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the 'Solutions' dropdown toggle
    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdownToggle;

    // Locators for the items within the 'Solutions' dropdown
    @FindBy(css = "ul[aria-labelledby='navlink-_l2'] .nav-link-sub")
    private List<WebElement> solutionsDropdownItems;

    public SolutionsPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to open the HARMAN homepage
    public void open() {
        driver.get(url);
    }

    // Method to click on the 'Solutions' dropdown to expand it
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdownToggle));
        solutionsDropdownToggle.click();
    }

    // Method to get the text of all items in the 'Solutions' dropdown
    public List<String> getSolutionsDropdownItemsText() {
        wait.until(ExpectedConditions.visibilityOfAllElements(solutionsDropdownItems));
        return solutionsDropdownItems.stream().map(WebElement::getText).toList();
    }

    // Method to select an item from the 'Solutions' dropdown by visible text
    public void selectSolutionsDropdownItem(String itemText) {
        wait.until(ExpectedConditions.visibilityOfAllElements(solutionsDropdownItems));
        for (WebElement item : solutionsDropdownItems) {
            if (item.getText().equalsIgnoreCase(itemText)) {
                item.click();
                break;
            }
        }
    }
}

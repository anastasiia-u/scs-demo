// HarmanMainPage.java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HarmanMainPage extends BasePage {

    @FindBy(css = "uniqueSelectorForSolutionsDropdown")
    private WebElement solutionsDropdown;

    public HarmanMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isSolutionsDropdownVisible() {
        return solutionsDropdown.isDisplayed();
    }

    // Additional getter methods for other elements
}
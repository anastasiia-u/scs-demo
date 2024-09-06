import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HarmanPage extends BasePage {

    @FindBy(css = "css-selector-for-solutions-dropdown")
    private WebElement solutionsDropdown;

    @FindBy(xpath = "xpath-for-automotive-option")
    private WebElement automotiveOption;

    public HarmanPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSolutionsDropdown() {
        click(solutionsDropdown);
    }

    public void clickAutomotiveOption() {
        click(automotiveOption);
    }

    // Other methods for interacting with the dropdown options
}

// Note: The actual CSS selectors and XPaths need to be adjusted based on the actual web page structure.
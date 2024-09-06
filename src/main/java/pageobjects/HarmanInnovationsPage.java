import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HarmanInnovationsPage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(how = How.CSS, using = "nav.main-navigation")
    private WebElement mainNavigationBar;

    @FindBy(how = How.CSS, using = "#solutions-dropdown")
    private WebElement solutionsDropdown;

    @FindBy(how = How.CSS, using = "#automotive-option")
    private WebElement automotiveOption;

    public HarmanInnovationsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get("https://www.harman.com");
    }

    public void clickInnovationsDropdown() {
        solutionsDropdown.click();
    }

    public boolean isOptionVisible(String option) {
        // Implementation needed
        return false;
    }

    public void selectOption(String option) {
        // Implementation needed
    }

    public void clickOutsideDropdown() {
        // Implementation needed
    }

    // Additional methods as per scenarios

}
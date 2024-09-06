import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnovationsDropdownPage {

    private WebDriver driver;

    @FindBy(id = "innovations-dropdown")
    private WebElement innovationsDropdown;

    @FindBy(linkText = "Automotive")
    private WebElement automotiveOption;

    public InnovationsDropdownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.harman.com");
    }

    public void clickInnovationsDropdown() {
        innovationsDropdown.click();
    }

    public void selectAutomotiveOption() {
        automotiveOption.click();
    }

    public boolean isDropdownVisible() {
        return innovationsDropdown.isDisplayed();
    }

    // Additional methods to interact with the page can be added here
}
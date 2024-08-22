import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateDropdownFunctionalityInTheNavigationBarStepDefinitions {
    WebDriver driver;

    @FindBy(id = "about-us")
    private WebElement aboutUsMenu;

    @FindBy(id = "careers")
    private WebElement careersMenu;

    public ValidateDropdownFunctionalityInTheNavigationBarStepDefinitions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAboutUsMenu() {
        aboutUsMenu.click();
    }

    public void clickOnCareersMenu() {
        careersMenu.click();
    }
}
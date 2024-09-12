package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HarmanHomePage extends BasePage {

    private final String url = "https://www.harman.com";
    private final WebDriverWait wait;

    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    @FindBy(linkText = "Automotive")
    private WebElement automotiveOption;

    public HarmanHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        open(url);
    }

    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    public void selectOption(String optionName) {
        switch (optionName.toLowerCase()) {
            case "automotive":
                wait.until(ExpectedConditions.elementToBeClickable(automotiveOption));
                automotiveOption.click();
                break;
            default:
                throw new IllegalArgumentException("Option '" + optionName + "' not recognized.");
        }
    }
}

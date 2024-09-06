package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;

public class HarmanHomePage extends BasePage {

    private final String url = "https://www.harman.com";

    @FindBy(css = "a#navlink-_l2")
    private WebElement solutionsDropdown;

    @FindBy(css = "a[href='/automotive']")
    private WebElement automotiveOption;
    
    public HarmanHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        open(url);
    }

    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }

    public void selectAutomotiveOption() {
        wait.until(ExpectedConditions.visibilityOf(automotiveOption));
        automotiveOption.click();
    }
}

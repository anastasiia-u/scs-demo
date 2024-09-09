package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HarmanMainPage extends BasePage {

    private final String url = "https://www.harman.com";

    @FindBy(xpath = "//nav[@id='navbarXLmain']//a[@id='navlink-_l2']")
    private WebElement solutionsDropdownMenu;

    @FindBy(xpath = "//a[@href='/automotive']")
    private WebElement automotiveOption;

    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement lifestyleOption;

    public HarmanMainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
    }

    public void clickSolutionsDropdown() {
        solutionsDropdownMenu.click();
    }

    public WebElement getSolutionsDropdownMenu() {
        return solutionsDropdownMenu;
    }

    public WebElement getAutomotiveOption() {
        return automotiveOption;
    }

    public WebElement getLifestyleOption() {
        return lifestyleOption;
    }
}

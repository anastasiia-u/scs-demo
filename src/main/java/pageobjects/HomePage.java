package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private final String url = "https://www.harman.com";

    @FindBy(xpath = "//a[@id='navlink-_l2']")
    private WebElement solutionsDropdown;

    @FindBy(xpath = "//a[@id='tabnav-_l11']")
    private WebElement automotiveOption;

    @FindBy(xpath = "//a[@id='tabnav-_l17' and contains(@href, '/lifestyle')]")
    private WebElement consumerOption;

    @FindBy(xpath = "//a[contains(@href, 'pro.harman.com')]")
    private WebElement professionalOption;

    @FindBy(xpath = "//a[contains(@href, 'services.harman.com')]")
    private WebElement digitalTransformationSolutionsOption;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        open(url);
    }

    public void clickSolutionsDropdown() {
        solutionsDropdown.click();
    }

    public WebElement getAutomotiveOption() {
        return automotiveOption;
    }

    public WebElement getConsumerOption() {
        return consumerOption;
    }

    public WebElement getProfessionalOption() {
        return professionalOption;
    }

    public WebElement getDigitalTransformationSolutionsOption() {
        return digitalTransformationSolutionsOption;
    }

    public boolean isSolutionsDropdownDisplayed() {
        return solutionsDropdown.isDisplayed();
    }
}
package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final String url = "https://news.sci-corp.com";

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/']")
    private WebElement logoSciCorp;

    @FindBy(xpath = "//a[contains(@href, 'about') and contains(@class, 'dropdown-toggle')]")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "//a[contains(@href, 'careers') and contains(@class, 'dropdown-toggle')]")
    private WebElement careersDropdown;

    @FindBy(xpath = "//a[contains(@href, 'investors') and contains(@class, 'dropdown-toggle')]")
    private WebElement investorsDropdown;

    @FindBy(xpath = "//a[contains(@href, 'partners') and contains(@class, 'dropdown-toggle')]")
    private WebElement partnerWithUsDropdown;

    @FindBy(xpath = "//a[contains(@href, 'media') and contains(@class, 'dropdown-toggle')]")
    private WebElement mediaDropdown;

    public MainPage(WebDriver driver) {
        super(driver);
        initElements(getDriver());
    }

    public void open() {
        getDriver().get(url);
    }

    public WebElement getLogoSciCorp() {
        return logoSciCorp;
    }

    public WebElement getAboutUsDropdown() {
        return aboutUsDropdown;
    }

    public WebElement getCareersDropdown() {
        return careersDropdown;
    }

    public WebElement getInvestorsDropdown() {
        return investorsDropdown;
    }

    public WebElement getPartnerWithUsDropdown() {
        return partnerWithUsDropdown;
    }

    public WebElement getMediaDropdown() {
        return mediaDropdown;
    }
}

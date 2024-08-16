package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarPage extends BasePage {

    private final String url = "https://news.sci-corp.com";

    @FindBy(css = "nav.nav-main-bar")
    private WebElement mainNavigationBar;

    @FindBy(xpath = "//a[contains(@href, '/about/') and contains(@class, 'dropdown-toggle')]")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "//a[contains(@href, '/careers/') and contains(@class, 'dropdown-toggle')]")
    private WebElement careersDropdown;

    @FindBy(xpath = "//a[contains(@href, 'http://investors.sci-corp.com/') and contains(@class, 'dropdown-toggle')]")
    private WebElement investorsDropdown;

    @FindBy(xpath = "//a[contains(@href, '/partners/') and contains(@class, 'dropdown-toggle')]")
    private WebElement partnerWithUsDropdown;

    @FindBy(xpath = "//a[contains(@href, '#') and contains(text(), 'media')]")
    private WebElement mediaDropdown;

    public NavigationBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
    }

    public WebElement getMainNavigationBar() {
        return mainNavigationBar;
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

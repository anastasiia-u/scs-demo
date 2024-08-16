package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {

    private String url = "https://news.sci-corp.com";

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[@class='nav-main-item nav-main-list-trigger']")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//a[contains(@href, '/about') and contains(@class, 'dropdown-toggle')]")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "//a[contains(@href, '/careers') and contains(@class, 'dropdown-toggle')]")
    private WebElement careersDropdown;

    @FindBy(xpath = "//a[contains(@href, 'investors') and contains(@class, 'dropdown-toggle')]")
    private WebElement investorsDropdown;

    @FindBy(xpath = "//a[contains(@href, '/partners') and contains(@class, 'dropdown-toggle')]")
    private WebElement partnerWithUsDropdown;

    @FindBy(xpath = "//a[contains(@href, 'overview') and contains(@class, 'dropdown-toggle')]")
    private WebElement mediaDropdown;

    @FindBy(xpath = "//input[@type='text' and contains(@placeholder, 'Search by country')]")
    private WebElement searchInput;

    @FindBy(xpath = "//button[span[text()='Search']]")
    private WebElement searchButton;

    public NewsPage open() {
        getDriver().get(url);
        return this;
    }

    public WebElement getHomeLink() {
        return homeLink;
    }

    public WebElement getHamburgerMenu() {
        return hamburgerMenu;
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

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
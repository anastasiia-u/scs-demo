package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsHomePage extends BasePage {

    private String url = "https://news.sci-corp.com";

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/']")
    private WebElement logoLink;

    @FindBy(xpath = "//a[@class='nav-main-item nav-main-list-trigger']")
    private WebElement hamburgerMenu;

    // Main navigation items
    @FindBy(xpath = "//a[contains(text(), 'about us')]")
    private WebElement aboutUsNavItem;

    @FindBy(xpath = "//a[contains(text(), 'careers')]")
    private WebElement careersNavItem;

    @FindBy(xpath = "//a[contains(text(), 'investors')]")
    private WebElement investorsNavItem;

    @FindBy(xpath = "//a[contains(text(), 'partner with us')]")
    private WebElement partnerNavItem;

    @FindBy(xpath = "//a[contains(text(), 'media')]")
    private WebElement mediaNavItem;

    // Dropdown elements for "About Us"
    @FindBy(xpath = "//a[contains(@href, 'about') and text()='about sci']")
    private WebElement aboutSciDropdown;

    @FindBy(xpath = "//a[contains(@href, 'what-we-do')]")
    private WebElement whatWeDoDropdown;

    @FindBy(xpath = "//a[contains(@href, 'our-people')]")
    private WebElement ourPeopleDropdown;

    @FindBy(xpath = "//a[contains(@href, 'responsibility')]")
    private WebElement corporateResponsibilityDropdown;

    @FindBy(xpath = "//a[contains(@href, 'our-brands')]")
    private WebElement ourBrandsDropdown;

    @FindBy(xpath = "//a[contains(@href, 'history')]")
    private WebElement historyDropdown;

    @FindBy(xpath = "//a[contains(@href, 'board-of-directors')]")
    private WebElement boardOfDirectorsDropdown;

    @FindBy(xpath = "//a[contains(@href, 'officers')]")
    private WebElement officersDropdown;

    // Add other dropdown elements as needed

    public NewsHomePage open() {
        getDriver().get(url);
        return this;
    }

    public WebElement getLogoLink() {
        return logoLink;
    }

    public WebElement getHamburgerMenu() {
        return hamburgerMenu;
    }

    public WebElement getAboutUsNavItem() {
        return aboutUsNavItem;
    }

    public WebElement getCareersNavItem() {
        return careersNavItem;
    }

    public WebElement getInvestorsNavItem() {
        return investorsNavItem;
    }

    public WebElement getPartnerNavItem() {
        return partnerNavItem;
    }

    public WebElement getMediaNavItem() {
        return mediaNavItem;
    }

    // Add getters for dropdown elements as needed
    public WebElement getAboutSciDropdown() {
        return aboutSciDropdown;
    }

    public WebElement getWhatWeDoDropdown() {
        return whatWeDoDropdown;
    }

    // ... continue with other dropdown getters
}

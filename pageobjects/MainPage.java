package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    private final String url = "https://news.sci-corp.com";

    @FindBy(xpath = "/html/body/div/header/div/nav/ul/li[1]/a")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "/html/body/div/header/div/nav/ul/li[2]/a")
    private WebElement careersDropdown;

    @FindBy(xpath = "/html/body/div/header/div/nav/ul/li[3]/a")
    private WebElement investorsDropdown;

    @FindBy(xpath = "/html/body/div/header/div/nav/ul/li[4]/a")
    private WebElement partnerWithUsDropdown;

    @FindBy(xpath = "/html/body/div/header/div/nav/ul/li[5]/a")
    private WebElement mediaDropdown;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
    }

    public WebElement getAboutUsDropdown() { return aboutUsDropdown; }
    public WebElement getCareersDropdown() { return careersDropdown; }
    public WebElement getInvestorsDropdown() { return investorsDropdown; }
    public WebElement getPartnerWithUsDropdown() { return partnerWithUsDropdown; }
    public WebElement getMediaDropdown() { return mediaDropdown; }

    public void clickAboutUsDropdown() {
        getAboutUsDropdown().click();
    }
}
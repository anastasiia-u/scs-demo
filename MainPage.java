package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    private String url = "https://news.sci-corp.com";

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/about/#']")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/careers/#']")
    private WebElement careersDropdown;

    @FindBy(xpath = "//a[@href='http://investors.sci-corp.com/#']")
    private WebElement investorsDropdown;

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/partners/#']")
    private WebElement partnerWithUsDropdown;

    @FindBy(xpath = "//li[@class='nav-main-item'][5]/a")
    private WebElement mediaDropdown;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
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
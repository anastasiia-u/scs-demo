package pageobjects;
 
    import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    
package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    private final String url = "https://news.sci-corp.com";

    @FindBy(xpath = "//a[@href='https://www.dignitymemorial.com/']")
    private WebElement dignityMemorialLink;

    @FindBy(xpath = "//a[@href='https://www.sci-corp.com/contact-us']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//a[contains(@href, '/about') and contains(@class, 'dropdown-toggle')]")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "//a[contains(@href, '/careers') and contains(@class, 'dropdown-toggle')]")
    private WebElement careersDropdown;

    @FindBy(xpath = "//a[contains(@href, 'http://investors.sci-corp.com') and contains(@class, 'dropdown-toggle')]")
    private WebElement investorsDropdown;

    @FindBy(xpath = "//a[contains(@href, '/partner') and contains(@class, 'dropdown-toggle')]")
    private WebElement partnerWithUsDropdown;

    @FindBy(xpath = "//div[@class='dropdown-menu plan-dropdown']/a[contains(@href, '/about')]")
    private WebElement aboutSciLink;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
    }

    // Getters...
}

}
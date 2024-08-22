package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarPageObject {
    WebDriver driver;

    @FindBy(id = "navigation-bar")
    private WebElement navigationBar;

    @FindBy(xpath = "//div[@class='dropdown about-us']")
    private WebElement aboutUsDropdown;

    @FindBy(xpath = "//div[@class='dropdown careers']")
    private WebElement careersDropdown;

    public NavigationBarPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAboutUsDropdown() {
        aboutUsDropdown.click();
    }

    public void openCareersDropdown() {
        careersDropdown.click();
    }
}
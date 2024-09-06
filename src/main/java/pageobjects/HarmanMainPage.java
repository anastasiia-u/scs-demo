package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class HarmanMainPage {

    private WebDriver driver;

    @FindBy(xpath = "//xpath-to-innovations-dropdown")
    private WebElement innovationsDropdown;

    @FindBy(xpath = "//xpath-to-automotive-option")
    private WebElement automotiveOption;

    public HarmanMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openMainPage() {
        driver.get("http://www.harman.com");
    }

    public void clickInnovationsDropdown() {
        innovationsDropdown.click();
    }

    public boolean areInnovationsOptionsDisplayed() {
        // implementation to verify options are displayed
        return true;
    }

    public void selectAutomotiveOption() {
        automotiveOption.click();
    }

    public boolean isAutomotiveSectionDisplayed() {
        // implementation to verify Automotive section is displayed
        return true;
    }

    public void clickOutsideDropdown() {
        // implementation to click outside the dropdown
    }

    public boolean isInnovationsDropdownDisplayed() {
        // implementation to verify if dropdown is still displayed
        return false;
    }
}
package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    // Locator for the 'Solutions' dropdown toggle
    @FindBy(css = "a.nav-link.dropdown-toggle[href='#']")
    private WebElement solutionsDropdownToggle;

    // Locator for the 'Solutions' dropdown menu
    @FindBy(css = "ul.dropdown-menu[aria-labelledby='navlink-_l2']")
    private WebElement solutionsDropdownMenu;

    // Locators for the dropdown items
    @FindBy(css = "a.nav-link-sub[href='/automotive']")
    private WebElement automotiveLink;

    @FindBy(css = "span.nav-link-sub[id='tabnav-_l38']")
    private WebElement lifestyleLink;

    @FindBy(css = "a.nav-link-sub[href='/lifestyle']")
    private WebElement consumerLink;

    @FindBy(css = "a.nav-link-sub[href='https://pro.harman.com']")
    private WebElement professionalLink;

    @FindBy(css = "a.nav-link-sub[href='https://services.harman.com']")
    private WebElement digitalTransformationLink;

    // Method to open the page
    public void open() {
        open(url);
    }

    // Method to click the 'Solutions' dropdown toggle
    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdownToggle));
        solutionsDropdownToggle.click();
    }

    // Method to check if the dropdown menu is displayed
    public boolean isSolutionsDropdownDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdownMenu));
        return solutionsDropdownMenu.isDisplayed();
    }

    // Method to click on the 'Automotive' link
    public void clickAutomotiveLink() {
        wait.until(ExpectedConditions.elementToBeClickable(automotiveLink));
        automotiveLink.click();
    }

    // Method to click on the 'Lifestyle' link
    public void clickLifestyleLink() {
        wait.until(ExpectedConditions.elementToBeClickable(lifestyleLink));
        lifestyleLink.click();
    }

    // Method to click on the 'Consumer' link
    public void clickConsumerLink() {
        wait.until(ExpectedConditions.elementToBeClickable(consumerLink));
        consumerLink.click();
    }

    // Method to click on the 'Professional' link
    public void clickProfessionalLink() {
        wait.until(ExpectedConditions.elementToBeClickable(professionalLink));
        professionalLink.click();
    }

    // Method to click on the 'Digital Transformation Solutions' link
    public void clickDigitalTransformationLink() {
        wait.until(ExpectedConditions.elementToBeClickable(digitalTransformationLink));
        digitalTransformationLink.click();
    }
}

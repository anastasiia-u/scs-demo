package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class SolutionsPage extends BasePage {

    private final String url = "https://www.harman.com";

    @FindBy(css = "a.nav-link.dropdown-toggle")
    private WebElement solutionsDropdown;

    @FindBy(css = "ul.dropdown-menu [href='/automotive']")
    private WebElement automotiveOption;

    @FindBy(css = "ul.dropdown-menu [href='/lifestyle']")
    private WebElement lifestyleOption;

    @FindBy(css = "ul.dropdown-menu [href='/consumer']")
    private WebElement consumerOption;

    @FindBy(css = "ul.dropdown-menu [href='/professional']")
    private WebElement professionalOption;

    @FindBy(css = "ul.dropdown-menu [href='https://services.harman.com']")
    private WebElement digitalTransformationSolutionsOption;

    @FindBy(css = "body")
    private WebElement pageBody;

    public SolutionsPage() {
        // Constructor is empty as the initialization of elements is handled in the BasePage.
    }

    public void open() {
        driver.get(url);
    }

    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown)).click();
    }

    public void clickOutsideDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(pageBody)).click();
    }

    public void clickOption(String option) {
        switch (option) {
            case "Automotive":
                wait.until(ExpectedConditions.visibilityOf(automotiveOption)).click();
                break;
            case "Lifestyle":
                wait.until(ExpectedConditions.visibilityOf(lifestyleOption)).click();
                break;
            case "Consumer":
                wait.until(ExpectedConditions.visibilityOf(consumerOption)).click();
                break;
            case "Professional":
                wait.until(ExpectedConditions.visibilityOf(professionalOption)).click();
                break;
            case "Digital Transformation Solutions":
                wait.until(ExpectedConditions.visibilityOf(digitalTransformationSolutionsOption)).click();
                break;
            default:
                throw new IllegalArgumentException("Option '" + option + "' not found in Solutions dropdown");
        }
    }

    public boolean isOptionVisible(String option) {
        switch (option) {
            case "Automotive":
                return automotiveOption.isDisplayed();
            case "Lifestyle":
                return lifestyleOption.isDisplayed();
            case "Consumer":
                return consumerOption.isDisplayed();
            case "Professional":
                return professionalOption.isDisplayed();
            case "Digital Transformation Solutions":
                return digitalTransformationSolutionsOption.isDisplayed();
            default:
                return false;
        }
    }
}
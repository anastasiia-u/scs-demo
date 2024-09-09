package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnovationsPage extends BasePage {

    @FindBy(id = "innovations-dropdown")
    private WebElement dropdownMenu;

    @FindBy(linkText = "Automotive")
    private WebElement automotiveOption;

    @FindBy(linkText = "Lifestyle")
    private WebElement lifestyleOption;

    @FindBy(linkText = "Consumer")
    private WebElement consumerOption;

    @FindBy(linkText = "Professional")
    private WebElement professionalOption;

    @FindBy(linkText = "Digital Transformation Solutions")
    private WebElement digitalTransformationSolutionsOption;

    public InnovationsPage() {
        PageFactory.initElements(driver, this);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void clickOnDropdownMenu() {
        dropdownMenu.click();
    }

    public void selectOption(String option) {
        switch (option) {
            case "Automotive":
                automotiveOption.click();
                break;
            case "Lifestyle":
                lifestyleOption.click();
                break;
            case "Consumer":
                consumerOption.click();
                break;
            case "Professional":
                professionalOption.click();
                break;
            case "Digital Transformation Solutions":
                digitalTransformationSolutionsOption.click();
                break;
            default:
                throw new IllegalArgumentException("Option '" + option + "' not recognized.");
        }
    }

    public boolean isDropdownMenuVisible() {
        return dropdownMenu.isDisplayed();
    }

    public boolean isOptionVisible(String option) {
        WebElement optionElement = null;
        switch (option) {
            case "Automotive":
                optionElement = automotiveOption;
                break;
            case "Lifestyle":
                optionElement = lifestyleOption;
                break;
            case "Consumer":
                optionElement = consumerOption;
                break;
            case "Professional":
                optionElement = professionalOption;
                break;
            case "Digital Transformation Solutions":
                optionElement = digitalTransformationSolutionsOption;
                break;
        }
        return optionElement != null && optionElement.isDisplayed();
    }

}
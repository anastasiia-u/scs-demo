package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HarmanMainPage extends BasePage {

    private String url = "https://www.harman.com";

    @FindBy(id = "navlink-_l2")
    private WebElement solutionsDropdown;

    @FindBy(id = "tabnav-_l11")
    private WebElement automotiveOption;

    @FindBy(id = "tabnav-_l17")
    private WebElement consumerOption;

    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement lifestyleOption;

    @FindBy(xpath = "//a[@href='https://pro.harman.com']")
    private WebElement professionalOption;

    @FindBy(xpath = "//a[@href='https://services.harman.com']")
    private WebElement digitalTransformationOption;

    public HarmanMainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
    }

    public void clickSolutionsDropdown() {
        solutionsDropdown.click();
    }

    public void selectOption(String option) {
        switch (option.toLowerCase()) {
            case "automotive":
                automotiveOption.click();
                break;
            case "consumer":
                consumerOption.click();
                break;
            case "lifestyle":
                lifestyleOption.click();
                break;
            case "professional":
                professionalOption.click();
                break;
            case "digital transformation":
                digitalTransformationOption.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid option: " + option);
        }
    }

    // Getters for elements to be used in assertions
    public WebElement getSolutionsDropdown() {
        return solutionsDropdown;
    }

    public WebElement getAutomotiveOption() {
        return automotiveOption;
    }

    // Similar getters for other options...
}
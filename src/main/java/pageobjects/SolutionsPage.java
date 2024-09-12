package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsPage extends BasePage {

    private String url = "https://www.harman.com";

    @FindBy(id = "navbarXLmain")
    private WebElement navbar;

    @FindBy(xpath = "//a[@id='navlink-_l2']")
    private WebElement solutionsDropdown;

    @FindBy(xpath = "//a[@href='/automotive']")
    private WebElement automotiveOption;
    @FindBy(xpath = "//a[@href='/lifestyle']")
    private WebElement lifestyleOption;
    @FindBy(xpath = "//a[@href='/lifestyle/consumer']")
    private WebElement consumerOption;
    @FindBy(xpath = "//a[@href='https://pro.harman.com']")
    private WebElement professionalOption;
    @FindBy(xpath = "//a[@href='https://services.harman.com']")
    private WebElement digitalTransformationOption;

    public SolutionsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(url);
    }

    public void clickSolutionsDropdown() {
        solutionsDropdown.click();
    }

    public void clickOption(String option) {
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
            case "Digital Transformation":
                digitalTransformationOption.click();
                break;
            default:
                System.out.println("Option not found");
        }
    }

    // Additional methods for other scenarios can be implemented here
}
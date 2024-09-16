package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsPage extends BasePage {

    @FindBy(xpath = "//a[@id='navlink-_l2']")
    private WebElement solutionsDropdown;

    @FindBy(xpath = "//a[@id='tabnav-_l11']")
    private WebElement automotiveOption;
    // Additional FindBy annotations for other options

    public SolutionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openSolutionsDropdown() {
        solutionsDropdown.click();
    }

    public boolean isOptionPresent(String option) {
        // Implementation to check if a specific option is present based on its locator
    }

    // Additional methods for other scenarios
}
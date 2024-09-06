package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnovationsDropdownPage {

    @FindBy(id = "innovationsDropdown")
    private WebElement innovationsDropdown;

    @FindBy(id = "optionAutomotive")
    private WebElement optionAutomotive;

    @FindBy(id = "optionLifestyle")
    private WebElement optionLifestyle;

    @FindBy(id = "optionConsumer")
    private WebElement optionConsumer;

    @FindBy(id = "optionProfessional")
    private WebElement optionProfessional;

    @FindBy(id = "optionDigitalTransformationSolutions")
    private WebElement optionDigitalTransformationSolutions;

    public InnovationsDropdownPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openInnovationsDropdown() {
        innovationsDropdown.click();
    }

    public boolean isOptionVisible(String option) {
        switch (option) {
            case "Automotive":
                return optionAutomotive.isDisplayed();
            case "Lifestyle":
                return optionLifestyle.isDisplayed();
            case "Consumer":
                return optionConsumer.isDisplayed();
            case "Professional":
                return optionProfessional.isDisplayed();
            case "Digital Transformation Solutions":
                return optionDigitalTransformationSolutions.isDisplayed();
            default:
                return false;
        }
    }

    public void clickOutsideDropdown() {
        // Implement click outside the dropdown
    }

    public void navigateToOption(String option) {
        // Implement navigation to the option
    }
}

// Note: The IDs used in FindBy annotations are placeholders and should be replaced with actual element IDs from the web application.
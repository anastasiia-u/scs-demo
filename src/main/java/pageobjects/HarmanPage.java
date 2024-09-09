package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class HarmanPage extends BasePage {

    private String url = "https://www.harman.com";

    @FindBy(css = "a#navlink-_l2")
    private WebElement solutionsDropdown;

    @FindBy(css = "div.dropdown-menu[aria-labelledby='navlink-_l2'] a")
    private List<WebElement> solutionsOptions;

    public HarmanPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        open(url);
    }

    public void clickSolutionsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
        solutionsDropdown.click();
    }
    
    public void clickOptionInSolutionsDropdown(String option) {
        wait.until(ExpectedConditions.visibilityOf(solutionsDropdown));
        solutionsOptions.stream()
                .filter(e -> e.getText().equalsIgnoreCase(option))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Option not found: " + option))
                .click();
    }

    public boolean isSolutionsDropdownExpanded() {
        return solutionsDropdown.getAttribute("aria-expanded").equals("true");
    }

    public void clickOutsideDropdown() {
        getDriver().findElement(By.tagName("body")).click();
    }
}
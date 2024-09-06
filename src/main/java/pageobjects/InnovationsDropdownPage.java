import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InnovationsDropdownPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By innovationsDropdown = By.cssSelector("#innovations-dropdown");
    private By optionAutomotive = By.cssSelector("#auto-option");
    private By optionLifestyle = By.cssSelector("#lifestyle-option");
    private By optionConsumer = By.cssSelector("#consumer-option");
    private By optionProfessional = By.cssSelector("#pro-option");
    private By optionDigitalTransformation = By.cssSelector("#digital-transformation-option");

    public InnovationsDropdownPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openHomePage() {
        driver.get("https://www.harman.com");
    }

    public void clickInnovationsDropdown() {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(innovationsDropdown));
        dropdown.click();
    }

    public boolean isOptionVisible(String optionText) {
        By optionBy = By.xpath("//a[text()='" + optionText + "']");
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(optionBy));
        return option.isDisplayed();
    }

    public void clickOption(String optionText) {
        By optionBy = By.xpath("//a[text()='" + optionText + "']");
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionBy));
        option.click();
    }

    public void closeDropdownByClickingOutside() {
        By outsideArea = By.cssSelector("#main");
        WebElement outside = wait.until(ExpectedConditions.elementToBeClickable(outsideArea));
        outside.click();
    }

    public void closeDropdownByInteractingWithOtherNavItem(String navItemText) {
        By navItemBy = By.xpath("//a[text()='" + navItemText + "']");
        WebElement navItem = wait.until(ExpectedConditions.elementToBeClickable(navItemBy));
        navItem.click();
    }

}
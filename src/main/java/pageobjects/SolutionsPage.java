package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SolutionsPage {

    private WebDriver driver;

    public SolutionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage() {
        driver.get("https://www.harman.com");
    }

    public void clickSolutionsDropdown() {
        WebElement solutionsDropdown = driver.findElement(By.cssSelector(".solutions-dropdown"));
        solutionsDropdown.click();
    }

    public void clickOption(String option) {
        WebElement optionElement = driver.findElement(By.xpath("//a[text()='" + option + "']"));
        optionElement.click();
    }

    public boolean isOptionVisible(String option) {
        WebElement optionElement = driver.findElement(By.xpath("//a[text()='" + option + "']"));
        return optionElement.isDisplayed();
    }

    public void clickOutsideDropdown() {
        WebElement outsideArea = driver.findElement(By.cssSelector("body"));
        outsideArea.click();
    }

    public String getFailureMessage() {
        WebElement failureMessage = driver.findElement(By.cssSelector(".error-message"));
        return failureMessage.getText();
    }
}
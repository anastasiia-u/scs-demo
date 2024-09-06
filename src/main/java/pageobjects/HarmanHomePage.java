package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HarmanHomePage extends BasePage {

 private String url = "https://www.harman.com";
 private WebDriver driver;
 private WebDriverWait wait;

 @FindBy(css = "a#navlink-_l2")
 private WebElement solutionsDropdown;

 @FindBy(css = "a[href='/automotive']")
 private WebElement automotiveOption;

 public HarmanHomePage(WebDriver driver) {
 super(driver);
 this.driver = driver;
 PageFactory.initElements(driver, this);
 this.wait = new WebDriverWait(driver, 10);
 }

 public void open() {
 driver.get(url);
 }

 public void clickSolutionsDropdown() {
 wait.until(ExpectedConditions.elementToBeClickable(solutionsDropdown));
 solutionsDropdown.click();
 }

 public void clickAutomotiveOption() {
 wait.until(ExpectedConditions.visibilityOf(automotiveOption));
 automotiveOption.click();
 }

 public boolean isOptionVisible(WebElement option) {
 wait.until(ExpectedConditions.visibilityOf(option));
 return option.isDisplayed();
 }

}
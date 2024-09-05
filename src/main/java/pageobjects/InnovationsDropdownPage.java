package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnovationsDropdownPage {

  private WebDriver driver;

  @FindBy(id = "innovations-dropdown")
  private WebElement innovationsDropdown;

  public InnovationsDropdownPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void clickInnovationsDropdown() {
    innovationsDropdown.click();
  }

  public boolean isDropdownExpanded() {
    return innovationsDropdown.isDisplayed();
  }

  // Additional methods for interacting with the Innovations dropdown
}
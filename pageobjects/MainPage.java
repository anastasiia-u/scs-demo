public class MainPage {

    @FindBy(how = How.ID, using = "innovations-dropdown")
    private WebElement innovationsDropdown;

    @FindBy(how = How.CLASS_NAME, using = "dropdown-options")
    private List<WebElement> dropdownOptions;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() {
        driver.get("https://example.com");
    }

    public WebElement getInnovationsDropdown() {
        return innovationsDropdown;
    }

    public List<WebElement> getDropdownOptions() {
        return dropdownOptions;
    }

    public void selectDropdownOption(String option) {
        // Logic to click on a specific option
    }

    public boolean isCorrectSectionDisplayed() {
        // Logic to verify if the correct section is displayed
        return true;
    }

    public void clickOutsideDropdown() {
        // Logic to click outside the dropdown to close it
    }

    public void clickOtherNavigationItem() {
        // Logic to click on another navigation item
    }

    public boolean isDropdownDisplayed() {
        // Logic to check if the dropdown is displayed
        return false;
    }
}

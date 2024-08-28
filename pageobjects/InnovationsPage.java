public class InnovationsPage {

    @FindBy(id = "nav-innovations")
    private WebElement innovationsDropdown;

    @FindBy(xpath = "//a[contains(text(), 'Automotive')]")
    private WebElement automotiveOption;

    // Other options elements

    public InnovationsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void open() {
        // Code to open the homepage
    }

    public WebElement getInnovationsDropdown() {
        return innovationsDropdown;
    }

    public void clickAutomotiveOption() {
        automotiveOption.click();
    }

    // Methods for other interactions
}
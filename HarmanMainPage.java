public class HarmanMainPage extends BasePage {

    @FindBy(id = 'innovations-dropdown')
    private WebElement innovationsDropdown;

    @FindBy(xpath = '//a[text()=\'Automotive\']')
    private WebElement automotiveOption;

    @FindBy(xpath = '//a[text()=\'Lifestyle\']')
    private WebElement lifestyleOption;

    @FindBy(xpath = '//a[text()=\'Consumer\']')
    private WebElement consumerOption;

    @FindBy(xpath = '//a[text()=\'Professional\']')
    private WebElement professionalOption;

    @FindBy(xpath = '//a[text()=\'Digital Transformation Solutions\']')
    private WebElement digitalTransformationSolutionsOption;

    public HarmanMainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        driver.get('https://www.harman.com');
    }

    public void clickInnovationsDropdown() {
        innovationsDropdown.click();
    }

    public boolean isDropdownDisplayed() {
        return innovationsDropdown.isDisplayed();
    }

    public void clickOption(String optionName) {
        switch (optionName) {
            case 'Automotive':
                automotiveOption.click();
                break;
            case 'Lifestyle':
                lifestyleOption.click();
                break;
            case 'Consumer':
                consumerOption.click();
                break;
            case 'Professional':
                professionalOption.click();
                break;
            case 'Digital Transformation Solutions':
                digitalTransformationSolutionsOption.click();
                break;
            default: 
                throw new IllegalArgumentException('Invalid option: ' + optionName);
        }
    }

    public boolean isOptionVisible(String optionName) {
        WebElement option;
        switch (optionName) {
            case 'Automotive':
                option = automotiveOption;
                break;
            case 'Lifestyle':
                option = lifestyleOption;
                break;
            case 'Consumer':
                option = consumerOption;
                break;
            case 'Professional':
                option = professionalOption;
                break;
            case 'Digital Transformation Solutions':
                option = digitalTransformationSolutionsOption;
                break;
            default: 
                throw new IllegalArgumentException('Invalid option: ' + optionName);
        }
        return option.isDisplayed();
    }
}

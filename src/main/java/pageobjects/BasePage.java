package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.Browser;


public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Browser.getDriver(), this);
    }

    public void open(String url){
        Browser.getDriver().get(url);
    }

    public WebDriver getDriver() {
        return Browser.getDriver();
    }   
}

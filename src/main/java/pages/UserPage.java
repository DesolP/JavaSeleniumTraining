package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {
    private By pageField = By.cssSelector("body > h1");
    WebDriver driver;

    public UserPage(WebDriver driver){
        this.driver = driver;
    }

    public String returnPageText(){
        return driver.findElement(pageField).getText();
    }

}

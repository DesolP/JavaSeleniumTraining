package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private By flashField = By.id("flash");
    WebDriver driver;

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean checkVisibilityOfFlashField(){
        return driver.findElement(flashField).isDisplayed();
    }

}

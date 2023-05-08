package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private By iFrame = By.cssSelector("#content > div > ul > li:nth-child(2) > a");
    WebDriver driver;
    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public IFramePage clickIFrameButton(){
        driver.findElement(iFrame).click();
        return new IFramePage(driver);
    }

}

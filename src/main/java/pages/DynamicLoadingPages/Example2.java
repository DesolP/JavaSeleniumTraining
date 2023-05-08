package pages.DynamicLoadingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example2 {
    private By startButton = By.cssSelector("#start > button");
    private By finishText = By.cssSelector("#finish > h4");
    WebDriver driver;

    public Example2(WebDriver driver){
        this.driver = driver;
    }
    public void waitToLoadElement(){
        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishText));
    }
    public String getElementText(){
        return  driver.findElement(finishText).getText();
    }


    public void pressStartButton(){
        driver.findElement(startButton).click();
    }

}

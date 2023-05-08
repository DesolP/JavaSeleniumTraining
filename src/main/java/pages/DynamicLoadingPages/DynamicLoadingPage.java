package pages.DynamicLoadingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private By firstExample = By.cssSelector("#content > div > a:nth-child(5)");
    private By secondExample = By.cssSelector("#content > div > a:nth-child(8)");
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public Example1 selectExample1(){
        driver.findElement(firstExample).click();
        return new Example1(driver);
    }
    public Example2 selectExample2(){
        driver.findElement(secondExample).click();
        return new Example2(driver);
    }

}

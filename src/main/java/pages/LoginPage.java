package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.nio.file.Watchable;

public class LoginPage {
    private By loginPageText = By.cssSelector("#content > div > h2");
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By incorrectPasswordFlash = By.cssSelector("#flash");
    private By loginButton = By.cssSelector("#login > button");
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.findElement(loginPageText).getText();
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public boolean checkIncorrectPassField(){
        Duration duration = Duration.ofSeconds(5);
       WebDriverWait wait = new WebDriverWait(driver, duration);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(incorrectPasswordFlash));
        }catch(NoSuchElementException e){
            System.out.println(e);
            return false;
        }
      return  driver.findElement(incorrectPasswordFlash).isDisplayed();
    }

    public SecureAreaPage reachSecureAreaPage(){
        return new SecureAreaPage(driver);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();

    }

}

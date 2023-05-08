package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {

    private By parentObject = By.cssSelector("#content > div");
    private By hiddentText = By.tagName("h5");

    WebDriver driver;

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }




    public boolean checkIfTextAppears(int index){
        WebElement selectedFigure = hoverOverFigure(index);
        WebElement hiddenText = selectedFigure.findElement(By.tagName("h5"));
        if(hiddenText.isDisplayed()){
            return true;
        }else  return false;
    }
    public UserPage clickHiddenLink(int index){
        WebElement selectedFigure = hoverOverFigure(index);
        selectedFigure.findElement(By.tagName("a")).click();
        return new UserPage(driver);
    }


    private WebElement hoverOverFigure(int index){
        WebElement selectedFigure = getFigures().get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedFigure).perform();
        return selectedFigure;
    }

    private List<WebElement> getFigures(){
        WebElement parentElement = driver.findElement(parentObject);
        List<WebElement> figuresList =  parentElement.findElements(By.className("figure"));
        System.out.println("Found " + figuresList.size() + " figures");
        return figuresList;
    }




}

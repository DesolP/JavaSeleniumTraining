package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {
    private By checkbox1 = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    private By checkbox2 = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");

    WebDriver driver;

    public CheckBoxesPage(WebDriver driver){
        this.driver = driver;
    }

    public void setCheckbox()  {
        driver.findElement(checkbox1).click();

    }
    public boolean getCheckboxState(){
        return driver.findElement(checkbox1).isEnabled();
    }

}

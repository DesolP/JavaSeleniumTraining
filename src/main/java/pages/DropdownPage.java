package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    private By dropdown = By.id("dropdown");
    WebDriver driver;

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }


    public void selectDropdownOption(int index){
        Select dropdownElement = selectDropdown();
        dropdownElement.selectByIndex(index);
    }
    public String getDropdownElementText(){
        Select dropdownElement = selectDropdown();
        return dropdownElement.getFirstSelectedOption().getText();
    }




    private Select selectDropdown(){
        return new Select(driver.findElement(dropdown));
    }
}

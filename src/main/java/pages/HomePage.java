package pages;

import net.bytebuddy.utility.JavaConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.DynamicLoadingPages.DynamicLoadingPage;

public class HomePage {
WebDriver driver;
    private By loginPageButton = By.linkText("Form Authentication");
    private By checkboxPageButton = By.linkText("Checkboxes");
    private By dropdownPageButton = By.linkText("Dropdown");
    private By dynamicLoadingPageButton = By.linkText("Dynamic Loading");
    private By framesPageButton = By.linkText("Frames");
    private By hoversPageButton = By.linkText("Hovers");
    private By jQuerryMenusButton = By.linkText("JQuery UI Menus");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private void clickButton(By button){
        driver.findElement(button).click();
    }

    public LoginPage openLoginPage(){
        clickButton(loginPageButton);
        return new LoginPage(driver);
    }

    public CheckBoxesPage openCheckboxPage(){
        clickButton(checkboxPageButton);
        return new CheckBoxesPage(driver);

    }

    public DropdownPage openDropdownPage(){
        clickButton(dropdownPageButton);
        return new DropdownPage(driver);
    }
    public DynamicLoadingPage openDynamicLoadingPage(){
        clickButton(dynamicLoadingPageButton);
        return new DynamicLoadingPage(driver);
    }

    public FramesPage openFramesPage(){
        clickButton(framesPageButton);
        return new FramesPage(driver);
    }
    public HoversPage openHoversPage(){
        clickButton(hoversPageButton);
        return new HoversPage(driver);
    }

    public JQuerryMenusPage openJQuerryMenuPage(){
        clickButton(jQuerryMenusButton);
        return new JQuerryMenusPage(driver);
    }


}

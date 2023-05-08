package pages;

import org.openqa.selenium.*;

public class IFramePage {
    private By textEditIFrame = By.id("mce_0_ifr");
    private By textField = By.id("tinymce");
    private By boldText = By.cssSelector("#content > div > div > div.tox-editor-container >" +
            " div.tox-editor-header > div.tox-toolbar-overlord > div > div:nth-child(3) > " +
            "button:nth-child(1) > span > svg");
    private By italicText = By.cssSelector("#content > div > div > div.tox-editor-container >" +
            " div.tox-editor-header > div.tox-toolbar-overlord >" +
            " div > div:nth-child(3) > button:nth-child(2) > span > svg");
    private By child = By.tagName("strong");
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public IFramePage(WebDriver driver){
        this.driver = driver;
    }

    public void insertText(String text){
        driver.findElement(textField).sendKeys(text);
    }

    public void boldText(){
        driver.findElement(boldText).click();
    }
    public void italicText(){
        driver.findElement(italicText).click();
    }

    public void clearTextField(){
        driver.findElement(textField).clear();
    }

    public void switchFrame(){
        driver.switchTo().frame(driver.findElement(textEditIFrame));
    }
    public void switchtoParentFrame(){
        driver.switchTo().parentFrame();
    }

    public boolean checkIfTextModified(String text, String attribute){
        String modification = "none";
        if(attribute.equals("bolded")){
            modification = "strong";
        }else if(attribute.equals("italic")){
            modification = "em";
        }
        WebElement childElement = driver.findElement(textField);
        WebElement searchedElement = driver.findElement(By.id("tinymce")).findElement(By.tagName(modification));
        if(searchedElement.isDisplayed() && searchedElement.getText().equals(text)){
            return true;
        }else return false;


    }

}

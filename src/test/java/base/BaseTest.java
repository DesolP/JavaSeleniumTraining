package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTest {
    private final WebDriver driver = new ChromeDriver();
    protected  HomePage homePage;
    @BeforeClass
    public  void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
    }

    @BeforeMethod
    public void preparePage(){
        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }


    


    @AfterClass
    public  void tearDown(){
        driver.close();
    }

}





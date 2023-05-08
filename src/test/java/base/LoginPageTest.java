package base;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginPageTest extends  BaseTest{

    @Test
    public void testLoginPageText(){
        LoginPage loginPage = homePage.openLoginPage();
        Assert.assertEquals(loginPage.getPageTitle(),"Login Page");
    }
    @Test
    public void testIncorrectCredentials(){
        LoginPage loginPage = setUsernameAndPassword("tomsmoth", "IncorrectPassword");
        assert loginPage.checkIncorrectPassField();

    }
    @Test
    public void testCorrectCredentials(){
        LoginPage loginPage = setUsernameAndPassword("tomsmith ", "SuperSecretPassword!  ");
        SecureAreaPage secureAreaPage = loginPage.reachSecureAreaPage();
        assert secureAreaPage.checkVisibilityOfFlashField();
    }



    private void setUsername(LoginPage loginPage, String username){
        loginPage.setUsername(username);
    }
    private void setPassword(LoginPage loginPage, String password){
        loginPage.setPassword(password);
    }
    private LoginPage setUsernameAndPassword(String username, String password){
        LoginPage loginPage = homePage.openLoginPage();
        setUsername(loginPage, username);
        setPassword(loginPage, password);
        loginPage.clickLoginButton();
        return loginPage;
    }

}

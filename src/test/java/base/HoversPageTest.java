package base;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;
import pages.UserPage;

public class HoversPageTest extends BaseTest{

    @Test
    public void checkIfUser1TextAppears(){
        HoversPage hoversPage = homePage.openHoversPage();
        assert hoversPage.checkIfTextAppears(0);
    }
    @Test
    public void checkUserNamePageText(){
        HoversPage hoversPage = homePage.openHoversPage();
        UserPage userPage = hoversPage.clickHiddenLink(0);
        Assert.assertEquals(userPage.returnPageText(),"Not Found");
    }

}

package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPages.DynamicLoadingPage;
import pages.DynamicLoadingPages.Example1;
import pages.DynamicLoadingPages.Example2;

public class DynamicLoadingPagesTest extends BaseTest{

    @Test
    public void testExample1(){
        DynamicLoadingPage dynamicLoadingPage = homePage.openDynamicLoadingPage();
        Example1 example1 = dynamicLoadingPage.selectExample1();
        example1.pressStartButton();
        example1.waitToLoadElement();
        Assert.assertEquals(example1.getElementText(), "Hello World!");
    }
    @Test
    public void testExample2(){
        DynamicLoadingPage dynamicLoadingPage = homePage.openDynamicLoadingPage();
        Example2 example2 = dynamicLoadingPage.selectExample2();
        example2.pressStartButton();
        example2.waitToLoadElement();
        Assert.assertEquals(example2.getElementText(), "Hello World!");
    }

}

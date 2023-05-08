package base;

import org.testng.annotations.Test;
import pages.FramesPage;
import pages.IFramePage;

public class IFramePageTest extends  BaseTest {


    @Test
    public void testIFrame(){
        IFramePage iFramePage = reachIFramePage();
        iFramePage.switchFrame();
        iFramePage.clearTextField();
        iFramePage.insertText("Bababibababa");

    }

    @Test
    public void testBoldedText(){
        IFramePage iFramePage = reachIFramePage();
        iFramePage.switchFrame();
        iFramePage.clearTextField();
        iFramePage.switchtoParentFrame();
        iFramePage.boldText();
        iFramePage.switchFrame();
        iFramePage.insertText("Inserted text");
        assert iFramePage.checkIfTextModified("Inserted text", "bolded");
    }

    @Test
    public void testItalicText(){
        IFramePage iFramePage = reachIFramePage();
        iFramePage.switchFrame();
        iFramePage.clearTextField();
        iFramePage.switchtoParentFrame();
        iFramePage.italicText();
        iFramePage.switchFrame();
        iFramePage.insertText("Inserted text");
        assert iFramePage.checkIfTextModified("Inserted text", "italic");
    }


    public IFramePage reachIFramePage(){
        FramesPage framesPage = homePage.openFramesPage();
        return framesPage.clickIFrameButton();
    }

}

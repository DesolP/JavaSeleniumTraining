package base;

import org.testng.annotations.Test;
import pages.CheckBoxesPage;

public class CheckBoxPageTest extends  BaseTest{
    /**
     * try to check checkbox1 and then get its state to verify if it can be checked correctly.
     */
    @Test
    public void testCheckBox1(){
        CheckBoxesPage checkBoxesPage = homePage.openCheckboxPage();
        checkBoxesPage.setCheckbox();
        assert checkBoxesPage.getCheckboxState();
    }
}

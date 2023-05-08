package base;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownPageTest extends  BaseTest{

    @Test
    public void testDropdown(){
       DropdownPage dropdownPage =  homePage.openDropdownPage();
       Assert.assertEquals(dropdownPage.getDropdownElementText(),"Please select an option");
       dropdownPage.selectDropdownOption(1);
       Assert.assertEquals(dropdownPage.getDropdownElementText(), "Option 1");
       dropdownPage.selectDropdownOption(2);
       Assert.assertEquals(dropdownPage.getDropdownElementText(), "Option 2");
       try {
           dropdownPage.selectDropdownOption(0);
       }catch(UnsupportedOperationException e){
           assert true;
       }


    }



}

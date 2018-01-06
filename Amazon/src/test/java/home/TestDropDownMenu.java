package home;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropDownMenu extends DropDownMenu {
    @Test
    public void menus(){
        List<String> expectedMenu = getMenus();
        List<String> listOfMenu = getMenus();
        Assert.assertEquals(listOfMenu, expectedMenu);
        System.out.println("Drop down meny test passed");
    }
}

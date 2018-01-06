package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchMenu extends HomePage{

    @Test
    public void test1(){
        searchInputBox();
        System.out.println("Search Menu test passes:");
    }
}

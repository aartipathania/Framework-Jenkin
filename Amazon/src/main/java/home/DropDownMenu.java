package home;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu extends CommonAPI {

    public List<String> getMenus(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#searchDropdownBox option");
        return items;
    }
}

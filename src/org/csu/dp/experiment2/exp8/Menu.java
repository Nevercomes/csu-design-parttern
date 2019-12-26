package org.csu.dp.experiment2.exp8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/27
 */
public class Menu {

    private List<MenuItem> menuItemList = new ArrayList<MenuItem>();

    public void add(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }

    public void remove(MenuItem menuItem) {
        menuItemList.remove(menuItem);
    }

    public MenuItem getMenuItem(int i) {
        return menuItemList.get(i);
    }

}

package org.csu.dp.experiment2.exp8;

/**
 * Created by sun on 2019/12/26
 */
public class Client {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem menuItem1 = new MenuItem();
        Command command1 = new CreateCommand();
        menuItem1.setCommand(command1);
        menu.add(menuItem1);
        menu.getMenuItem(1).click();
    }

}

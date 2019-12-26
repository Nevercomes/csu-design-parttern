package org.csu.dp.experiment2.exp8;

/**
 * Created by sun on 2019/12/27
 */
public class MenuItem {

    private Command command;

    public MenuItem() {
    }

    public MenuItem(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

}

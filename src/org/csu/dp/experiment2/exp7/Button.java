package org.csu.dp.experiment2.exp7;

/**
 * Created by sun on 2019/12/26
 */
public class Button {

    private Command command;

    public Button() {
    }

    public Button(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }

}

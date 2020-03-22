package org.csu.dp.timer;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public abstract class Button {

    protected Command command;

    public abstract void handlePress();

    public void setCommand(Command command) {
        this.command = command;
    }
}

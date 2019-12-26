package org.csu.dp.experiment2.exp7;

/**
 * Created by sun on 2019/12/26
 */
public class Client {

    public static void main(String[] args) {
        ControlBoard controlBoard = new ControlBoard();
        Button button1 = new Button();
        Command command1 = new LightCommand1();
        button1.setCommand(command1);
        controlBoard.add(button1);
        Button button2 = new Button(new LightCommand2());
        controlBoard.add(button2);

        controlBoard.getButton(1).invoke();
        controlBoard.getButton(1).invoke();
    }

}

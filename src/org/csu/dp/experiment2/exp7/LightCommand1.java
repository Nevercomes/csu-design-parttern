package org.csu.dp.experiment2.exp7;

/**
 * Created by sun on 2019/12/26
 */
public class LightCommand1 implements Command {

    private static RoomLight1 roomLight1 = new RoomLight1();

    public void execute() {
        roomLight1.change();
    }
}

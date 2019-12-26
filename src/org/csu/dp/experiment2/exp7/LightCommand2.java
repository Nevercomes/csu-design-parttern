package org.csu.dp.experiment2.exp7;

/**
 * Created by sun on 2019/12/26
 */
public class LightCommand2 implements Command{

    private static RoomLight2 roomLight2 = new RoomLight2();

    public void execute() {
        roomLight2.change();
    }
}

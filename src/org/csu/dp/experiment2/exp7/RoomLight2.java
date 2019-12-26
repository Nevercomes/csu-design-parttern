package org.csu.dp.experiment2.exp7;

/**
 * Created by sun on 2019/12/26
 */
public class RoomLight2 extends AbstractRoomLight{

    public void change() {
        if (this.lightSwitch) {
            System.out.println("room1 light off");
        } else {
            System.out.println("room1 light on");
        }
        this.lightSwitch = !this.lightSwitch;
    }

}

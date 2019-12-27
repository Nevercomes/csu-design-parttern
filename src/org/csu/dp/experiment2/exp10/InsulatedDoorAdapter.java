package org.csu.dp.experiment2.exp10;

/**
 * Created by sun on 2019/12/27
 */
public class InsulatedDoorAdapter extends ResponseDevice {

    private InsulatedDoor insulatedDoor;

    public void response() {
        insulatedDoor = new InsulatedDoor();
        insulatedDoor.close();
    }
}

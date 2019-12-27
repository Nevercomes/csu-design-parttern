package org.csu.dp.experiment2.exp10;

/**
 * Created by sun on 2019/12/27
 */
public class SecurityDoorAdapter extends ResponseDevice {

    private SecurityDoor securityDoor;

    public void response() {
        securityDoor = new SecurityDoor();
        securityDoor.open();
    }
}

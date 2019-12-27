package org.csu.dp.experiment2.exp10;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/27
 */
public class Thermosensor {

    private List<ResponseDevice> responseDeviceList = new ArrayList<ResponseDevice>();

    public void add(ResponseDevice responseDevice) {
        responseDeviceList.add(responseDevice);
    }

    public void remove(ResponseDevice responseDevice) {
        responseDeviceList.remove(responseDevice);
    }

    private void boardSignal() {
        for (ResponseDevice responseDevice : responseDeviceList) {
            responseDevice.response();
        }
    }

    public void thermoUp() {
        System.out.println("温度上升");
        boardSignal();
    }

}

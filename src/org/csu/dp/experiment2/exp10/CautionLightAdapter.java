package org.csu.dp.experiment2.exp10;

/**
 * Created by sun on 2019/12/27
 */
public class CautionLightAdapter extends ResponseDevice {

    private CautionLight cautionLight;

    public void response() {
        cautionLight = new CautionLight();
        cautionLight.flicker();
    }
}

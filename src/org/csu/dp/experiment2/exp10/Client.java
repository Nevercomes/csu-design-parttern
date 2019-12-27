package org.csu.dp.experiment2.exp10;

/**
 * Created by sun on 2019/12/27
 */
public class Client {

    public static void main(String[] args) {
        Thermosensor thermosensor = new Thermosensor();
        ResponseDevice annunciator = new AnnunciatorAdapter();
        ResponseDevice cautionLight = new CautionLightAdapter();
        thermosensor.add(annunciator);
        thermosensor.add(cautionLight);
        thermosensor.thermoUp();
    }

}

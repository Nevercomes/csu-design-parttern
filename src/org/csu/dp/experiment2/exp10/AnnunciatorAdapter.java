package org.csu.dp.experiment2.exp10;

/**
 * Created by sun on 2019/12/27
 */
public class AnnunciatorAdapter  extends ResponseDevice{

    private Annunciator annunciator;

    public void response() {
        annunciator = new Annunciator();
        annunciator.alarm();
    }
}

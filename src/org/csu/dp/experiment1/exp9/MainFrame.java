package org.csu.dp.experiment1.exp9;

/**
 * Created by sun on 2019/12/2
 */
public class MainFrame {

    private SubFrame subFrame = null;

    public MainFrame() {
        subFrame = SubFrame.getSubFrame();
    }

    public SubFrame getSubFrame() {
        return subFrame;
    }
}

package org.csu.dp.exp9;

/**
 * Created by sun on 2019/12/2
 */
public class SubFrame {

    private SubFrame() {

    }

    private static class HolderClass {
        private final static SubFrame subFrame = new SubFrame();
    }

    public static SubFrame getSubFrame() {
        return HolderClass.subFrame;
    }

}

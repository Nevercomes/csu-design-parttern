package org.csu.dp.exp7;

/**
 * Created by sun on 2019/11/27
 */
public class ResumeWithoutImage extends ResumeTemplate implements Cloneable {
    public ResumeTemplate customClone() {
        ResumeTemplate template = null;
        try {
            template = (ResumeTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return template;
    }
}

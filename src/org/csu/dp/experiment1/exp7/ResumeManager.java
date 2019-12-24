package org.csu.dp.experiment1.exp7;

import java.util.Hashtable;

/**
 * Created by sun on 2019/11/27
 */
public class ResumeManager {

    private Hashtable resumeTable = new Hashtable();

    public ResumeManager() {
        resumeTable.put("with", new ResumeWithImage());
        resumeTable.put("without", new ResumeWithoutImage());
    }

    public void add(String key, ResumeTemplate template) {
        resumeTable.put(key, template);
    }

    public ResumeTemplate get(String key) {
        ResumeTemplate clone = null;
        clone = ((ResumeTemplate)resumeTable.get(key)).customClone();
        return clone;
    }
}

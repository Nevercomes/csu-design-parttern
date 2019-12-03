package org.csu.dp.exp7;

import java.io.*;

/**
 * Created by sun on 2019/11/27
 */
public class ResumeWithImage extends ResumeTemplate implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    public ResumeTemplate customClone() {
        ResumeTemplate template = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(baos);
            oo.writeObject(this);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bais);
            template = (ResumeTemplate) oi.readObject();
            oi.close();
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return template;
    }
}

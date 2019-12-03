package org.csu.dp.exp4;

/**
 * Created by sun on 2019/11/26
 */
public class POP3Connection implements Connection {
    @Override
    public void transport() {
        System.out.println("POP3 transport");
    }
}

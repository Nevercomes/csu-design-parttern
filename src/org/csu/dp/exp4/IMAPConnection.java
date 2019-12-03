package org.csu.dp.exp4;

/**
 * Created by sun on 2019/11/26
 */
public class IMAPConnection implements Connection {

    @Override
    public void transport() {
        System.out.println("IMAP transport");
    }
}

package org.csu.dp.experiment1.exp4;

/**
 * Created by sun on 2019/11/26
 */
public class POP3ConnectionFactory implements ConnectionFactory {
    @Override
    public Connection getConnection() {
        return new POP3Connection();
    }
}

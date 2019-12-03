package org.csu.dp.exp4;

/**
 * Created by sun on 2019/11/26
 */
public class IMAPConnectionFactory implements ConnectionFactory {

    public Connection getConnection() {
        return new IMAPConnection();
    }
}

package org.csu.dp.exp6;

/**
 * Created by sun on 2019/11/27
 */
public class MySQLFactory implements DBFactory {
    public Connect getConnect() {
        return new MySQLConnect();
    }

    public Statement getStatement() {
        return new MySQLStatement();
    }
}

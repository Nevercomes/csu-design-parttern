package org.csu.dp.exp6;

/**
 * Created by sun on 2019/11/27
 */
public class OracleFactory implements DBFactory {
    public Connect getConnect() {
        return new OracleConnect();
    }

    public Statement getStatement() {
        return new OracleStatement();
    }

}

package org.csu.dp.experiment2.exp12;

/**
 * Created by sun on 2019/12/27
 */
public class Client {

    public static void main(String[] args) {
        DataOperateProcess dataOperateProcess;
        // 可以用XML反射
        dataOperateProcess = new DTAdapter();
        dataOperateProcess.process();
    }

}

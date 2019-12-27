package org.csu.dp.experiment2.exp12;

/**
 * Created by sun on 2019/12/27
 */
public abstract class DataOperateProcess {

    protected String data;

    public void process() {
        readData();
        transferData();
        classify();
        displayData();
    }

    public void readData() {
        System.out.println("read data");
        this.data = "data";
    }

    public void transferData() {
        System.out.println("transfer data");
        this.data = "transferred data";
    }

    public abstract void classify();

    public void displayData() {
        System.out.println("display data " + this.data);
    }

}

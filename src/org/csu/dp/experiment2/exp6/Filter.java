package org.csu.dp.experiment2.exp6;

/**
 * Created by sun on 2019/12/24
 */
public abstract class Filter {

    protected Filter successor;

    public void setSuccessor(Filter successor) {
        this.successor = successor;
    }

    public abstract void filterData(String data);

}

package org.csu.dp.experiment2.exp9;

/**
 * Created by sun on 2019/12/27
 */
public abstract class StatisticArea {

    protected EditArea editArea;

    public StatisticArea() {
    }

    public StatisticArea(EditArea editArea) {
        this.editArea = editArea;
    }

    public void setEditArea(EditArea editArea) {
        this.editArea = editArea;
    }

    public abstract void execute();

}

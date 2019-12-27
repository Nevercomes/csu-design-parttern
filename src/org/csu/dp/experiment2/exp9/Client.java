package org.csu.dp.experiment2.exp9;

/**
 * Created by sun on 2019/12/27
 */
public class Client {

    public static void main(String[] args) {
        EditArea editArea = new EditArea();
        StatisticArea sumArea = new SumArea();
        StatisticArea countArea = new CountArea();
        StatisticArea sortArea = new SortArea();
        sumArea.setEditArea(editArea);
        countArea.setEditArea(editArea);
        sortArea.setEditArea(editArea);

        editArea.add(sumArea);
        editArea.add(sortArea);
        editArea.add(countArea);

        editArea.input("hello");
        editArea.input("world");
        editArea.delete();
    }

}

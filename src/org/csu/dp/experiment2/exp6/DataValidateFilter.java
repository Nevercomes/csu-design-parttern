package org.csu.dp.experiment2.exp6;

/**
 * Created by sun on 2019/12/24
 */
public class DataValidateFilter extends Filter {
    public void filterData(String data) {
        if (data.contains("valid")) {
            System.out.println("data is valid send request");
        } else {
            this.successor.filterData(data);
        }
    }
}

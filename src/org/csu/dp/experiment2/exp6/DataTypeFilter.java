package org.csu.dp.experiment2.exp6;

/**
 * Created by sun on 2019/12/24
 */
public class DataTypeFilter extends Filter {
    public void filterData(String data) {
        if (data.contains("double")) {
            data = data.replace("double", "string");
        }
        this.successor.filterData(data);
    }
}

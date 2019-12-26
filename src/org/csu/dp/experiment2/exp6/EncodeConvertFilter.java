package org.csu.dp.experiment2.exp6;

/**
 * Created by sun on 2019/12/24
 */
public class EncodeConvertFilter extends Filter {

    public void filterData(String data) {
        if (data.contains("gbk")) {
            data = data.replace("gbk", "utf-8");
        }
        this.successor.filterData(data);
    }
}

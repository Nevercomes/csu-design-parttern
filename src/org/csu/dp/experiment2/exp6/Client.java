package org.csu.dp.experiment2.exp6;

/**
 * Created by sun on 2019/12/24
 */
public class Client {

    public static void main(String[] args) {
        Filter filter1 = new EncodeConvertFilter();
        Filter filter2 = new DataTypeFilter();
        Filter filter3 = new DataValidateFilter();
        Filter filter4 = new InValidDataLogFilter();

        filter1.setSuccessor(filter2);
        filter2.setSuccessor(filter3);
        filter3.setSuccessor(filter4);

        String data = "gbk-double-valid";
        String data1 = "gbk-int-invalid";

        filter1.filterData(data);
        filter1.filterData(data1);

    }

}

package org.csu.dp.experiment2.exp12;

/**
 * Created by sun on 2019/12/27
 */
public class KNNAdapter extends DataOperateProcess {

    private KNN knn;

    public void classify() {
        knn = new KNN();
        this.data = knn.classify(this.data);
    }
}

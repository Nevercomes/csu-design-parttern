package org.csu.dp.experiment2.exp12;

/**
 * Created by sun on 2019/12/27
 */
public class NBAdapter extends DataOperateProcess{

    private NaiveBayes naiveBayes;

    public void classify() {
        naiveBayes = new NaiveBayes();
        this.data = naiveBayes.classify(this.data);
    }
}

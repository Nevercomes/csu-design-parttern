package org.csu.dp.experiment2.exp12;

/**
 * Created by sun on 2019/12/27
 */
public class DTAdapter extends DataOperateProcess {

    private DecisionTree decisionTree;

    public void classify() {
        decisionTree = new DecisionTree();
        this.data = decisionTree.classify(this.data);
    }
}

package org.csu.dp.experiment2.exp2;

/**
 * Created by sun on 2019/12/24
 */
public class Pyramid extends AbstractBlock {
    public void color() {
        System.out.println("Pyramid get color");
    }

    public void add(AbstractBlock abstractBlock) {
        System.out.println("Pyramid has not method of add");
    }

    public void remove(AbstractBlock abstractBlock) {
        System.out.println("Pyramid has not method of remove");
    }

    public AbstractBlock getChild(int i) {
        System.out.println("Pyramid has not method of getChild");
        return null;
    }
}

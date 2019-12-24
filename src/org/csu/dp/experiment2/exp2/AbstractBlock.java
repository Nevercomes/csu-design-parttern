package org.csu.dp.experiment2.exp2;

/**
 * Created by sun on 2019/12/24
 */
public abstract class AbstractBlock {

    public abstract void color();

    public abstract void add(AbstractBlock abstractBlock);

    public abstract void remove(AbstractBlock abstractBlock);

    public abstract AbstractBlock getChild(int i);

}

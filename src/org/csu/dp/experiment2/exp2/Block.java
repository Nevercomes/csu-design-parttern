package org.csu.dp.experiment2.exp2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/24
 */
public class Block extends AbstractBlock {

    private List<AbstractBlock> blockList = new ArrayList<AbstractBlock>();

    public void color() {
        for (AbstractBlock block : blockList) {
            block.color();
        }
    }

    public void add(AbstractBlock abstractBlock) {
        blockList.add(abstractBlock);
    }

    public void remove(AbstractBlock abstractBlock) {
        blockList.remove(abstractBlock);
    }

    public AbstractBlock getChild(int i) {
        return blockList.get(i);
    }
}

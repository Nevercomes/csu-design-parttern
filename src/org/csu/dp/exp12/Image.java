package org.csu.dp.exp12;

/**
 * Created by sun on 2019/12/3
 */
public abstract class Image {

    protected FilterAdder filterAdder;

    public void setFilter(FilterAdder filterAdder) {
        this.filterAdder = filterAdder;
    }

    public abstract void showImage();

}

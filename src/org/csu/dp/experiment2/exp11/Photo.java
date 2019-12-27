package org.csu.dp.experiment2.exp11;

/**
 * Created by sun on 2019/12/27
 */
public class Photo {

    private Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void addFilter() {
        filter.doFilter();
    }

}

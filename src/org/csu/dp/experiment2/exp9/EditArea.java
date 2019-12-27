package org.csu.dp.experiment2.exp9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/27
 */
public class EditArea {

    private String content = "";

    private List<StatisticArea> statisticAreaList = new ArrayList<StatisticArea>();

    public void add(StatisticArea statisticArea) {
        statisticAreaList.add(statisticArea);
    }

    public void remove(StatisticArea statisticArea) {
        statisticAreaList.remove(statisticArea);
    }

    public String getContent() {
        return content;
    }

    public void notifyStatistic() {
        for (StatisticArea statisticArea : statisticAreaList) {
            statisticArea.execute();
        }
    }

    public void input(String content) {
        this.content += content;
        this.notifyStatistic();
    }

    public void delete() {
        if (this.content != null && this.content.length() >= 1) {
            this.content = this.content.substring(0, this.content.length() - 1);
            this.notifyStatistic();
        }
    }

}

package org.csu.dp.timer;

import java.util.List;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class ReviewStorage {
    private int index = 0;
    private List<Integer> timeList;
    private Screen screen = TheWholeTimer.getInstance().getScreen();

    public void clearStorage() {
        timeList.clear();
        index = 0;
    }

    public void addStorage(Integer time) {
        // 若大于三则丢弃
        if (timeList.size() >= 3) {
            return;
        }
        timeList.add(time);
    }

    public void nextTime() {
        index++;
        if (index > 2) {
            index = 0;
        }
        showToScreen();
    }

    public void preTime() {
        index--;
        if (index < 0) {
            index = timeList.size() - 1;
        }
        showToScreen();
    }

    public void showToScreen() {
        if (timeList.size() == 0) {
            screen.setTime(0);
            screen.setNumber(0);
        } else {
            screen.setTime(timeList.get(index));
            screen.setNumber(index + 1);
        }
    }

    public Integer getSize() {
        return timeList.size();
    }

}

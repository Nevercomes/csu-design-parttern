package org.csu.dp.timer;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class NextCommand implements Command {
    public void action() {
        TheWholeTimer.getInstance().getReviewStorage().nextTime();
    }
}

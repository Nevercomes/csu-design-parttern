package org.csu.dp.timer;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class ClearCommand implements Command {
    public void action() {
        InnerTimer timer = TheWholeTimer.getInstance().getInnerTimer();
        timer.clear();
        TheWholeTimer.getInstance().getReviewStorage().clearStorage();
    }
}

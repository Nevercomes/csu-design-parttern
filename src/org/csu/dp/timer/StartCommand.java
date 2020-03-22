package org.csu.dp.timer;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class StartCommand implements Command {
    /**
     * 进行开始计时操作
     */
    public void action() {
        InnerTimer timer = TheWholeTimer.getInstance().getInnerTimer();
        timer.start();
        TheWholeTimer.getInstance().getReviewStorage().clearStorage();
    }
}

package org.csu.dp.timer;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class SaveCommand implements Command{
    public void action() {
        InnerTimer innerTimer = TheWholeTimer.getInstance().getInnerTimer();
        ReviewStorage reviewStorage = TheWholeTimer.getInstance().getReviewStorage();
        reviewStorage.addStorage(innerTimer.save());
        if (reviewStorage.getSize().equals(3)) {
            innerTimer.pause();
        }
    }
}

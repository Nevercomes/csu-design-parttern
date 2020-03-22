package org.csu.dp.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 表示计时状态,只维护计时的值
 * 单例维护
 * @author Sunss
 * @since 2020/3/22
 */
public class InnerTimer {
    private Timer timer;
    private Integer time;
    private Screen screen = TheWholeTimer.getInstance().getScreen();

    public void start() {
        if (timer != null) {
            timer.cancel();
            time = 0;
            screen.setTime(time);
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                time += 100;
                screen.setTime(time);
            }
        }, 0, 100);
    }

    public void clear() {
        if(timer != null) {
            time = 0;
            screen.setTime(time);
            timer.cancel();
            timer.purge();
        }
    }

    public void pause() {
        if(timer != null) {
            timer.cancel();
            screen.setTime(time);
        }
    }

    public Integer save() {
        return time;
    }

}

package org.csu.dp.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Screen是单例的，它保存全局的time和number数值
 *
 * @author Sunss
 * @since 2020/3/22
 */
public class Screen {

    private Integer time = 0;
    private Integer number = 0;
    private Integer mode;

    /**
     * 每隔0.01s对屏幕进行一次绘制
     * 仅对自身持有的time和number进行绘制，而无需考虑它们的改变
     */
    public void show() {
        // 对time进行显示上的转换，这里省略
        Timer draw = new Timer();
        draw.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(time);
                if (Global.REVIEW_MODE.equals(mode)) {
                    System.out.println(number);
                }
            }
        }, 0, 100);
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }
}

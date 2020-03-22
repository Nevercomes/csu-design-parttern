package org.csu.dp.timer;

import java.util.HashMap;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class ReviewCommand implements Command {
    public void action() {
        Screen screen = TheWholeTimer.getInstance().getScreen();
        HashMap<String, Button> buttons = TheWholeTimer.getInstance().getButtons();
        Button startBtn = buttons.get("startBtn");
        Button clearBtn = buttons.get("clearBtn");
        if (Global.TIMEING_MODE.equals(screen.getMode())) {
            screen.setMode(Global.REVIEW_MODE);
            startBtn.setCommand(new NextCommand());
            clearBtn.setCommand(new PreCommand());
            TheWholeTimer.getInstance().getReviewStorage().showToScreen();
        } else {
            screen.setMode(Global.TIMEING_MODE);
            startBtn.setCommand(new StartCommand());
            clearBtn.setCommand(new PreCommand());
        }
    }
}

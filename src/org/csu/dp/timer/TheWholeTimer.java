package org.csu.dp.timer;

import java.util.HashMap;

/**
 * @author Sunss
 * @since 2020/3/22
 */
public class TheWholeTimer {

    private Screen screen;
    private HashMap<String, Button> buttons;
    private InnerTimer innerTimer;
    private ReviewStorage reviewStorage;

    private TheWholeTimer() {
        this.screen = new Screen();
        Button startBtn = new StartButton();
        Button clearBtn = new ClearButton();
        Button saveBtn = new SaveButton();
        Button reviewBtn = new ReviewButton();
        Command startCommand = new StartCommand();
        Command clearCommand = new ClearCommand();
        Command saveCommand = new SaveCommand();
        Command reviewCommand = new ReviewCommand();
        saveBtn.setCommand(startCommand);
        clearBtn.setCommand(clearCommand);
        saveBtn.setCommand(saveCommand);
        reviewBtn.setCommand(reviewCommand);
        buttons.put("startBtn", startBtn);
        buttons.put("clearBtn", clearBtn);
        buttons.put("reviewBtn", reviewBtn);
        buttons.put("saveBtn", saveBtn);
        this.innerTimer = new InnerTimer();
        this.reviewStorage = new ReviewStorage();
    }

    private static class Holder {
        private static TheWholeTimer ins = new TheWholeTimer();
    }

    public static TheWholeTimer getInstance() {
        return Holder.ins;
    }

    public void handleButtonPress(String name) {
        Button button = buttons.get(name);
        if (button == null) {
            System.out.println("It's incredible");
        } else {
            button.handlePress();
        }
    }

    public Screen getScreen() {
        return screen;
    }

    public InnerTimer getInnerTimer() {
        return innerTimer;
    }

    public void setInnerTimer(InnerTimer innerTimer) {
        this.innerTimer = innerTimer;
    }

    public ReviewStorage getReviewStorage() {
        return reviewStorage;
    }

    public HashMap<String, Button> getButtons() {
        return buttons;
    }
}

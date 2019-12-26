package org.csu.dp.experiment2.exp7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/26
 */
public class ControlBoard {

    private List<Button> buttonList = new ArrayList<Button>();

    public void add(Button button) {
        buttonList.add(button);
    }

    public void remove(Button button) {
        buttonList.remove(button);
    }

    public Button getButton(int i) {
        return buttonList.get(i);
    }

}

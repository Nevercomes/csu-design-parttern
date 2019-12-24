package org.csu.dp.experiment1.exp5;

/**
 * Created by sun on 2019/11/26
 */
public class UnixComponentFactory implements ComponentFactory {
    public Button createButton() {
        return new UnixButton();
    }

    public Text createText() {
        return new UnixText();
    }
}

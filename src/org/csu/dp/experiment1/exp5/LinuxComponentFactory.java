package org.csu.dp.experiment1.exp5;

/**
 * Created by sun on 2019/11/26
 */
public class LinuxComponentFactory implements ComponentFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public Text createText() {
        return new LinuxText();
    }
}

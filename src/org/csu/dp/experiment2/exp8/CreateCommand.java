package org.csu.dp.experiment2.exp8;

/**
 * Created by sun on 2019/12/27
 */
public class CreateCommand implements Command {

    private BoardScreen boardScreen = new BoardScreen();

    public void execute() {
        boardScreen.create();
    }
}

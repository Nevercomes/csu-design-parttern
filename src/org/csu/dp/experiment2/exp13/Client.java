package org.csu.dp.experiment2.exp13;

/**
 * Created by sun on 2019/12/27
 */
public class Client {

    public static void main(String[] args) {
        GameManager gameManager = GameManager.getInstance();
        gameManager.adjustRole();
        gameManager.adjustScene();
        gameManager.adjustSound();
    }

}

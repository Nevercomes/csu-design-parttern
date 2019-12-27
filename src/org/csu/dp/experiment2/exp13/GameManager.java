package org.csu.dp.experiment2.exp13;

/**
 * Created by sun on 2019/12/27
 */
public class GameManager {

    private Role role = new Role();
    private Scene scene = new Scene();
    private Sound sound = new Sound();

    private GameManager() {

    }

    private static class HolderClass {
        private final static GameManager instance = new GameManager();
    }

    public static GameManager getInstance() {
        return HolderClass.instance;
    }

    public void adjustRole() {
        role.adjust();
    }

    public void adjustScene() {
        scene.adjust();
    }

    public void adjustSound() {
        sound.adjust();
    }

}

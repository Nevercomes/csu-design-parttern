package org.csu.dp.exp13new;

/**
 * Created by sun on 2019/12/3
 */
public class SceneDirector {

    private SceneBuilder sceneBuilder;

    public SceneDirector(SceneBuilder sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }

    public void setSceneBuilder(SceneBuilder sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }

    public Scene getScene() {
        sceneBuilder.buildMap();
        sceneBuilder.buildWeather();
        sceneBuilder.buildSound();
        return sceneBuilder.getScene();
    }

}

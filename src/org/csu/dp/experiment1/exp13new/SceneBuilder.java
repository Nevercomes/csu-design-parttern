package org.csu.dp.experiment1.exp13new;

/**
 * Created by sun on 2019/12/3
 */
public abstract class SceneBuilder {

    protected Scene scene = new Scene();

    public abstract void buildMap();

    public abstract void buildWeather();

    public abstract void buildSound();

    public Scene getScene() {
        return scene;
    }

}

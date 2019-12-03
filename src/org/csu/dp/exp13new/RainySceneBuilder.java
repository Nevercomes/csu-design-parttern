package org.csu.dp.exp13new;

/**
 * Created by sun on 2019/12/3
 */
public class RainySceneBuilder extends SceneBuilder {
    public void buildMap() {
        scene.setMap(new RainyMap());
    }

    public void buildWeather() {
        scene.setWeather(new RainyWeather());
    }

    public void buildSound() {
        scene.setSound(new SadSound());
    }
}

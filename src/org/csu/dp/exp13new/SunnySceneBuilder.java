package org.csu.dp.exp13new;

/**
 * Created by sun on 2019/12/3
 */
public class SunnySceneBuilder extends SceneBuilder {


    public void buildMap() {
        scene.setMap(new SunnyMap());
    }

    public void buildWeather() {
        scene.setWeather(new SunnyWeather());
    }

    public void buildSound() {
        scene.setSound(new HappySound());
    }
}

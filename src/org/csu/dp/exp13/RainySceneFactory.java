package org.csu.dp.exp13;

/**
 * Created by sun on 2019/12/3
 */
public class RainySceneFactory implements SceneFactory{

    public Map getMap() {
        return new RainyMap();
    }

    public Weather getWeather() {
        return new RainyWeather();
    }

    public Sound getSound() {
        return new SadSound();
    }

}

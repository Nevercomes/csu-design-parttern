package org.csu.dp.experiment1.exp13;

/**
 * Created by sun on 2019/12/3
 */
public class SunnySceneFactory implements SceneFactory {
    public Map getMap() {
        return new SunnyMap();
    }

    public Weather getWeather() {
        return new SunnyWeather();
    }

    public Sound getSound() {
        return new HappySound();
    }
}

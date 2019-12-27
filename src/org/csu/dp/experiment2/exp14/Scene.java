package org.csu.dp.experiment2.exp14;

/**
 * Created by sun on 2019/12/27
 */
public class Scene {

    private Rendering rendering;

    public void setRendering(Rendering rendering) {
        this.rendering = rendering;
    }

    public void rendering() {
        rendering.render();
    }
}

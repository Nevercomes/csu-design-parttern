package org.csu.dp.experiment2.exp14;

/**
 * Created by sun on 2019/12/27
 */
public class ThirdRenderAdapter implements Rendering {

    private ThirdRender thirdRender;

    public void render() {
        thirdRender = new ThirdRender();
        thirdRender.render();
    }
}

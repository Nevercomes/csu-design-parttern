package org.csu.dp.experiment2.exp14;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/12/27
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scene scene = new Scene();
        Rendering rendering;
        String configPath = "./config/config.xml";
        String className = XmlUtil.getText(XmlUtil.parseXml(configPath), "className");
        rendering = (Rendering) Class.forName(className).newInstance();
        scene.setRendering(rendering);
        scene.rendering();
    }

}

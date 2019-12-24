package org.csu.dp.experiment1.exp13new;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/12/3
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String configPath = "./config/config.xml";
        String builderName = XmlUtil.getText(XmlUtil.parseXml(configPath), "className");
        SceneBuilder builder = (SceneBuilder) Class.forName(builderName).newInstance();
        SceneDirector director = new SceneDirector(builder);
        Scene scene = director.getScene();
    }

}

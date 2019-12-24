package org.csu.dp.experiment1.exp12;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/12/3
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Image image;
        FilterAdder filterAdder;
        String configPath = "./config/config.xml";
        String imageName = XmlUtil.getText(XmlUtil.parseXml(configPath), "imageName");
        String filterAdderName = XmlUtil.getText(XmlUtil.parseXml(configPath), "filterAdderName");
        image = (Image) Class.forName(imageName).newInstance();
        filterAdder = (FilterAdder) Class.forName(filterAdderName).newInstance();
        image.setFilter(filterAdder);
        image.showImage();
    }

}

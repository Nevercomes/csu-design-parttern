package org.csu.dp.experiment2.exp4;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/12/24
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AbstractFacade facade;
        String configPath = "./config/config.xml";
        String facadeName = XmlUtil.getText(XmlUtil.parseXml(configPath), "xmlFacade");
        facade = (AbstractFacade) Class.forName(facadeName).newInstance();
        String path = "file.xml";
        facade.showReport(path);

    }

}

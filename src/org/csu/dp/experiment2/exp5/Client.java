package org.csu.dp.experiment2.exp5;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/12/24
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AbstractBusiness business;
        String configPath = "./config/config.xml";
        String businessController = XmlUtil.getText(XmlUtil.parseXml(configPath), "businessController");
        business = (AbstractBusiness) Class.forName(businessController).newInstance();
        business.doBusiness();
    }

}

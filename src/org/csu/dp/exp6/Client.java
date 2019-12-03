package org.csu.dp.exp6;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/11/27
 */
public class Client {

    public static void main(String[] args) {
        DBFactory factory;
        String configPath = "./config/config.xml";
        String factoryName = XmlUtil.getText(XmlUtil.parseXml(configPath), "factoryName");
        System.out.println(factoryName);
        try {
            factory = (DBFactory) Class.forName(factoryName).newInstance();
            factory.getConnect();
            factory.getStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}

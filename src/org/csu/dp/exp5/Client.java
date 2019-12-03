package org.csu.dp.exp5;

import org.csu.dp.common.XmlUtil;

/**
 * Created by sun on 2019/11/26
 */
public class Client {

    public static void main(String[] args) {
        ComponentFactory factory;
         String configPath = "D:\\Lovecode\\Java\\DesignPartternExp\\src\\org\\csu\\dp\\exp5\\config\\config.xml";
        String factoryName = XmlUtil.getText(XmlUtil.parseXml(configPath), "factoryName");
        System.out.println(factoryName);
    }

}
